package com.example.demosample2.service;

import com.example.demosample2.dataTransferObject.UserDTO;
import com.example.demosample2.model.User;
import com.example.demosample2.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional //do the data transactions in better way
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<UserDTO> getAllUsers(){
        List<User> userList=userRepo.findAll();//findall give the all data belongs to the table
        return modelMapper.map(userList,new TypeToken<List<UserDTO>>(){}.getType());//this is the method of making map into a type that the information we got from the table through modelMapper(simply converting information we got to a tranferrable type)
    }
}

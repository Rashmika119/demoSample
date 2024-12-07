package com.example.demosample2.controller;


import com.example.demosample2.dataTransferObject.UserDTO;
import com.example.demosample2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value="api/v1/")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/getusers")
    public List<UserDTO> getUser(){
        return userService.getAllUsers();
    }

    @GetMapping("/user/{userId}")
    public UserDTO getUserById(@PathVariable Integer userId){
        return userService.getUserById(userId);
    }


    @PostMapping("/adduser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);
    }

    @PutMapping("/updateuser")
    public UserDTO updateUser(@RequestBody UserDTO userDTO){
        return userService.updateUser(userDTO);
    }
    @DeleteMapping("/deleteuser/{userId}")//userid is a path parameter
    public  String deleteuser(@PathVariable Integer userId){
        return userService.deleteUser(userId);
    }
}


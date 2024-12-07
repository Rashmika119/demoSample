package com.example.demosample2.repo;


import com.example.demosample2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

    @Query(value = "SELECT * FROM User where id = ?1 ")
    User getUserById(Integer userId);
}

//@Query(value = "SELECT * FROM User where id = ?1 and name=?2")//1,2 or 3 gives according to  how we placed arguments below
//    User getUserById(Integer userId,String name);
//}

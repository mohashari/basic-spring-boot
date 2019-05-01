package com.kodescript.basicspringboot;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/detail")
    public ResponseEntity<User> getUser() {
        User user = new User();
        user.setActived(true);
        user.setName("avi");
        user.setAddress("cikarang");
        return new ResponseEntity(user, HttpStatus.CREATED);
    }


    @GetMapping("")
    public User user() {
        User user = new User();
        user.setActived(true);
        user.setName("avi");
        user.setAddress("cikarang");
        return user;
    }

}

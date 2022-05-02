package com.example.demoporject.controller;

import com.example.demoporject.model.UserEntity;
import com.example.demoporject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService  userService;

    @GetMapping(value = "/find-all")
    public List<UserEntity> findAll(){
        List<UserEntity> userEntity = userService.findAll();
        return userEntity;
    }

    @GetMapping(value = "/find-by-id")
    public UserEntity findById(@RequestParam("id") Long id){
        UserEntity userEntity = userService.findById(id);
        return userEntity;
    }

    @PostMapping(value = "/create-person")
    public void createPerson(@RequestBody UserEntity userEntity){
        userService.createPerson(userEntity);
    }

    @PutMapping (value = "/update-person")
    public void updatePerson(@RequestParam("id") Long id,@RequestBody UserEntity userEntity){
        userService.updatePerson(id, userEntity);
    }



}

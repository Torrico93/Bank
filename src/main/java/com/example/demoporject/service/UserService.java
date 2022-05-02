package com.example.demoporject.service;

import com.example.demoporject.model.UserEntity;
import com.example.demoporject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserEntity> findAll(){
        return userRepository.findAll();
    }

    public UserEntity findById(Long id) {
        UserEntity userEntity = userRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario no encontrado."));
        return userEntity;
    }


    public void createPerson(UserEntity userEntity) {
        UserEntity newUserEntity = new UserEntity(userEntity.getName(), userEntity.getLastName(), userEntity.getAge());
        userRepository.save(newUserEntity);
    }

    public void updatePerson(Long id, UserEntity userEntity) {
        UserEntity userEntity1 = userRepository.getById(id);
        userEntity1.setName(userEntity.getName());
        userEntity1.setLastName(userEntity.getLastName());
        userEntity1.setAge(userEntity.getAge());
        userRepository.save(userEntity1);
    }
}

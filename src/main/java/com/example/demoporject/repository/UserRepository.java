package com.example.demoporject.repository;

import com.example.demoporject.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository <UserEntity, Long>{

}

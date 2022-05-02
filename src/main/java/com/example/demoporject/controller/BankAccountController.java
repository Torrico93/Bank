package com.example.demoporject.controller;

import com.example.demoporject.service.BankAccountService;
import com.example.demoporject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank-account")
public class BankAccountController {

    @Autowired
    private BankAccountService bankAccountService;
    private UserService userService;



}

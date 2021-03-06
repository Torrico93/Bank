package com.example.demoporject.service;

import com.example.demoporject.repository.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankAccountService {

    private final BankAccountRepository bankAccountRepository;

    @Autowired
    public BankAccountService(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }


}

package com.example.demoporject.repository;

import com.example.demoporject.model.BankAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccountEntity,Long> {
}

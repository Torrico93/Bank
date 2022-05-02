package com.example.demoporject.model;

import javax.persistence.*;

@Entity
@Table(name = "BANK_ACCOUNT")
public class BankAccountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME_USER")
    private String nameUser;

    @Column(name = "CBU")
    private int cbu;

    @Column(name = "BALANCE")
    private int balance;

    public BankAccountEntity(String nameUser, int cbu, int balance){
        this.nameUser = nameUser;
        this.cbu = cbu;
        this.balance = balance;
    }

    public BankAccountEntity() {

    }

    public String getNameUser() {
        return nameUser;
    }

    public int getCbu() {
        return cbu;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


}

package com.demo_websevice_c0922h1.service;


import com.demo_websevice_c0922h1.model.Account;
import com.demo_websevice_c0922h1.repository.IAccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    IAccountRepo iAccountRepo;
    public Account checkLogin(String username, String password){
        return iAccountRepo.checkLogin(username,password);
    }
}

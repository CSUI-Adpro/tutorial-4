package id.ac.ui.cs.advprog.tutorial4.authentication.service;

import id.ac.ui.cs.advprog.tutorial4.authentication.exceptions.UsernameAlreadyExistsException;
import id.ac.ui.cs.advprog.tutorial4.authentication.exceptions.UsernameDoesNotExistException;
import id.ac.ui.cs.advprog.tutorial4.authentication.exceptions.InvalidPasswordException;
import id.ac.ui.cs.advprog.tutorial4.authentication.core.AuthentiationManager;
import id.ac.ui.cs.advprog.tutorial4.authentication.core.Util;
import id.ac.ui.cs.advprog.tutorial4.authentication.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    // Please do not modify this class
    
    @Autowired
    AccountRepository accountRepository;

    // TODO inisialisasi authenticationManager yang sesuai
    AuthentiationManager authenticationManager;
    
    // TODO
    //  Pada method-method di bawah ini, jangan lupa handle kasus untuk melakukan throw exception
    
    @Override
    public void register(String username, String password){
        // TODO
    }
    
    @Override
    public String login(String username, String password){
        // TODO
        return null;  // return token
    }
    
    @Override
    public void logout(String token){
        // TODO
    }
    
}

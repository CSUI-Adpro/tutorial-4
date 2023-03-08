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

    // TODO: DONE
    // Inisialisasi authenticationManager yang sesuai
    AuthentiationManager authenticationManager = AuthentiationManager.getInstance();
    
    // TODO: DONE
    // Pada method-method di bawah ini, jangan lupa handle kasus untuk melakukan throw exception
    
    @Override
    public void register(String username, String password){
        // TODO: DONE
        // Jika username sudah ada di dalam accountRepository, throw UsernameAlreadyExistsException
        if (accountRepository.doesUsernameExist(username)) {
            throw new UsernameAlreadyExistsException();
        }
        accountRepository.register(username, password);
    }
    
    @Override
    public String login(String username, String password){
        // TODO: DONE
        // Jika username tidak ada di dalam accountRepository, throw UsernameDoesNotExistException
        if (!accountRepository.doesUsernameExist(username)) {
            throw new UsernameDoesNotExistException();
        }
        // Jika password tidak sama dengan password yang ada di dalam accountRepository, throw InvalidPasswordException
        if (!accountRepository.getPassword(username).equals(password)) {
            throw new InvalidPasswordException();
        }
        // Jika username dan password sesuai, buat token dan tambahkan ke dalam authenticationManager
        String token = Util.generateToken();
        authenticationManager.registerNewToken(token, username);
        return token;  // return token
    }
    
    @Override
    public void logout(String token){
        // TODO: DONE
        // Remove token dari authenticationManager
        authenticationManager.removeToken(token);
    }
    
}

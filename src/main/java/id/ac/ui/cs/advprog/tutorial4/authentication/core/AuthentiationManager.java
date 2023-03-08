package id.ac.ui.cs.advprog.tutorial4.authentication.core;

import id.ac.ui.cs.advprog.tutorial4.authentication.exceptions.UsernameAlreadyLoggedIn;
import id.ac.ui.cs.advprog.tutorial4.authentication.exceptions.InvalidTokenException;

import java.util.HashMap;
import java.util.Map;

public class AuthentiationManager {
    // TODO Buat private constructor

    // TODO lengkapi method getInstance
    // boleh mengedit static attribute jika diperlukan
    private static AuthentiationManager instance;
    public static AuthentiationManager getInstance(){
        return null;
    }
    
    
    private Map<String, String> tokenToUsernameMapping = new HashMap<>();
    
    
    // TODO
    //  lengkapi method-method di bawah ini, serta jangan lupa mengimplementasi supaya
    //  method-method tersebut throw exception yang tepat.
    //  Jangan lupa juga untuk mempelajari kegunaan @ControllerAdvice
    //  dan peran dari masing-masing class pada bagian tutorial ini
    
    public void registerNewToken(String token, String username){
        // TODO
    }
    
    public void removeToken(String token){
        // TODO
    }
    
    public String getUsername(String token){
        // TODO
        return null;
    }
    
}

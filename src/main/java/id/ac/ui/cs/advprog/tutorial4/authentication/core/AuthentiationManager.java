package id.ac.ui.cs.advprog.tutorial4.authentication.core;

import id.ac.ui.cs.advprog.tutorial4.authentication.exceptions.UsernameAlreadyLoggedIn;
import id.ac.ui.cs.advprog.tutorial4.authentication.exceptions.InvalidTokenException;

import java.util.HashMap;
import java.util.Map;

public class AuthentiationManager {
    private static AuthentiationManager instance;

    // TODO : DONE
    // Private constructor
    private AuthentiationManager() {};

    // TODO : DONE
    // Singleton pattern
    public static AuthentiationManager getInstance(){
        if (instance == null) {
            instance = new AuthentiationManager();
        }
        return instance;
    }

    private Map<String, String> tokenToUsernameMapping = new HashMap<>();
    
    
    // TODO: DONE
    // lengkapi method-method di bawah ini, serta jangan lupa mengimplementasi supaya
    // method-method tersebut throw exception yang tepat.
    // Jangan lupa juga untuk mempelajari kegunaan @ControllerAdvice
    // dan peran dari masing-masing class pada bagian tutorial ini
    
    public void registerNewToken(String token, String username){
        // TODO: DONE
        // Jika token sudah ada di dalam tokenToUsernameMapping, throw InvalidTokenException
        if (tokenToUsernameMapping.containsKey(token)) {
            throw new UsernameAlreadyLoggedIn();
        }
        if (tokenToUsernameMapping.containsValue(username)) {
            throw new UsernameAlreadyLoggedIn();
        }
        // Jika token tidak ada di dalam tokenToUsernameMapping, tambahkan token dan username ke dalam tokenToUsernameMapping
        tokenToUsernameMapping.put(token, username);
    }
    
    public void removeToken(String token){
        // TODO: DONE
        // Jika token tidak ada di dalam tokenToUsernameMapping, throw InvalidTokenException
        if (!tokenToUsernameMapping.containsKey(token)) {
            throw new InvalidTokenException();
        }
        tokenToUsernameMapping.remove(token);
    }
    
    public String getUsername(String token){
        // TODO: DONE
        // Jika token tidak ada di dalam tokenToUsernameMapping, throw InvalidTokenException
        if (!tokenToUsernameMapping.containsKey(token)) {
            throw new InvalidTokenException();
        }
        return tokenToUsernameMapping.get(token);
    }
    
}

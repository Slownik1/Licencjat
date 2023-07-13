package com.example.Licencjat.User;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class UserRepository {

    private static final HashMap<String, User> REGISTERED_USER = new HashMap<>(2);

    public void setUpUser(){
        REGISTERED_USER.put("ADMIN", buildUser("ADMIN", "$2a$10$4EvCE3wPMBPYEV/FA8B.3e1mrlCGaVuq.cO0x0fmrt198H61q/dFG"));
        REGISTERED_USER.put("ADMIN", buildUser("USER", "$2a$10$4EvCE3wPMBPYEV/FA8B.3e1mrlCGaVuq.cO0x0fmrt198H61q/dFG"));
    }

    private User buildUser(String username, String password) {

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return user;

    }

    public User findUserByUsername(String username){
        return REGISTERED_USER.get(username);
    }


}

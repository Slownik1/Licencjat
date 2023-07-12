package com.example.Licencjat.Session;

import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.UUID;

@Component
public class SessionRegister {

    private static final HashMap<String, String> SESSIONS = new HashMap<>();

    public String registerSession(String username){
        if(username == null){
            throw new RuntimeException("Username needs to be provided");
        }

        String sessionID = generateSessionId();
        SESSIONS.put(sessionID, username);
        return sessionID;

    }

    public String getUsernameFromSession(String sessionID){
        return SESSIONS.get(sessionID);
    }


    private String generateSessionId(){

        return new String(Base64.getEncoder().encode(UUID.randomUUID().toString().getBytes(StandardCharsets.UTF_8)));

    }

}

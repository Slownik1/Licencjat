package com.example.Licencjat;

import com.example.Licencjat.Session.SessionRegister;
import com.example.Licencjat.User.ResponseDTO;
import com.example.Licencjat.User.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class AuthenticationControler {

    @Autowired
    public AuthenticationManager manager;
    @Autowired
    public SessionRegister sessionRegister;

    @PostMapping("/login")
    public ResponseEntity<ResponseDTO> login(@RequestBody UserDTO userDTO){

        manager.authenticate(new UsernamePasswordAuthenticationToken(userDTO.getUsername(), userDTO.getPassword()));

        String sessionId = sessionRegister.registerSession(userDTO.getUsername());
        ResponseDTO response = new ResponseDTO();
        response.setSessionId(sessionId);

        return ResponseEntity.ok(response);

    }

}

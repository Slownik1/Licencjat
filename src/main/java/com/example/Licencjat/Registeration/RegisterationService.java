package com.example.Licencjat.Registeration;

import com.example.Licencjat.User.UserRole;
import com.example.Licencjat.User.UserService;
import com.example.Licencjat.User.Users;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegisterationService {

    private EmailValidator emailValidator;
    private UserService userService;

    public String register(RegisterationRequest request) {
        boolean isEmailValid = emailValidator.test(request.getEmail());
        if(!isEmailValid){
            throw new IllegalStateException("Email is not valid");
        }
        return userService.signUpUser(new Users(
                request.getFirstName(),
                request.getLastName(),
                request.getPassword(),
                request.getEmail(),
                UserRole.USER
        ));
    }
}

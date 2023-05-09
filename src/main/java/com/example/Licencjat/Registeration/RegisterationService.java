package com.example.Licencjat.Registeration;

import com.example.Licencjat.User.UserRole;
import com.example.Licencjat.User.UserService;
import com.example.Licencjat.User.Users;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class RegisterationService {

    private EmailValidator emailValidator;
    private UserService userService;
    private ConfirmationTokenService confirmationTokenService;

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
    @Transactional
    public String confirmToken(String token){
        ConfirmationToken confirmationToken = confirmationTokenService.getToken(token).orElseThrow(()->
                new IllegalStateException("TOKEN NOT FOUND"));
        if(confirmationToken.getConfirmedAt() != null){
            throw new IllegalStateException("ADRESS ARLEADY CONFIRMAED");
        }

        LocalDateTime expiredAt = confirmationToken.getExpiresAt();

        if(expiredAt.isBefore(LocalDateTime.now())){
            throw new IllegalStateException("token expired");
        }

        confirmationTokenService.setConfirmedAt(token);
        userService.enableUser(
                confirmationToken.getUsers().getEmail());
        return "confirmed";
    }
}

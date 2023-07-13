package com.example.Licencjat.User;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException {

        final User user = userRepository.findUserByUsername(username);

        if(user == null){
            throw  new UsernameNotFoundException("USER NOT FOUND");
        }
        else{
            return user;
        }
    }
}

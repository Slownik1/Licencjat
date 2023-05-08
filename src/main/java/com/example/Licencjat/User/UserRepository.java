package com.example.Licencjat.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.Optional;

@Transactional(readOnly = true)
@Repository
public interface UserRepository{
    Optional<User> findByEmail(String email);
}

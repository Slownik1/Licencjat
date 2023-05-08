package com.example.Licencjat.Registeration;

import com.example.Licencjat.User.Users;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ConfirmationToken {

    @Id
    @SequenceGenerator(name= "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;
    @Column(nullable = false)
    private String token;
    @Column(nullable = false)
    private LocalDateTime createdAt;
    @Column(nullable = false)
    private LocalDateTime expiresAt;
    private LocalDateTime confirmedAt;

    @ManyToOne
    @JoinColumn(
            nullable = false,
            name="users_id"
    )
    private Users users;

    public ConfirmationToken(String token, LocalDateTime createdAt, LocalDateTime expiredAt, Users users) {
        this.token = token;
        this.createdAt = createdAt;
        this.expiresAt = expiredAt;
        this.users = users;
    }
}

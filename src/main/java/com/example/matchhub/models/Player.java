package com.example.matchhub.models;

import com.example.matchhub.enums.Country;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(nullable = false)
    String name;
    @Column(name = "date_of_birth" , nullable = false)
    LocalDate dateOfBirth;

    @Column(nullable = false, unique = true)
    @Email(regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", message = "should be a valid email address")
    String email; //This  attribute identifies the player record uniquely (unique = true)

    @Column(nullable = false)
    double height;

    @Column(nullable = false)
    double weight;

    @Column(nullable = false)
    int numberOfMatchPlayed;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    Country country;

    @OneToMany(mappedBy = "playerOfMatch" ,cascade = CascadeType.ALL)
    List<Matches>playerOfTheMatchesList;

    @ManyToOne
    Team team;
}

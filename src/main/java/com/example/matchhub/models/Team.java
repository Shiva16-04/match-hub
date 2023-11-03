package com.example.matchhub.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "team")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column( nullable = false, unique = true)
    String teamName; //This  attribute identifies the team record uniquely (unique = true)

    @Column(nullable = false)
    int fixedTeamSize;

    @OneToOne
    Player captain;

    @Column(name = "number_of_match_won" , nullable = false)
    int numberOfMatchesWon;

    @Column(name = "number_of_match_lost" , nullable = false)
    int numberOfMatchesLost;

    @OneToMany(mappedBy = "team",cascade = CascadeType.ALL)
    List<Player>playerList;// Assuming the

    @ManyToMany(mappedBy = "teamList",cascade = CascadeType.ALL)
    List<Matches> matchList;
}

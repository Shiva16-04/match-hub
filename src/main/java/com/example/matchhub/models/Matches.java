package com.example.matchhub.models;

import com.example.matchhub.enums.MatchStatus;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Matches {
    //Match record is uniquely identified by date, time and venue attributes combined
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "date_of_match" , nullable = false)
    LocalDate dateOfMatch;

    @Column(name = "time_of_match" , nullable = false)
    LocalTime timeOfMatch;

    @Column(name = "matches_status" , nullable = false)
    @Enumerated(value = EnumType.STRING)
    MatchStatus matchStatus;

    @ManyToOne
    Player playerOfMatch;

    @ManyToMany
    List<Team> teamList;//fixed size of 2

    @ManyToOne
    Venue venue;
}

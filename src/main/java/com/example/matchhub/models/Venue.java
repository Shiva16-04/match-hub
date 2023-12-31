package com.example.matchhub.models;

import com.example.matchhub.enums.Country;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.net.URL;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "venue")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Venue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(nullable = false)
    String venueName;

    @Column(name = "city" , nullable = false)
    String city;

    @Column(name = "state" , nullable = false)
    String state;
    @Column(name = "country" , nullable = false)
    @Enumerated(value = EnumType.STRING)
    Country country;

    @Column(name = "capacity" , nullable = false)
    @Size(min = 100) //Assuming minimum capacity of the venue to be 100 to conduct the match
    int capacity;

    @Column(name = "is_flood_light" , nullable = false)
    boolean isFloodLight;

    @Column(name = "location_url" , nullable = false, unique = true)
    URL locationUrl; //This  attribute identifies the venue record uniquely (unique = true)
    @OneToMany(mappedBy = "venue",cascade = CascadeType.ALL)
    List<Matches> matchList;
}

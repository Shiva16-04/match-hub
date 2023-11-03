package com.example.matchhub.dtos.requestdtos;

import com.example.matchhub.enums.Country;
import com.example.matchhub.models.Matches;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.net.URL;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VenueRequest {
    String venueName;
    String city;
    String state;
    String country;
    int capacity;
    boolean isFloodLight;
    URL locationUrl;

}

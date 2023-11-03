package com.example.matchhub.dtos.requestdtos;

import com.example.matchhub.enums.Country;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Setter
@Getter
public class PlayerRequest {
    String name;
    LocalDate dateOfBirth;
    String email;
    double height;
    double weight;
    Country country;

}

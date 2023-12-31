package com.example.matchhub.repositorylayer;

import com.example.matchhub.models.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TeamRepository extends JpaRepository<Team, Integer> {
    Optional<Team>findByTeamName(String name);
}

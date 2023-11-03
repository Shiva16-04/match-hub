package com.example.matchhub.repositorylayer;

import com.example.matchhub.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlayerRepository extends JpaRepository<Player, Integer> {
    Optional<Player>findByEmail(String email);
}

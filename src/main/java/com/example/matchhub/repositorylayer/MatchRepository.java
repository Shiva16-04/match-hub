package com.example.matchhub.repositorylayer;


import com.example.matchhub.models.Matches;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Matches, Integer> {
}

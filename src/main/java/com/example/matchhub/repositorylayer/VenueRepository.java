package com.example.matchhub.repositorylayer;

import com.example.matchhub.models.Venue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenueRepository extends JpaRepository<Venue, Integer> {
}

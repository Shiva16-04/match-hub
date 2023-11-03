package com.example.matchhub.servicelayer.impl;

import com.example.matchhub.dtos.requestdtos.VenueRequest;
import com.example.matchhub.models.Venue;
import com.example.matchhub.repositorylayer.VenueRepository;
import com.example.matchhub.servicelayer.VenueService;
import com.example.matchhub.transformers.VenueTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VenueServiceImpl implements VenueService{
//    @Autowired
//    VenueService venueService;
    @Autowired
    VenueRepository venueRepository;

    @Override
    public String addDetails(VenueRequest venueRequest) {
        Venue venue= VenueTransformer.venueRequestToVenue(venueRequest);
        Venue savedVenue=venueRepository.save(venue);
        return "Venue "+savedVenue.getVenueName()+" has been successfully added to the database";
    }
}

package com.example.matchhub.controllerlayer;

import com.example.matchhub.dtos.requestdtos.VenueRequest;
import com.example.matchhub.servicelayer.VenueService;
import com.example.matchhub.servicelayer.impl.VenueServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("venue")
public class VenueController {
    @Autowired
    VenueServiceImpl venueServiceimpl;

    //Method 1: addDetails
    @PostMapping("/addDetails")
    public ResponseEntity addDetails(@RequestBody VenueRequest venueRequest){
        return new ResponseEntity<>(venueServiceimpl.addDetails(venueRequest), HttpStatus.CREATED);
    }
}

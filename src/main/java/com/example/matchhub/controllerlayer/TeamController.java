package com.example.matchhub.controllerlayer;

import com.example.matchhub.dtos.requestdtos.PlayerRequest;
import com.example.matchhub.dtos.requestdtos.TeamRequest;
import com.example.matchhub.servicelayer.TeamService;
import com.example.matchhub.servicelayer.impl.TeamServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("team")
public class TeamController {
    @Autowired
    private TeamServiceImpl teamServiceimpl;

    //Method 1: addDetails
    @PostMapping("/addDetails")
    public ResponseEntity addDetails(@RequestBody TeamRequest teamRequest){
        try {
            return new ResponseEntity<>(teamServiceimpl.addDetails(teamRequest), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

}

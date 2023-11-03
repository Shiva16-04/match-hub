package com.example.matchhub.controllerlayer;

import com.example.matchhub.dtos.requestdtos.TeamRequest;
import com.example.matchhub.servicelayer.MatchService;
import com.example.matchhub.servicelayer.impl.MatchServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("match")
public class MatchController {
    @Autowired
    MatchServiceImpl matchServiceimpl;

    //Method 1: addTeam
    @PostMapping("/addDetails")
    public ResponseEntity addDetails(@RequestBody TeamRequest teamRequest){
        return null;
    }
}

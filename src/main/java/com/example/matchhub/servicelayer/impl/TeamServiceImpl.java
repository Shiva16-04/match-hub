package com.example.matchhub.servicelayer.impl;

import com.example.matchhub.dtos.requestdtos.TeamRequest;
import com.example.matchhub.exceptions.TeamAlreadyPresentException;
import com.example.matchhub.models.Team;
import com.example.matchhub.repositorylayer.TeamRepository;
import com.example.matchhub.servicelayer.TeamService;
import com.example.matchhub.transformers.TeamTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeamServiceImpl implements TeamService{
    @Autowired
    TeamRepository teamRepository;


    @Override
    public String addDetails(TeamRequest teamRequest) throws Exception{
        Team team= TeamTransformer.teamRequestToTeam(teamRequest);
        Optional<Team>teamOptional=teamRepository.findByTeamName(team.getTeamName());
        if(!teamOptional.isPresent()){
            Team savedTeam=teamRepository.save(team);
            return "Team "+savedTeam.getTeamName()+" has been added to the database successfully";
        }else{
            throw new TeamAlreadyPresentException("Team "+team.getTeamName()+" is already present in the database");
        }
    }
}

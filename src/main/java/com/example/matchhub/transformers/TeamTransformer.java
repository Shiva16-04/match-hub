package com.example.matchhub.transformers;

import com.example.matchhub.dtos.requestdtos.TeamRequest;
import com.example.matchhub.models.Team;

import java.util.ArrayList;

public class TeamTransformer {
    public static Team teamRequestToTeam(TeamRequest teamRequest){
        return Team.builder()
                .teamName(teamRequest.getTeamName().toUpperCase())
                .fixedTeamSize(5)
                .numberOfMatchesWon(0)
                .numberOfMatchesLost(0)
                .playerList(new ArrayList<>(5))
                .build();
    }
}

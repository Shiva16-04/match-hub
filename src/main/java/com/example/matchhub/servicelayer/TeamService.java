package com.example.matchhub.servicelayer;

import com.example.matchhub.dtos.requestdtos.TeamRequest;

public interface TeamService {
    public String addDetails(TeamRequest teamRequest) throws Exception;
}

package com.example.matchhub.servicelayer;

import com.example.matchhub.dtos.requestdtos.PlayerRequest;

import java.util.List;

public interface PlayerService {
    public String addDetails(List<PlayerRequest> playersRequestList) throws Exception;
}

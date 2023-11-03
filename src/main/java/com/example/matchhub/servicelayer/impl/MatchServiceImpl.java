package com.example.matchhub.servicelayer.impl;

import com.example.matchhub.repositorylayer.MatchRepository;
import com.example.matchhub.servicelayer.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatchServiceImpl implements MatchService {
//    @Autowired
//    MatchService matchService;
    @Autowired
    MatchRepository matchRepository;
}

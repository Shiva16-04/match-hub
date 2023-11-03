package com.example.matchhub.transformers;

import com.example.matchhub.dtos.requestdtos.PlayerRequest;
import com.example.matchhub.models.Player;

public class PlayerTransformer {
    public static Player playerRequestToPlayer(PlayerRequest playerRequest){
        return Player.builder()
                .name(playerRequest.getName())
                .dateOfBirth(playerRequest.getDateOfBirth())
                .email(playerRequest.getEmail())
                .height(playerRequest.getHeight())
                .weight(playerRequest.getWeight())
                .country(playerRequest.getCountry())
                .numberOfMatchPlayed(0) //Assuming the player is starting his career
                .build();
    }

}

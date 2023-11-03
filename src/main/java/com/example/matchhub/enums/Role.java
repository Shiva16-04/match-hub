package com.example.matchhub.enums;

public enum Role {
    BATSMEN("Batsmen"),
    BOWLER("Bowler"),
    ALL_ROUNDER("All-Rounder"),
    WICKET_KEEPER("Wicket-Keeper");

    private final String displayName;
    Role(String displayName){
        this.displayName=displayName;
    }
    public String getDisplayName(){
        return this.displayName;
    }
}

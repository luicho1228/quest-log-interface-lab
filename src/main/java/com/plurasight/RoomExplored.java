package com.plurasight;

public class RoomExplored implements ScoreEvent{
    private String roomName;
    private boolean secretFound;

    public RoomExplored(String roomName, boolean secretFound) {
        this.roomName = roomName;
        this.secretFound = secretFound;
    }

    @Override
    public String getName() {
        return roomName;
    }

    @Override
    public int getPoints() {
        int basePoint = 20;
        if (secretFound){
            basePoint += 40;
        }
        return basePoint;
    }

    @Override
    public String getSummary() {
        return String.format("Explored %s for %d points",getName(),getPoints());
    }
}

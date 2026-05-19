package com.plurasight;

public class TrapTriggered implements ScoreEvent{
    private final String trapName;
    private final int damage;


    public TrapTriggered(String trapName, int damage) {
        this.trapName = trapName;
        this.damage = damage;
    }

    @Override
    public String getName() {
        return trapName;
    }

    @Override
    public int getPoints() {
        return damage * -10;
    }

    @Override
    public String getSummary() {
        return String.format("Triggered %s for %d points",getName(),getPoints());
    }
}

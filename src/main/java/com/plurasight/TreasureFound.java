package com.plurasight;

public class TreasureFound implements ScoreEvent{
    private final String treasureName;
    private final String rarity;

    public TreasureFound(String treasureName, String rarity) {
        this.treasureName = treasureName;
        this.rarity = rarity;
    }

    @Override
    public String getName(){return treasureName;}
    @Override
    public int getPoints(){
        int points;
        switch (rarity){
            case "common":
                points = 25;
                break;
            case "rare":
                points = 75;
                break;
            case "legendary":
                points = 150;
                break;
            default:
                points = 0;
                break;
        }
        return points;
    }
    @Override
    public String getSummary(){
        return String.format("Found %s %s for %d points",rarity,getName(),getPoints());
    }

}

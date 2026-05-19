package com.plurasight;

public class TreasureFound {
    private String treasureName;
    private String rarity;

    public String getName(){return treasureName;}
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
    public String getSummary(){
        return String.format("Found %s %s for %d points",rarity,treasureName,getPoints());
    }

}

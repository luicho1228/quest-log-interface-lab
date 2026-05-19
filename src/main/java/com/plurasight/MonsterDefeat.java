package com.plurasight;

public class MonsterDefeat {
    private final String monsterName;
    private final int difficultyLevel;
    private final boolean boss;
    private int points;

    public MonsterDefeat(String monsterName,int difficultyLevel, boolean boss){
        this.monsterName = monsterName;
        this.difficultyLevel = difficultyLevel;
        this.boss = boss;
        points = 50;
    }

    public String getName(){
        return"";
    }
    public int getPoints(){
        if(boss){
            points += 100;
        }
        return difficultyLevel * points;
    }
    public String getSummary(){
        return String.format("Defeated %s for %d points",monsterName,points);
    }

}

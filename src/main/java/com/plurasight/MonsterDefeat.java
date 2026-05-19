package com.plurasight;

public class MonsterDefeat {
    private final String monsterName;
    private final int difficultyLevel;
    private final boolean boss;

    public MonsterDefeat(String monsterName,int difficultyLevel, boolean boss){
        this.monsterName = monsterName;
        this.difficultyLevel = difficultyLevel;
        this.boss = boss;
    }

    public String getName(){
        return"";
    }
    public int getPoints(){
        int points = 50;
        if(boss){
            points += 100;
        }
        return difficultyLevel * points;
    }
    public String getSummary(){
        return String.format("Defeated %s for %d points",monsterName,getPoints());
    }

}

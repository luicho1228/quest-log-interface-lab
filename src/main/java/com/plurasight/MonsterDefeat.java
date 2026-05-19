package com.plurasight;

public class MonsterDefeat implements ScoreEvent {
    private final String monsterName;
    private final int difficultyLevel;
    private final boolean boss;

    public MonsterDefeat(String monsterName,int difficultyLevel, boolean boss){
        this.monsterName = monsterName;
        this.difficultyLevel = difficultyLevel;
        this.boss = boss;
    }

    @Override
    public String getName(){
        return monsterName;
    }
    @Override
    public int getPoints(){
        int points = 50;
        if(boss){
            points += 100;
        }
        return difficultyLevel * points;
    }
    @Override
    public String getSummary(){
        return String.format("Defeated %s for %d points",getName(),getPoints());
    }

}

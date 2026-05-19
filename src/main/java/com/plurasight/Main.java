package com.plurasight;

public class Main {
    public static void main(String[] args) {
        QuestLog log = new QuestLog();
        log.addEvent(new MonsterDefeat("Celestial Dragon",5,true));
        log.addEvent(new TreasureFound("Esmerald","legendary"));
        log.addEvent( new TreasureFound("Gold","rare"));
        log.addEvent(new TrapTriggered("Booby Trap",40));
        log.addEvent(new RoomExplored("Palace of Wisdom",true));
        log.addEvent(new MonsterDefeat("Goblin",3,true));
        log.printSummary();
    }
}
package com.plurasight;

public class Main {
    public static void main(String[] args) {

//        MonsterDefeat md = new MonsterDefeat("Goblin",3,true);
//        System.out.println(md.getSummary());
//        TreasureFound tf = new TreasureFound("Gold","rare");
//        System.out.println(tf.getSummary());
        ScoreEvent event1 = new MonsterDefeat("Celestial Dragon",5,true);
        ScoreEvent event2 = new TreasureFound("Esmerald","legendary");
        System.out.println(event1.getSummary());
        System.out.println(event2.getSummary());
    }
}
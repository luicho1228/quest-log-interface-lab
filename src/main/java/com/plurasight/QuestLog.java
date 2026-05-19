package com.plurasight;

import java.util.ArrayList;
import java.util.List;

public class QuestLog {
    private List<ScoreEvent> events;

    public QuestLog() {
        events = new ArrayList<>();
    }

    public void addEvent(ScoreEvent newEvent) {
        events.add(newEvent);
    }

    public int getTotalScore() {
        int totalScore = 0;
        for (ScoreEvent event: events){
            totalScore += event.getPoints();
        }
        return totalScore;
    }

    public ScoreEvent getHighestScoringEvent() {
        ScoreEvent highestScoringEvent = null;
        for (ScoreEvent event:events){
            if (highestScoringEvent == null){
                highestScoringEvent = event;
            } else if (event.getPoints() > highestScoringEvent.getPoints()){
                highestScoringEvent = event;
            }
        }
        return highestScoringEvent;
    }
    public ScoreEvent getLowestScoringEvent(){
        ScoreEvent lowestScoringEvent = null;
        for (ScoreEvent event: events){
            if (lowestScoringEvent == null){
                lowestScoringEvent = event;
            }else if (event.getPoints() < lowestScoringEvent.getPoints()){
                lowestScoringEvent = event;
            }
        }
        return lowestScoringEvent;
    }
    public void printSummary(){
        StringBuilder summary = new StringBuilder();
        summary.append("QUEST LOG");
        summary.append("-------------------------------------");
        int count =1;
        for (ScoreEvent event: events){
            summary.append("\n").append(count).append(". ").append(event.getSummary());
            count++;
        }
        summary.append("-------------------------------------");
        summary.append("\n").append("Total score: ").append(getTotalScore());
        summary.append("Best event: ").append(getHighestScoringEvent());
        summary.append("Worst event: ").append(getLowestScoringEvent());
        System.out.println(summary);
    }
}

package com.plurasight;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        QuestLog log = new QuestLog();
        boolean isRunning = true;
        do {
            displayMainMenu();
            int userInput = scanner.nextInt();
            scanner.nextLine();
            switch (userInput){
                case 1:
                    log.addEvent(addMonsterDefeated());
                    break;
                case 2:
                    log.addEvent(addTreasureFound());
                    break;
                case 3:
                    log.addEvent(addTrapTriggered());
                    break;
                case 4:
                    log.addEvent(addRoomExplored());
                    break;
                case 5:
                    log.printSummary();
                    break;
                case 0:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Select a umber out of the options presented!");
            }
        }while (isRunning);

    }

    public static void displayMainMenu(){
        System.out.println("""
                1)Add monster defeat
                2)Add treasure found
                3)Add trap triggered
                4)Add room explored
                5)view quest log
                0)Quit
                """);
    }

    public static ScoreEvent addMonsterDefeated(){
        System.out.println("Enter Monster's name: ");
        String monsterName = scanner.nextLine();
        System.out.println("Enter difficulty level: ");
        int difficultyLevel = scanner.nextInt();
        scanner.nextLine();
        System.out.println("is it a boss? y/n");
        String bossInput = scanner.nextLine();
        boolean isBoss = bossInput.equalsIgnoreCase("yes");
        return new MonsterDefeat(monsterName,difficultyLevel,isBoss);
    }
    public static ScoreEvent addTreasureFound() {
        System.out.println("Enter treasure's name: ");
        String treasureName = scanner.nextLine();
        System.out.println("Enter rarity: ");
        String rarity = scanner.nextLine();
        return new TreasureFound(treasureName, rarity);
    }
    public static ScoreEvent addTrapTriggered() {
        System.out.println("Enter trap's name: ");
        String trapName = scanner.nextLine();
        System.out.println("Enter damage: ");
        int damage = scanner.nextInt();
        scanner.nextLine();
        return new TrapTriggered(trapName,damage);
    }

    public static ScoreEvent addRoomExplored() {
        System.out.println("Enter room's name: ");
        String roomName = scanner.nextLine();
        System.out.println("is secret found? y/n: ");
        String secretInput = scanner.nextLine();
        boolean isRoomSecretFound = secretInput.equalsIgnoreCase("Yes");
        return new RoomExplored(roomName,isRoomSecretFound);
    }


}
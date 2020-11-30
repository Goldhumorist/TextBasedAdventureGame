package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    static String choice;
    static Scanner scanner = new Scanner(System.in);

      public void play() {
            //START
            System.out.println("What's your name? ");
            String name = scanner.nextLine();
            System.out.println("Hello, " + name);
            startAdventures();
         }

    static void startAdventures(){
        //start adventure
        System.out.println("You enter a room, and you see a red door to your left and a blue door to your right.");
        System.out.println("Do you pick the red door or blue door? > ");
        choice = scanner.nextLine();
        if (choice.equals("red")) {
            System.out.println("You picked the red door");
            redRoom();

        } else if (choice.equals("blue")) {
            System.out.println("You picked the blue door");
            blueRoom();

        } else {
            System.out.println("Sorry, it's either 'red' or 'blue' as the answer. You're the weakest link, goodbye!");

        }

    }
    static void blueRoom(){
        List<String> treasure_chest = new ArrayList<String>();
        treasure_chest.add("diamonds");
        treasure_chest.add("gold" );
        treasure_chest.add("silver" );
        treasure_chest.add("sword");
        System.out.println("You see a room with a wooden treasure chest on the left, and a sleeping guard on the right in front of the door");
        System.out.println("What do you do? > ");
        choice = scanner.nextLine();
        if (choice.equals("treasure") || choice.equals("chest") ||choice.equals("left")){
            System.out.println("Oooh, treasure!");
        }else System.out.println("The guard is more interesting, let's go that way!");

        System.out.println("Open it? Press '1'");
        System.out.println("Leave it alone. Press '2'");
        choice = scanner.nextLine();

        if (choice.equals("1")){
            System.out.println("Let's see what's in here... /grins");
            System.out.println("The chest creaks open, and the guard is still sleeping. That's one heavy sleeper!");
            System.out.println("You find some");
            for (String treasure : treasure_chest) {
                System.out.print(treasure+", ");
            }
            System.out.println("What do you want to do?");
            System.out.println("Take all treasure, press '1'");
            System.out.println("Leave it, press '2'");
            choice = scanner.nextLine();

            if (choice.equals("1")){
                System.out.println("You won! You got all treasure! ");
            }else System.out.println("You lose( guard is wake up and you got to a prison, sorry");

        }else System.out.println("The guard is more interesting, let's go that way!");


    }
    static void redRoom(){
        System.out.println("There you see a great red dragon.");
        System.out.println("It stares at you through one narrowed eye.");
        System.out.println("Do you flee for your life or stay?");
        choice = scanner.nextLine();
        if (choice.equals("flee")){
            startAdventures();
        }else {

            youDied("It eats you. Well, that was tasty!");
        }
    }
   static void youDied(String why){
       System.out.println(why + " Good job!");
   }


}

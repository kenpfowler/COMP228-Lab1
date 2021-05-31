package com.company;

/* Author: Ken Fowler
 *  Lab Assignment #1
 *  2021-05-17
 * */

public class Main {

    public static void main(String[] args) {
        //create players object with the no argument constructor
        String[] appearances = {"Miami", "Austin", "Stockholm"};
        com.company.Players hockeyPlayer = new com.company.Players();

        //display default values
        System.out.printf("ID: %d%n", hockeyPlayer.getId());
        System.out.printf("Name: %s%n", hockeyPlayer.getName());
        System.out.printf("Team Name: %s%n", hockeyPlayer.getTeamName());
        System.out.printf("DOB: %s%n", hockeyPlayer.getDateOfBirth());
        System.out.printf("Appearances: %s%n", (Object[]) hockeyPlayer.getAppearances());
        System.out.println();

        //set values with setters
        hockeyPlayer.setAll(1, "Wayne", "Maple Leafs", "1965-10-11", appearances);

        //display the new values
        System.out.printf("ID: %d%n", hockeyPlayer.getId());
        System.out.printf("Name: %s%n", hockeyPlayer.getName());
        System.out.printf("Team Name: %s%n", hockeyPlayer.getTeamName());
        System.out.printf("DOB: %s%n", hockeyPlayer.getDateOfBirth());
        for (int i = 0; i < hockeyPlayer.getAppearances().length; i++)
        {
            if (hockeyPlayer.getAppearances().length == 0)
            {
                System.out.println("No appearances scheduled");
                break;
            }
            System.out.println("Appearance " + (i + 1) + ": " + hockeyPlayer.getAppearances()[i]);
        }
    }
}

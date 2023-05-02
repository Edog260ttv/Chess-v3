package org.example;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Game game = new Game();
        Scanner scan = new Scanner(System.in);

        // first questions at beginning

        System.out.println("Welcome To Chess!");
        System.out.println("this is a two player game.");
        System.out.println("what will the name of the first player be?");

        // getting player names
        boolean validName = false;
        while (!validName) {
            game.setName1(scan.nextLine());
            if (game.getName1().length() < 1) {

                System.out.println("pleas enter a valid name!");

            } else {

                validName = true;

            }

        }

        validName = false;

        System.out.println("what will the name of the second player be?");

        while (!validName) {
            game.setName2(scan.nextLine());
            if (game.getName2().length() < 1) {

                System.out.println("please enter a longer name!");

            } else {

                validName = true;

            }

        }

    }
}
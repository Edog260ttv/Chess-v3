package org.example;

public class Game {

    private boolean isGameOver = false;
    private String[] names = new String[2];

    public Game() {

        names[0] = null;
        names[1] = null;
        isGameOver = false;

    }

    public Game(String[] playerNames) {

        names = playerNames;
        isGameOver = false;

    }

    public void setNames(String names1, String names2) {

        names[0] = names1;
        names[1] = names2;

    }

    public void setName1(String name1) {

        names[0] = name1;

    }

    public void setName2(String name2) {

        names[1] = name2;

    }

    public boolean isGameOver() {
        return isGameOver;
    }

    public void setGameOver(boolean gameOver) {
        isGameOver = gameOver;
    }

    public String getName1() {

        return names[0];

    }

    public String getName2() {

        return names[1];

    }

}

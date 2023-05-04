package org.example;

public class Game {

    private boolean isGameOver = false;
    private String[] names = new String[2];
    private Piece[][] board = new Piece[8][8];

    public Game() {

        names[0] = null;
        names[1] = null;
        isGameOver = false;
        board = board;
        

    }

    public Game(String[] playerNames) {

        names = playerNames;
        isGameOver = false;
        board = board;

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

    public static void emptyScreen() {

        for (int i = 0; i < 50; i++) {

            System.out.println("");

        }

    }
    
    public void setBoard(Piece[][] b) {
        
        board = b;
        
    }
    
    public boolean setBoardTile(int x, int y, Piece p) {
        
        if (x < 9 && y < 9) {
            
            board[x][y] = p;
            
            return true;
        } else {
            
            return false;
            
        }
        
    }
    
    
    public Piece[][] getBoard() {
        
        return board;
        
    }

}

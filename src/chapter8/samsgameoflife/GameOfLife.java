/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8.samsgameoflife;

import java.awt.BorderLayout;
import java.util.Random;
import javax.swing.JFrame;

/**
 *
 * @author cymbalusa405
 */
public class GameOfLife {
    
    public final int SIZE = 500;
    public int zoom = 2;
    public boolean[][] board;
    JFrame frame;
    GamePanel panel;
    

    public static void main(String[] args) {
        GameOfLife game = new GameOfLife(PopulationType.SNOWFLAKE);
    }

    public GameOfLife(PopulationType popType) {
        board = new boolean[SIZE][SIZE];
        populate(popType);

        
        frame = new JFrame("GameOfLife");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
        panel = new GamePanel(this);
        frame.add(panel, BorderLayout.CENTER);
        
        frame.setSize(SIZE*zoom,SIZE*zoom);
        frame.setVisible(true);
    }
    
    
    public void nextGeneration(){
        boolean[][] newBoard = new boolean[SIZE][SIZE];
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                
                //Live cell
                if(board[x][y]){
                    if(aliveNeighbours(x,y) >= 2 && aliveNeighbours(x,y) <= 3) newBoard[x][y] = true;
                    
                //Empty cell
                }else{
                    if(aliveNeighbours(x,y) == 3) newBoard[x][y] = true;
                }
            }
        }
        
        board = newBoard;
    }

    
    private void populate(PopulationType type) {
        switch (type) {
        case RANDOM:
            randomPop();
            break;
        case LINE:
            linePop();
            break;
        case PLUS:
            plusPop();
            break;
        case CENTER:
            centerPop();
            break;
        case SCRIBBLE:
            scribblePop();
            break;
        case CROSS:
            crossPop();
            break;
        case SNOWFLAKE:
            plusPop();
            crossPop();
            break;
        }
    }
    
    private void randomPop(){
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                // 1/10 chance of populating cell
                if (Math.random() < 0.5) {
                    board[x][y] = true;
                }
            }
        }
    }
    
    private void linePop(){
        for(int x = 0; x < SIZE; x++){
            board[x][SIZE / 2] = true;
        }
    }
    
    public void plusPop(){
        for(int x = 0; x < SIZE; x++){
            board[x][SIZE / 2] = true;
        } 
        for(int y = 0; y < SIZE; y++){
            board[SIZE / 2][y] = true;
        }
    }
    
    public void crossPop(){
        // y = x and y = -x
       for(int x = 0; x < SIZE; x++){
           board[x][x] = true;
           board[x][-x + SIZE - 1] = true;
       }
    }
    
    private void centerPop(){
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                // Produces a random distribution of cells focused on the center of the board
                //System.out.println(Math.sqrt(Math.pow(x - (SIZE/2), 2) + Math.pow(y - (SIZE/2), 2)) / ((double)SIZE));
                if (Math.random() > Math.sqrt(Math.pow(x - (SIZE/2), 2) + Math.pow(y - (SIZE/2), 2)) / ((double)SIZE)*4) {
                    board[x][y] = true;
                }
            }
        }
    }
    
    private void scribblePop(){
        Random r = new Random();
        int x = SIZE/2;
        int y = SIZE/2;
        
        while(x >= 0 && x < SIZE && y >= 0 && y < SIZE){
            board[x][y] = true;
            x += r.nextInt(3) - 1;
            y += r.nextInt(3) - 1;
        }
    }
        
    
    private void printBoard(){
        for (int y = 0; y < SIZE; y++) {
            String row = "";
            for (int x = 0; x < SIZE; x++) {
                row = row + (board[x][y] ? "X" : "O");
            }
            System.out.println(row);
        }
    }
    
    private int aliveNeighbours(int xPos, int yPos){
        int alive = 0;
        
        //Loop over neighbouring cells
        for (int x = -1; x <= 1; x++) {
            for (int y = -1; y <= 1; y++) {
                if(x == 0 && y == 0) continue;
                
                //Surround with try-catch block to deal with "edge" cases (hehe)
                try{
                    if(board[xPos + x][yPos + y]) alive++;
                }catch(IndexOutOfBoundsException ex){}
                    
            }
        }
        
        
        return alive;
    }
}

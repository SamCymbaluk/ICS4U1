/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8.samsgameoflife;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author cymbalusa405
 */
public class GamePanel extends JPanel implements ActionListener, KeyListener{
    
    private BufferedImage grid;
    private GameOfLife game;
    
    public GamePanel(GameOfLife game){
        this.game = game;
        grid = new BufferedImage(game.SIZE, game.SIZE, BufferedImage.TYPE_INT_ARGB);
        setBackground(Color.CYAN);

        //listen to key presses
        setFocusable(true);
        addKeyListener(this);

        //call tick() 60 fps
        Timer timer = new Timer(1000/1000, this);
        timer.start();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        tick();
    }

    public void tick(){
        game.nextGeneration();
        for(int x = 0; x < game.SIZE; x++){
            for(int y = 0; y < game.SIZE; y++){
                if(game.board[x][y]){
                    grid.setRGB(x, y, Color.BLACK.getRGB());
                }else{
                    grid.setRGB(x, y, Color.WHITE.getRGB());
                }
            }
        }
        
        
        repaint();
    }

    //paint the game screen
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.drawImage(grid.getScaledInstance(game.SIZE*game.zoom, game.SIZE*game.zoom, Image.SCALE_SMOOTH), 0, 0, this);
        //Graphics2D g2 = (Graphics2D) g;
        //g2.drawImage(grid, null, null);
    }


    @Override
    public void keyTyped(KeyEvent e) {
    }


    @Override
    public void keyPressed(KeyEvent e) {
        
        //Zoom in and out
        if(e.getKeyChar() == '+' || e.getKeyChar() == '='){
            game.zoom++;
        }else if(e.getKeyChar() == '-' || e.getKeyChar() == '_'){
            if(game.zoom > 1) game.zoom--;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snake.game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;


/**
 *
 * @author Firas
 */
public class GamePanel extends JPanel implements ActionListener{
    
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE;
    static final int DELAY = 75;
    final int X[] = new int[GAME_UNITS];  
    final int Y[] = new int[GAME_UNITS]; 
    int bodyParts = 6;
    int applesEaten;
    int appleX;
    int appleY;
    char direction = 'R'; //R: right | L: left |  U: up | D: down
    boolean running = false;
    Timer timer;
    Random random;
    
    
    GamePanel(){
        
    }
    
//  GAME METHODs
    
    public void startGame(){
        
    }
    
    public void paintComponent(Graphics g){
        
    }
    
    public void draw(Graphics g){
        
    }
    
    public void move(){
        
    }
    
    public void checkApple(){
        
    }
    
    public void checkCollisions(){
        
    }
    
    public void gameOver(Graphics g){
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
            
        }
    }
    
}

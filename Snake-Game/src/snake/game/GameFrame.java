/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snake.game;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Firas
 */
public class GameFrame extends JFrame{
    
    GameFrame(){
        
//      CREATING AND ADDING A PANEL TO THIS FRAME
        this.add(new GamePanel());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setBackground(Color.black);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}

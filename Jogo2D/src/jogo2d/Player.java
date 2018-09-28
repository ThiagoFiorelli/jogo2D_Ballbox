/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo2d;

import java.awt.Graphics;

/**
 *
 * @author 160018
 */
public class Player extends Basico{
    
    public Player(String url){
        super(url);
    }
    
    

    
    
    @Override
    public void desenhar(Graphics g){
         if(img != null){
         g.drawImage(img.getImage(), x, y, null);
        }
       
    }

}

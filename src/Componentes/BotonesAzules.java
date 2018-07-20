/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;

/**
 *
 * @author iHector Lujan
 */
public class BotonesAzules extends JButton {
    
    public BotonesAzules(){
        setBackground(new Color(0,153,153));
        setForeground(Color.WHITE);
        setPreferredSize(new Dimension(150,35));
    }   
    
    public static void main(String[] args) {
        
    }
}

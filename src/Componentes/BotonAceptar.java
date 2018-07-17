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
public class BotonAceptar extends JButton {
   
    public BotonAceptar(){
        setOpaque(true);
        setBackground(Color.WHITE);
        setForeground(Color.BLUE);
        setPreferredSize(new Dimension(150,25));
        
    }
    
    public static void main(String[] args) {
        
    }
}

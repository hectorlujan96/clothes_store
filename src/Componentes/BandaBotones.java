/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author iHector Lujan
 */
public class BandaBotones extends JPanel {
    private Border borde;
    private JButton agregar;
    private JButton editar;
    private JButton eliminar;

    public BandaBotones(){
        agregar = new JButton("Agregar");
        editar = new JButton("Editar");
        eliminar = new JButton("Eliminar");
        borde = LineBorder.createBlackLineBorder();
        
        // Configuramos los botones.
        agregar.setBackground(new Color(0,204,51));
        
        editar.setBackground(new Color(0,153,255));
        
        eliminar.setBackground(new Color(255,51,51));        
        
        setPreferredSize(new Dimension(500,35));
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        setBorder(borde);
        add(agregar);
        add(editar);
        add(eliminar);
        
        // Eventos para los botones.
        agregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                agregar.setBackground(Color.LIGHT_GRAY);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                agregar.setBackground(new Color(0,204,102));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                agregar.setBackground(new Color(0,204,102));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                agregar.setBackground(new Color(0,204,51));
            }
        });
        
        editar.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                editar.setBackground(Color.LIGHT_GRAY);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                editar.setBackground(new Color(102,153,255));                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                editar.setBackground(new Color(102,153,255));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                editar.setBackground(new Color(0,153,255));
            }
        });
        
        eliminar.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                eliminar.setBackground(Color.LIGHT_GRAY);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                eliminar.setBackground(new Color(255,102,102));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                eliminar.setBackground(new Color(255,102,102));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                eliminar.setBackground(new Color(255,51,51));
            }
        });
        
        agregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("psdpoasmda");
            }
        });
        
    }    
    
    public static void main(String[] args) {
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spotifyprolog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bienvenida extends JFrame implements ActionListener {

    private JLabel  materia;

    Bienvenida(){
        Font fuente = new Font("Arial", 1, 16);
        setLayout(null);
        this.getContentPane().setBackground(new Color(33, 33, 33));
        setTitle("Spotify");
        materia = new JLabel("Programacion Logica y Funcional");
        materia.setForeground(Color.WHITE);
        materia.setBounds(800,5,300,30);
        materia.setFont(fuente);
        add(materia);
    }


    public static void Ejecutar(){
        Bienvenida clase = new Bienvenida();
        clase.setSize(1080, 720);
        clase.setLocationRelativeTo(null);
        clase.setVisible(true);
        clase.setResizable(false);
        clase.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spotifyprolog;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class Bienvenida extends JFrame implements ActionListener {

    private JLabel  materia, bienvenido, logo, selecciona;
    private ImageIcon logoImg, boton, botonH;

    private JButton continuar;

    Bienvenida() throws IOException {
        Font fuenteTextmini = new Font("Outfit", 0, 16);
        Font fuenteTitle = new Font("Outfit", 0, 60);
        Font fuente38 = new Font("Outfit", 0, 38);


        setLayout(null);
        this.getContentPane().setBackground(new Color(33, 33, 33));
        setTitle("Spotify");

        materia = new JLabel("Programacion Logica y Funcional");
        materia.setForeground(Color.WHITE);
        materia.setBounds(800,5,300,30);
        materia.setFont(fuenteTextmini);
        add(materia);

        bienvenido = new JLabel("Bienvenido a");
        bienvenido.setForeground(new Color(179, 179, 179));
        bienvenido.setBounds(50, 10, 500, 300);
        bienvenido.setFont(fuenteTitle);
        add(bienvenido);

        logo = new JLabel();
        logoImg = new ImageIcon(Objects.requireNonNull(getClass().getResource("./imagotipo.png")));
        logo.setIcon(new ImageIcon(logoImg.getImage().getScaledInstance(780,233,Image.SCALE_SMOOTH)));
        logo.setBounds(150, 220, 780, 233);
        add(logo);

        selecciona = new JLabel("Selecciona  tu musica");
        selecciona.setForeground(Color.white);
        selecciona.setBounds(340, 450, 400, 100);
        selecciona.setFont(fuente38);
        add(selecciona);

        boton = new ImageIcon(Objects.requireNonNull(getClass().getResource("./Vamos.png")));
        botonH = new ImageIcon(Objects.requireNonNull(getClass().getResource("./VamosH.png")));

        continuar = new JButton();
        continuar.setIcon(new ImageIcon(boton.getImage().getScaledInstance(300,75,Image.SCALE_SMOOTH)));
        continuar.setBackground(null);
        continuar.setBorder(null);
        continuar.setContentAreaFilled(false);;
        continuar.setFocusPainted(false);
        continuar.setBounds(370, 550, 300, 75);
        continuar.addActionListener(this);
        add(continuar);

        continuar.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                continuar.setIcon(new ImageIcon(botonH.getImage().getScaledInstance(300,75,Image.SCALE_SMOOTH)));
                continuar.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                continuar.setIcon(new ImageIcon(boton.getImage().getScaledInstance(300,75,Image.SCALE_SMOOTH)));

            }        });


    }


    public static void Ejecutar() throws IOException {
        Bienvenida clase = new Bienvenida();
        clase.setSize(1080, 720);
        clase.setLocationRelativeTo(null);
        clase.setVisible(true);
        clase.setResizable(false);
        clase.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == continuar){
            PantallaPrincipal.Ejecutar();
            dispose();
        }
    }
}

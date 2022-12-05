/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spotifyprolog;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class PantallaPrincipal  extends JFrame implements ActionListener {
    
    private ImageIcon espanol, ingles, coreano, pop, rock, alternativo, punk, hiphop, rap;
    private JLabel title;
    private JButton bespanol,bingles,bcoreano, bpop, brock, balternativo, bpunk, bhiphop, brap;
    
    PantallaPrincipal(){
        
        espanol = new ImageIcon("./Espanol.png");
        ingles = new ImageIcon("Ingles.png");
        coreano = new ImageIcon("Coreano.png");
        pop = new ImageIcon("Pop.png");
        alternativo = new ImageIcon("Alternativo.png");
        rock = new ImageIcon("Rock.png");
        punk = new ImageIcon("Punk.png");
        hiphop = new ImageIcon("Hiphop.png");
        rap = new ImageIcon("Rap.png");
        
        Font fuenteTextmini = new Font("Outfit", 0, 16);
        Font fuenteTitle = new Font("Outfit", 0, 38);
        Font fuente38 = new Font("Outfit", 0, 38);


        setLayout(null);
        this.getContentPane().setBackground(new Color(33, 33, 33));
        setTitle("Spotify");
        
        title = new JLabel("Configura a tu gusto");
        title.setForeground(Color.white);
        title.setBounds(365, 30, 350, 60);
        title.setFont(fuenteTitle);
        this.add(title);
 
        //BOTONES IDIOMAS
        bespanol = new JButton();
        bespanol.setIcon(espanol);
        bespanol.setBackground(null);
        bespanol.setBorder(null);
        bespanol.setContentAreaFilled(false);;
        bespanol.setFocusPainted(false);
        bespanol.setBounds(127, 455, 210, 45);
        bespanol.addActionListener(this);
        add(bespanol);
        
        bingles = new JButton();
        bingles.setIcon(ingles);
        bingles.setBackground(null);
        bingles.setBorder(null);
        bingles.setContentAreaFilled(false);;
        bingles.setFocusPainted(false);
        bingles.setBounds(435, 455, 210, 45);
        bingles.addActionListener(this);
        add(bingles);
        
        bcoreano = new JButton();
        bcoreano.setIcon(coreano);
        bcoreano.setBackground(null);
        bcoreano.setBorder(null);
        bcoreano.setContentAreaFilled(false);;
        bcoreano.setFocusPainted(false);
        bcoreano.setBounds(743, 455, 210, 45);
        bcoreano.addActionListener(this);
        add(bcoreano);
        
        bpop = new JButton();
        bpop.setIcon(pop);
        bpop.setBackground(null);
        bpop.setBorder(null);
        bpop.setContentAreaFilled(false);;
        bpop.setFocusPainted(false);
        bpop.setBounds(265, 520, 120, 60);
        bpop.addActionListener(this);
        add(bpop);
        
        bhiphop = new JButton();
        bhiphop.setIcon(hiphop);
        bhiphop.setBackground(null);
        bhiphop.setBorder(null);
        bhiphop.setContentAreaFilled(false);;
        bhiphop.setFocusPainted(false);
        bhiphop.setBounds(455, 520, 170, 60);
        bhiphop.addActionListener(this);
        add(bhiphop);
        
        brock = new JButton();
        brock.setIcon(rock);
        brock.setBackground(null);
        brock.setBorder(null);
        brock.setContentAreaFilled(false);;
        brock.setFocusPainted(false);
        brock.setBounds(695, 520, 120, 60);
        brock.addActionListener(this);
        add(brock);
        
        bpunk = new JButton();
        bpunk.setIcon(punk);
        bpunk.setBackground(null);
        bpunk.setBorder(null);
        bpunk.setContentAreaFilled(false);;
        bpunk.setFocusPainted(false);
        bpunk.setBounds(205, 600, 120, 60);
        bpunk.addActionListener(this);
        add(bpunk);
        
        balternativo = new JButton();
        balternativo.setIcon(alternativo);
        balternativo.setBackground(null);
        balternativo.setBorder(null);
        balternativo.setContentAreaFilled(false);;
        balternativo.setFocusPainted(false);
        balternativo.setBounds(440, 600, 200, 60);
        balternativo.addActionListener(this);
        add(balternativo);
        
        brap = new JButton();
        brap.setIcon(rap);
        brap.setBackground(null);
        brap.setBorder(null);
        brap.setContentAreaFilled(false);;
        brap.setFocusPainted(false);
        brap.setBounds(746, 600, 120, 60);
        brap.addActionListener(this);
        add(brap);
        
    }

    public static void Ejecutar(){
        PantallaPrincipal clase = new PantallaPrincipal();
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
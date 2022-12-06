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
    
    private ImageIcon espanol, ingles, coreano, pop, rock, alternativo, punk, hiphop, rap, espanolH, inglesH, coreanoH, popH, rockH, alternativoH, punkH, hiphopH, rapH;
    private ImageIcon album,play;
    private JLabel title, song, portada;
    private JButton bespanol,bingles,bcoreano, bpop, brock, balternativo, bpunk, bhiphop, brap, bplay;
    private JPanel list_songs   ;
    JScrollPane scroll;
    
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
        
        espanolH = new ImageIcon("EspanolH.png");
        inglesH = new ImageIcon("InglesH.png");
        coreanoH = new ImageIcon("CoreanoH.png");
        popH = new ImageIcon("PopH.png");
        alternativoH = new ImageIcon("AlternativoH.png");
        rockH = new ImageIcon("RockH.png");
        punkH = new ImageIcon("PunkH.png");
        hiphopH = new ImageIcon("HiphopH.png");
        rapH = new ImageIcon("RapH.png");
        
        album = new ImageIcon("Disco.png");
        play = new ImageIcon("Play.png");
        
        Font fuenteTextmini = new Font("Outfit", 0, 24);
        Font fuenteTitle = new Font("Outfit", 0, 38);


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
        
        bespanol.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bespanol.setIcon(new ImageIcon(espanolH.getImage().getScaledInstance(210,45,Image.SCALE_SMOOTH)));
                bespanol.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                bespanol.setIcon(new ImageIcon(espanol.getImage().getScaledInstance(210,45,Image.SCALE_SMOOTH)));

            }        });
        
        bingles = new JButton();
        bingles.setIcon(ingles);
        bingles.setBackground(null);
        bingles.setBorder(null);
        bingles.setContentAreaFilled(false);;
        bingles.setFocusPainted(false);
        bingles.setBounds(435, 455, 210, 45);
        bingles.addActionListener(this);
        add(bingles);
        
        bingles.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bingles.setIcon(new ImageIcon(inglesH.getImage().getScaledInstance(210,45,Image.SCALE_SMOOTH)));
                bingles.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                bingles.setIcon(new ImageIcon(ingles.getImage().getScaledInstance(210,45,Image.SCALE_SMOOTH)));

            }        });
        
        bcoreano = new JButton();
        bcoreano.setIcon(coreano);
        bcoreano.setBackground(null);
        bcoreano.setBorder(null);
        bcoreano.setContentAreaFilled(false);;
        bcoreano.setFocusPainted(false);
        bcoreano.setBounds(743, 455, 210, 45);
        bcoreano.addActionListener(this);
        add(bcoreano);
        
        bcoreano.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bcoreano.setIcon(new ImageIcon(coreanoH.getImage().getScaledInstance(210,45,Image.SCALE_SMOOTH)));
                bcoreano.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                bcoreano.setIcon(new ImageIcon(coreano.getImage().getScaledInstance(210,45,Image.SCALE_SMOOTH)));

            }        });
        
        //BOTONES DE GENEROS
        
        bpop = new JButton();
        bpop.setIcon(pop);
        bpop.setBackground(null);
        bpop.setBorder(null);
        bpop.setContentAreaFilled(false);;
        bpop.setFocusPainted(false);
        bpop.setBounds(265, 520, 120, 60);
        bpop.addActionListener(this);
        add(bpop);
        
        bpop.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bpop.setIcon(new ImageIcon(popH.getImage().getScaledInstance(120,60,Image.SCALE_SMOOTH)));
                bpop.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                bpop.setIcon(new ImageIcon(pop.getImage().getScaledInstance(120,60,Image.SCALE_SMOOTH)));

            }        });
        
        bhiphop = new JButton();
        bhiphop.setIcon(hiphop);
        bhiphop.setBackground(null);
        bhiphop.setBorder(null);
        bhiphop.setContentAreaFilled(false);;
        bhiphop.setFocusPainted(false);
        bhiphop.setBounds(455, 520, 170, 60);
        bhiphop.addActionListener(this);
        add(bhiphop);
        
        bhiphop.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bhiphop.setIcon(new ImageIcon(hiphopH.getImage().getScaledInstance(170,60,Image.SCALE_SMOOTH)));
                bhiphop.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                bhiphop.setIcon(new ImageIcon(hiphop.getImage().getScaledInstance(170,60,Image.SCALE_SMOOTH)));

            }        });
        
        brock = new JButton();
        brock.setIcon(rock);
        brock.setBackground(null);
        brock.setBorder(null);
        brock.setContentAreaFilled(false);;
        brock.setFocusPainted(false);
        brock.setBounds(695, 520, 120, 60);
        brock.addActionListener(this);
        add(brock);
        
        brock.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                brock.setIcon(new ImageIcon(rockH.getImage().getScaledInstance(120,60,Image.SCALE_SMOOTH)));
                brock.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                brock.setIcon(new ImageIcon(rock.getImage().getScaledInstance(120,60,Image.SCALE_SMOOTH)));

            }        });
        
        bpunk = new JButton();
        bpunk.setIcon(punk);
        bpunk.setBackground(null);
        bpunk.setBorder(null);
        bpunk.setContentAreaFilled(false);;
        bpunk.setFocusPainted(false);
        bpunk.setBounds(205, 600, 120, 60);
        bpunk.addActionListener(this);
        add(bpunk);
        
        bpunk.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bpunk.setIcon(new ImageIcon(punkH.getImage().getScaledInstance(120,60,Image.SCALE_SMOOTH)));
                bpunk.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                bpunk.setIcon(new ImageIcon(punk.getImage().getScaledInstance(120,60,Image.SCALE_SMOOTH)));

            }        });
        
        balternativo = new JButton();
        balternativo.setIcon(alternativo);
        balternativo.setBackground(null);
        balternativo.setBorder(null);
        balternativo.setContentAreaFilled(false);;
        balternativo.setFocusPainted(false);
        balternativo.setBounds(440, 600, 200, 60);
        balternativo.addActionListener(this);
        add(balternativo);
        
        balternativo.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                balternativo.setIcon(new ImageIcon(alternativoH.getImage().getScaledInstance(200,60,Image.SCALE_SMOOTH)));
                balternativo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                balternativo.setIcon(new ImageIcon(alternativo.getImage().getScaledInstance(200,60,Image.SCALE_SMOOTH)));

            }        });
        
        brap = new JButton();
        brap.setIcon(rap);
        brap.setBackground(null);
        brap.setBorder(null);
        brap.setContentAreaFilled(false);;
        brap.setFocusPainted(false);
        brap.setBounds(746, 600, 120, 60);
        brap.addActionListener(this);
        add(brap);
        
        brap.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                brap.setIcon(new ImageIcon(rapH.getImage().getScaledInstance(120,60,Image.SCALE_SMOOTH)));
                brap.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                brap.setIcon(new ImageIcon(rap.getImage().getScaledInstance(120,60,Image.SCALE_SMOOTH)));

            }        });
        
        //PANEL DE CANCIONES
        list_songs = new JPanel();
        
        scroll = new JScrollPane(list_songs);
        scroll.setBounds(505, 125, 450, 250);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        this.add(scroll);
        
        portada = new JLabel();
        portada.setIcon(album);
        portada.setBackground(null);
        portada.setBorder(null);
        portada.setBounds(157, 125, 150, 150);
        add(portada);
        
        song = new JLabel("Nombre canción");
        song.setForeground(Color.white);
        song.setBounds(144, 288, 200, 20);
        song.setFont(fuenteTextmini);
        this.add(song);
        
        bplay = new JButton();
        bplay.setIcon(play);
        bplay.setBackground(null);
        bplay.setBorder(null);
        bplay.setContentAreaFilled(false);;
        bplay.setFocusPainted(false);
        bplay.setBounds(201, 336, 60, 60);
        bplay.addActionListener(this);
        add(bplay);
        
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
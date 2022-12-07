/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spotifyprolog;

import org.jpl7.Query;
import org.jpl7.Term;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class PantallaPrincipal  extends JFrame implements ActionListener {


    private final ImageIcon espanol, ingles, coreano, pop, rock, alternativo, punk, hiphop, rap, espanolH, inglesH, coreanoH, popH, rockH, alternativoH, punkH, hiphopH, rapH;
    private final ImageIcon album, play, stop;
    private final JLabel title, portada;
    private final JToggleButton bespanol, bingles, bcoreano, bpop, brock, balternativo, bpunk, bhiphop, brap, bplay;
    ButtonGroup idioma;
    ButtonGroup genero;
    String generoS, idiomaS;

    JLabel nombreF, artistaF, albumF;
    JButton reproducir;

    //TABLA

    PantallaPrincipal() {
        Font fuenteTextmini = new Font("Outfit", 0, 24);
        Font fuenteTitle = new Font("Outfit", 0, 38);

        idioma = new ButtonGroup();
        genero = new ButtonGroup();

        nombreF = new JLabel("Nombre");
        nombreF.setBounds(325, 150, 250, 150);
        nombreF.setFont(fuenteTextmini);
        nombreF.setForeground(Color.WHITE);
        add(nombreF);
        artistaF = new JLabel("Artista");
        artistaF.setBounds(525  , 150, 150, 150);
        artistaF.setFont(fuenteTextmini);
        artistaF.setForeground(Color.WHITE);
        add(artistaF);
        albumF = new JLabel("Album");
        albumF.setBounds(725, 150, 150, 150);
        albumF.setFont(fuenteTextmini);
        albumF.setForeground(Color.WHITE);
        add(albumF);
//        reproducir = new JButton("Reproducir");
//        reproducir.setBounds(850, 200, 200, 50);
//        reproducir.setFont(fuenteTextmini);
//        reproducir.setForeground(Color.BLACK);
//        add(reproducir);

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
        stop = new ImageIcon("Stop.png");





        setLayout(null);
        this.getContentPane().setBackground(new Color(33, 33, 33));
        setTitle("Spotify");

        title = new JLabel("Configura a tu gusto");
        title.setForeground(Color.white);
        title.setBounds(365, 30, 350, 60);
        title.setFont(fuenteTitle);
        this.add(title);

        //BOTONES IDIOMAS
        bespanol = new JToggleButton();
        bespanol.setIcon(espanol);
        bespanol.setBackground(null);
        bespanol.setBorder(null);
        bespanol.setContentAreaFilled(false);
        bespanol.setFocusPainted(false);
        bespanol.setBounds(127, 455, 210, 45);
        bespanol.addActionListener(this);
        idioma.add(bespanol);
        add(bespanol);

        bespanol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bespanol.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

        });

        bingles = new JToggleButton();
        bingles.setIcon(ingles);
        bingles.setBackground(null);
        bingles.setBorder(null);
        bingles.setContentAreaFilled(false);
        bingles.setFocusPainted(false);
        bingles.setBounds(435, 455, 210, 45);
        bingles.addActionListener(this);
        idioma.add(bingles);
        add(bingles);

        bingles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bingles.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

        });

        bcoreano = new JToggleButton();
        bcoreano.setIcon(coreano);
        bcoreano.setBackground(null);
        bcoreano.setBorder(null);
        bcoreano.setContentAreaFilled(false);
        bcoreano.setFocusPainted(false);
        bcoreano.setBounds(743, 455, 210, 45);
        bcoreano.addActionListener(this);
        idioma.add(bcoreano);

        add(bcoreano);

        bcoreano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bcoreano.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

        });

        //BOTONES DE GENEROS

        bpop = new JToggleButton();
        bpop.setIcon(pop);
        bpop.setBackground(null);
        bpop.setBorder(null);
        bpop.setContentAreaFilled(false);
        //  bpop.setFocusPainted(false);
        bpop.setBounds(265, 520, 120, 60);
        bpop.addActionListener(this);
        genero.add(bpop);
        add(bpop);

        bpop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bpop.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

        });

        bhiphop = new JToggleButton();
        bhiphop.setIcon(hiphop);
        bhiphop.setBackground(null);
        bhiphop.setBorder(null);
        bhiphop.setContentAreaFilled(false);
        bhiphop.setFocusPainted(false);
        bhiphop.setBounds(455, 520, 170, 60);
        bhiphop.addActionListener(this);
        genero.add(bhiphop);
        add(bhiphop);

        bhiphop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bhiphop.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
        });

        brock = new JToggleButton();
        brock.setIcon(rock);
        brock.setBackground(null);
        brock.setBorder(null);
        brock.setContentAreaFilled(false);
        brock.setFocusPainted(false);
        brock.setBounds(695, 520, 120, 60);
        brock.addActionListener(this);
        genero.add(brock);
        add(brock);

        brock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                brock.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

        });

        bpunk = new JToggleButton();
        bpunk.setIcon(punk);
        bpunk.setBackground(null);
        bpunk.setBorder(null);
        bpunk.setContentAreaFilled(false);
        bpunk.setFocusPainted(false);
        bpunk.setBounds(205, 600, 120, 60);
        bpunk.addActionListener(this);
        genero.add(bpunk);
        add(bpunk);

        bpunk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bpunk.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

        });

        balternativo = new JToggleButton();
        balternativo.setIcon(alternativo);
        balternativo.setBackground(null);
        balternativo.setBorder(null);
        balternativo.setContentAreaFilled(false);
        balternativo.setFocusPainted(false);
        balternativo.setBounds(440, 600, 200, 60);
        balternativo.addActionListener(this);
        genero.add(balternativo);
        add(balternativo);

        balternativo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                balternativo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

        });

        brap = new JToggleButton();
        brap.setIcon(rap);
        brap.setBackground(null);
        brap.setBorder(null);
        brap.setContentAreaFilled(false);
        brap.setFocusPainted(false);
        brap.setBounds(746, 600, 120, 60);
        brap.addActionListener(this);
        genero.add(brap);
        add(brap);

        brap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                brap.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

        });

        //TABLA SECCION


        //PANEL DE CANCIONES


//        list_songs.setLayout(CENTER_ALIGNMENT);


        //PORTADA
        portada = new JLabel();
        portada.setIcon(album);
        portada.setBackground(null);
        portada.setBorder(null);
        portada.setBounds(157, 150, 150, 150);
        add(portada);

//        song = new JLabel("Nombre canción");
//        song.setForeground(Color.white);
//        song.setBounds(144, 288, 200, 20);
//        song.setFont(fuenteTextmini);
//        this.add(song);

        bplay = new JToggleButton();
        bplay.setIcon(play);
        bplay.setBackground(null);
        bplay.setBorder(null);
        bplay.setContentAreaFilled(false);
        bplay.setFocusPainted(false);
        bplay.setBounds(910, 190, 60, 60);
        bplay.addActionListener(this);
        add(bplay);

    }

    public static void Ejecutar() {
        PantallaPrincipal clase = new PantallaPrincipal();
        clase.setSize(1080, 720);
        clase.setLocationRelativeTo(null);
        clase.setVisible(true);
        clase.setResizable(false);
        clase.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (bpop.isSelected()) {
            generoS = "pop";
            bpop.setIcon(popH);
        } else bpop.setIcon(pop);

        if (brap.isSelected()) {
            generoS = "rap";
            brap.setIcon(rapH);
        } else brap.setIcon(rap);

        if (bhiphop.isSelected()) {
            generoS = "hiphop";
            bhiphop.setIcon(hiphopH);
        } else bhiphop.setIcon(hiphop);

        if (brock.isSelected()) {
            generoS = "rock";
            brock.setIcon(rockH);
        } else brock.setIcon(rock);

        if (balternativo.isSelected()) {
            generoS = "alternativo";
            balternativo.setIcon(alternativoH);
        } else balternativo.setIcon(alternativo);

        if (bpunk.isSelected()) {
            generoS = "punk";
            bpunk.setIcon(punkH);
        } else bpunk.setIcon(punk);

        if (bespanol.isSelected()) {
            idiomaS = "espanol";
            bespanol.setIcon(espanolH);
        } else bespanol.setIcon(espanol);

        if (bingles.isSelected()) {
            idiomaS = "ingles";
            bingles.setIcon(inglesH);
        } else bingles.setIcon(ingles);

        if (bcoreano.isSelected()) {
            idiomaS = "coreano";
            bcoreano.setIcon(coreanoH);
        } else bcoreano.setIcon(coreano);

        if (bplay.isSelected()) {
            bplay.setIcon(stop);
        } else bplay.setIcon(play);

        if (bcoreano.isSelected() || bespanol.isSelected() || bingles.isSelected())
            if (bpop.isSelected() || bhiphop.isSelected() || brock.isSelected() || bpunk.isSelected() || balternativo.isSelected() || brap.isSelected()) {
                consultarLista(generoS, idiomaS);
            }


    }




    public ArrayList<Cancion> consultarLista(String g, String id) {
        ArrayList<Cancion> lista = new ArrayList<>();
        //ARCHIVO A CONSULTAR
        String conexion = "consult('spot.pl')";
        Query con = new Query(conexion);
        //HACE LA CONEXION
        System.out.println(conexion + "" + (con.hasMoreSolutions() ? "ACEPTADO" : "FALLADO"));
        System.out.println("Iniciando la prueba");
        //SE HACE LA CONSULTA
        String consul = "obtenertodo(X," + id + ",Y,Z," + g + ")";
        Query ejecutar = new Query(consul);

        //SI HAY RESPUESTA
        if (ejecutar.hasSolution()) {
            //SE GUARDA EN UN ARREGLO DE MAPAS
            Map<String, Term>[] listOfMaps = ejecutar.allSolutions();
            //SE ITERAN HASTA OBNTENER LOS PUROS MAPAS
            for (Map<String, Term> obtenido : listOfMaps) {
                System.out.println(obtenido);
                String nombre =String.valueOf(obtenido.get("X")).replaceAll("_"," ");
                String artista = String.valueOf(obtenido.get("Y")).replaceAll("_"," ");
                String album = String.valueOf(obtenido.get("Z")).replaceAll("_"," ");
                nombreF.setText(nombre.substring(0, 1).toUpperCase() + nombre.substring(1));
                artistaF.setText(artista.substring(0, 1).toUpperCase() + artista.substring(1));
                albumF.setText(album.substring(0, 1).toUpperCase() + album.substring(1));
            }

            return lista;

        }
        return null;

    }








}
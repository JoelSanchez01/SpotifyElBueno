package com.mycompany.spotifyprolog;

public class Music {
    String nombre, artista, disco;

    public Music(){

    }


    public Music(String nombre, String artista, String disco) {
        this.nombre = nombre;
        this.artista = artista;
        this.disco = disco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }
}

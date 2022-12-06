/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.spotifyprolog;

import java.io.IOException;
import java.util.*;

import org.jpl7.Query;
import org.jpl7.Term;

/**
 *
 * @author citla
 */
public class Main {

    public static void main(String[] args) throws IOException {
            Bienvenida.Ejecutar();
    }


//para obtener el puro valor del mapa
//            for(Term value: obtenido.values()){
//                        System.out.println(String.valueOf(value));
//                        }

public static void PROLOG(){

    //VAIRABLES PARA CAMBIAR LA CONSULTA
    String sig = "B";
    String idioma = "A";
    //ARCHIVO A CONSULTAR
    String conexion = "consult('spot.pl')";
    Query con = new Query(conexion);
    //HACE LA CONEXION
    System.out.println(conexion + "" + (con.hasMoreSolutions() ? "ACEPTADO" : "FALLADO"));
    System.out.println("Iniciando la prueba");
    //SE HACE LA CONSULTA
    String consul = "obtenertodo(X,"+idioma+",Y,Z,"+sig+")";
    Query ejecutar = new Query(consul);

    //SI HAY RESPUESTA
    if (ejecutar.hasSolution()) {
        //SE GUARDA EN UN ARREGLO DE MAPAS
        Map<String, Term>[] listOfMaps = ejecutar.allSolutions();
        //SE ITERAN HASTA OBNTENER LOS PUROS MAPAS
        for (Map<String, Term> obtenido : listOfMaps) {
            System.out.println(obtenido);
        }

    }

}

}
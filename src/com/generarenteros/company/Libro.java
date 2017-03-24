package com.generarenteros.company;

/**
 * Created by carlosjoseanguiano on 23/03/17.
 */
public enum Libro {

    JHTP( "Programar en java uno 1", "2011"),

    CHTP("Programar en java dos 2", "2012"),

    IW3HTP("Programar en java tres 3", "2013"),

    CPPHTP("Programar en java cuatro 4", "2014"),

    VBHTP("Programar en java dos cinco 5", "2015"),

    CSHARHTP("Programar en java dos seis 6", "2016");

    private final String titulo;
    private final String anioCopyright;

    Libro(String tituloLibro, String anioCopyrightLibro) {
        titulo = tituloLibro;
        anioCopyright = anioCopyrightLibro;
    }

    public String obtenerTitulo() {
        return titulo;
    }

    public String obtenerAnioCopyrigth() {
        return anioCopyright;
    }
}

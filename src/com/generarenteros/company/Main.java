package com.generarenteros.company;

import java.util.EnumSet;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Todos los libros :\n");

        for (Libro libro : Libro.values()) {
            System.out.printf("%-10s%-45s%s\n", libro,libro.obtenerTitulo(),libro.obtenerAnioCopyrigth());
        }
        System.out.println("\nMostrar un rango de contantates enum:\n");

        for (Libro libro : EnumSet.range(Libro.JHTP, Libro.CPPHTP))
            System.out.printf("%-10s%-45s%s\n", libro,libro.obtenerTitulo(),libro.obtenerAnioCopyrigth());

    }
}



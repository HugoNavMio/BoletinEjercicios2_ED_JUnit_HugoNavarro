package com.hugonavarro.ejerciciosjunit;

public class Ej4ObtenerMayorRachaPositiva {
    public static int obtenerMayorRachaPositiva(int[] puntos) {
        if (puntos == null) {
            throw new IllegalArgumentException("Array nulo");
        }

        int mayorRacha = 0;
        int rachaActual = 0;

        for (int punto : puntos) {
            if (punto > 0) {
                rachaActual++;

                if (rachaActual > mayorRacha) {
                    mayorRacha = rachaActual;
                }
            } else {
                rachaActual = 0;
            }
        }
        return mayorRacha;
    }
}

package com.hugonavarro.ejerciciosjunit;

public class Ej3CalcularPuntuacionDado {
    public static int calcularPuntuacionDado(int[] tirada) {
        if (tirada == null) {
            throw new IllegalArgumentException("Tirada null");
        }
        if (tirada.length != 5) {
            throw new IllegalArgumentException("Tirada inválida");
        }
        for (int dado : tirada) {
            if (dado < 1 || dado > 6) {
                throw new IllegalArgumentException("Valores inválidos");
            }
        }

        int[] frecuencia = new int[7];
        int suma = 0;

        for (int dado : tirada) {
            frecuencia[dado]++;
            suma += dado;
        }

        for (int i = 1; i <= 6; i++) {
            if (frecuencia[i] == 5) {
                return 50;
            }
        }

        if (esEscalera(frecuencia)) {
            return 40;
        }

        boolean cuatroIguales = false;
        boolean tresIguales = false;
        boolean dosIguales = false;

        for (int i = 1; i <= 6; i++) {
            if (frecuencia[i] == 4) {
                cuatroIguales = true;
            }
            if (frecuencia[i] == 3) {
                tresIguales = true;
            }
            if (frecuencia[i] == 2) {
                dosIguales = true;
            }
        }

        if (cuatroIguales) {
            return 30;
        }

        if (tresIguales && dosIguales) {
            return 25;
        }
        return suma;
    }

    public static boolean esEscalera(int[] frecuencia) {
        return (frecuencia[1] == 1 &&
                frecuencia[2] == 1 &&
                frecuencia[3] == 1 &&
                frecuencia[4] == 1 &&
                frecuencia[5] == 1)
                ||
                (frecuencia[2] == 1 &&
                frecuencia[3] == 1 &&
                frecuencia[4] == 1 &&
                frecuencia[5] == 1 &&
                frecuencia[6] == 1);
    }
}

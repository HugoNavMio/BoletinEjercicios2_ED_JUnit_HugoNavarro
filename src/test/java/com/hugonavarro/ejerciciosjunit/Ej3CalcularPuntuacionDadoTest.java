package com.hugonavarro.ejerciciosjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ej3CalcularPuntuacionDadoTest {
    @Test
    void tiradaNula() {
        assertThrows(IllegalArgumentException.class, () -> Ej3CalcularPuntuacionDado.calcularPuntuacionDado(null));
    }
    @Test
    void menosDe5Dados() {
        assertThrows(IllegalArgumentException.class, () -> Ej3CalcularPuntuacionDado.calcularPuntuacionDado(new int[] {1, 2, 3}));
    }
    @Test
    void dadoMenorQue1() {
        assertThrows(IllegalArgumentException.class, () -> Ej3CalcularPuntuacionDado.calcularPuntuacionDado(new int[] {3, 3, -2, -4, 2}));
    }
    @Test
    void dadoMayorQue6() {
        assertThrows(IllegalArgumentException.class, () -> Ej3CalcularPuntuacionDado.calcularPuntuacionDado(new int[] {5, 5, 5, 10, 10}));
    }
    @Test
    void cincoDadosIguales() {
        assertEquals(50, Ej3CalcularPuntuacionDado.calcularPuntuacionDado(new int[] {1, 1, 1, 1, 1}));
    }
    @Test
    void escaleraDel1Al5() {
        assertEquals(40, Ej3CalcularPuntuacionDado.calcularPuntuacionDado(new int[] {1, 2, 3, 4, 5}));
    }
    @Test
    void escaleraDel2Al6() {
        assertEquals(40, Ej3CalcularPuntuacionDado.calcularPuntuacionDado(new int[] {2, 3, 4, 5, 6}));
    }
    @Test
    void cuatroDadosIguales() {
        assertEquals(30, Ej3CalcularPuntuacionDado.calcularPuntuacionDado(new int[] {4, 4, 4, 2, 4}));
    }
    @Test
    void full() {
        assertEquals(25, Ej3CalcularPuntuacionDado.calcularPuntuacionDado(new int[] {6, 6, 1, 1, 1}));
    }
    @Test
    void sumaDeDados() {
        assertEquals(14, Ej3CalcularPuntuacionDado.calcularPuntuacionDado(new int[] {1, 2, 2, 6, 3}));
    }
}
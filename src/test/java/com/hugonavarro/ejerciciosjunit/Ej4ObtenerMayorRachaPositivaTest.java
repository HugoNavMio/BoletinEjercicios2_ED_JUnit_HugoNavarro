package com.hugonavarro.ejerciciosjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ej4ObtenerMayorRachaPositivaTest {
    @Test
    void arrayNulo() {
        assertThrows(IllegalArgumentException.class, () -> Ej4ObtenerMayorRachaPositiva.obtenerMayorRachaPositiva(null));
    }
    @Test
    void arrayVacio() {
        assertEquals(0, Ej4ObtenerMayorRachaPositiva.obtenerMayorRachaPositiva(new int[] {}));
    }
    @Test
    void arrayConTodoCeros() {
        assertEquals(0, Ej4ObtenerMayorRachaPositiva.obtenerMayorRachaPositiva(new int[] {0, 0, 0}));
    }
    @Test
    void arrayConTodoNegativos() {
        assertEquals(0, Ej4ObtenerMayorRachaPositiva.obtenerMayorRachaPositiva(new int[] {-1, -2, -3}));
    }
    @Test
    void arrayConAlgunCero() {
        assertEquals(2, Ej4ObtenerMayorRachaPositiva.obtenerMayorRachaPositiva(new int[] {1, 2, 0, 3}));
    }
    @Test
    void arrayConAlgunNegativo() {
        assertEquals(3, Ej4ObtenerMayorRachaPositiva.obtenerMayorRachaPositiva(new int[] {1, -2, 3, 4, 5}));
    }
    @Test
    void arrayConCerosYNegativos() {
        assertEquals(4, Ej4ObtenerMayorRachaPositiva.obtenerMayorRachaPositiva(new int[] {1, 2, 3, 4, -5, 6, 0, 7, 8}));
    }
    @Test
    void arraySinCerosYSinNegativos() {
        assertEquals(5, Ej4ObtenerMayorRachaPositiva.obtenerMayorRachaPositiva(new int[] {1, 2, 3, 4, 5}));
    }
}
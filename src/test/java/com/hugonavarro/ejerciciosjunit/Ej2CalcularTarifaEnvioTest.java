package com.hugonavarro.ejerciciosjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ej2CalcularTarifaEnvioTest {
    @Test
    void pesoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> Ej2CalcularTarifaEnvio.calcularTarifaEnvio(-15, "NACIONAL", false));
    }
    @Test
    void zonaNula() {
        assertThrows(IllegalArgumentException.class, () -> Ej2CalcularTarifaEnvio.calcularTarifaEnvio(7, null, false));
    }
    @Test
    void pesoExcedido() {
        assertThrows(IllegalArgumentException.class, () -> Ej2CalcularTarifaEnvio.calcularTarifaEnvio(30, "INTERNACIONAL", false));
    }
    @Test
    void zonaLocal() {
        assertEquals(7.5, Ej2CalcularTarifaEnvio.calcularTarifaEnvio(15.50, "LOCAL", false));
    }
    @Test
    void zonaNacional() {
        assertEquals(7.0, Ej2CalcularTarifaEnvio.calcularTarifaEnvio(2, "NACIONAL", false));
    }
    @Test
    void zonaInternacional() {
        assertEquals(14.0, Ej2CalcularTarifaEnvio.calcularTarifaEnvio(3.25, "INTERNACIONAL", false));
    }
    @Test
    void pesoMayorQue5() {
        assertEquals(9.0, Ej2CalcularTarifaEnvio.calcularTarifaEnvio(10, "NACIONAL", false));
    }
    @Test
    void pesoMayorQue1() {
        assertEquals(5.5, Ej2CalcularTarifaEnvio.calcularTarifaEnvio(1.55, "LOCAL", false));
    }
    @Test
    void envioUrgente() {
        assertEquals(13.5, Ej2CalcularTarifaEnvio.calcularTarifaEnvio(7.75, "NACIONAL", true));
    }
}
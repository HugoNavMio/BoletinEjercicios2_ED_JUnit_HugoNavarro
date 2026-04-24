package com.hugonavarro.ejerciciosjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ej1ValidarUsuarioTest {
    @Test
    void nombreNulo() {
        assertThrows(IllegalArgumentException.class, () -> Ej1ValidarUsuario.validarUsuario(null));
    }
    @Test
    void nombreVacio() {
        assertFalse(Ej1ValidarUsuario.validarUsuario(""));
    }
    @Test
    void nombreCorto() {
        assertFalse(Ej1ValidarUsuario.validarUsuario("Pol"));
    }
    @Test
    void nombreLargo() {
        assertFalse(Ej1ValidarUsuario.validarUsuario("PabloAlejandro"));
    }
    @Test
    void nombreConNumeros() {
        assertFalse(Ej1ValidarUsuario.validarUsuario("65Raul"));
    }
    @Test
    void nombreConSimbolos() {
        assertFalse(Ej1ValidarUsuario.validarUsuario("@drián"));
    }
    @Test
    void nombreConGuionBajo() {
        assertTrue(Ej1ValidarUsuario.validarUsuario("Mar_cos"));
    }
    @Test
    void nombreConSimbolosYGuionBajo() {
        assertTrue(Ej1ValidarUsuario.validarUsuario("Ju_li0"));
    }
    @Test
    void nombreNormal() {
        assertTrue(Ej1ValidarUsuario.validarUsuario("Lucas"));
    }
}
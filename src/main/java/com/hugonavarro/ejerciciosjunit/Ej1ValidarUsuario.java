package com.hugonavarro.ejerciciosjunit;

public class Ej1ValidarUsuario {
    public static boolean validarUsuario(String nombre) {
        if (nombre == null) {
            throw new IllegalArgumentException("Nombre nulo");
        }

        String limpio = nombre.trim();

        if (limpio.isEmpty()) {
            return false;
        }

        if (limpio.length() < 4 || limpio.length() > 12) {
            return false;
        }

        if (!Character.isLetter(limpio.charAt(0))) {
            return false;
        }

        for (int i = 0; i < limpio.length(); i++) {
            char c = limpio.charAt(i);
            if (!Character.isLetterOrDigit(c) && c != '_') {
                return false;
            }
        }
        return true;
    }
}
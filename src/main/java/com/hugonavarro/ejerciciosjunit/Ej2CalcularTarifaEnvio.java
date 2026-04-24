package com.hugonavarro.ejerciciosjunit;

public class Ej2CalcularTarifaEnvio {
    public static double calcularTarifaEnvio(double pesoKg, String zona, boolean urgente) {
        if (pesoKg <= 0) {
            throw new IllegalArgumentException("Peso no válido");
        }
        if (zona == null) {
            throw new IllegalArgumentException("Zona no válida");
        }

        double base = switch (zona.toUpperCase()) {
            case "LOCAL" -> base = 3.5;
            case "NACIONAL" -> base = 5.0;
            case "INTERNACIONAL" -> base = 12.0;
            default -> throw new IllegalArgumentException("Zona no válida");
        };

        if (pesoKg > 20) {
            throw new IllegalArgumentException("Peso excedido");
        }

        if (pesoKg > 5) {
            base += 4.0;
        } else if (pesoKg > 1) {
            base += 2.0;
        }


        if (urgente) {
            base *= 1.5;
        }

        return base;
    }
}

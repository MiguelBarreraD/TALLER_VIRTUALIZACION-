package org.example;

public class Calculadora {

    public static double calcularSeno(double anguloEnGrados) {
        double anguloEnRadianes = Math.toRadians(anguloEnGrados);
        return Math.sin(anguloEnRadianes);
    }

    public static double calcularCoseno(double anguloEnGrados) {
        double anguloEnRadianes = Math.toRadians(anguloEnGrados);
        return Math.cos(anguloEnRadianes);
    }


    public static boolean esPalindromo(String cadena) {
        String cadenaSinEspacios = cadena.replaceAll("\\s", "").toLowerCase();
        String cadenaInvertida = new StringBuilder(cadenaSinEspacios).reverse().toString();
        return cadenaSinEspacios.equals(cadenaInvertida);
    }

    public static double calcularMagnitudVector(double componenteX, double componenteY) {
        return Math.sqrt(Math.pow(componenteX, 2) + Math.pow(componenteY, 2));
    }



}

package org.example;

import static spark.Spark.port;
import static spark.Spark.get;
public class SparkWebServer {

    public static void main(String... args){

        port(getPort());

        get("Sin/:angulo", (req,res) -> {
            double angulo = Double.parseDouble(req.params(":angulo"));
            return Calculadora.calcularSeno(angulo);
        });

        get("Cos/:angulo", (req,res) -> {
            double angulo = Double.parseDouble(req.params(":angulo"));
            return Calculadora.calcularCoseno(angulo);
        });

        get("Magnitud/:x/:y", (req,res) -> {
            double num1 = Double.parseDouble(req.params(":x"));
            double num2 = Double.parseDouble(req.params(":y"));
            return Calculadora.calcularMagnitudVector(num1, num2);
        });

        get("Palindromo/:palabra", (req,res) -> {
            String palabra = req.params(":palabra");
            return Calculadora.esPalindromo(palabra);
        });

        get("index.htlm", (req,res) -> {
            return null;
        });

    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}

package org.example;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;
import org.junit.Test;


public class OperacionesMatematicasTest {

    @Test
    public void testCalcularSeno() {
        double resultado = Calculadora.calcularSeno(30.0);
        assertEquals(0.5, resultado, 0.0001); // Acepta un error de hasta 0.0001

        resultado = Calculadora.calcularSeno(90.0);
        assertEquals(1.0, resultado, 0.0001);
    }

    @Test
    public void testCalcularCoseno() {
        double resultado = Calculadora.calcularCoseno(60.0);
        assertEquals(0.5, resultado, 0.0001);

        resultado = Calculadora.calcularCoseno(0.0);
        assertEquals(1.0, resultado, 0.0001);
    }

    @Test
    public void testEsPalindromo() {
        assertTrue(Calculadora.esPalindromo("reconocer"));
        assertTrue(Calculadora.esPalindromo("Anita lava la tina"));
        assertFalse(Calculadora.esPalindromo("hola"));
    }

    @Test
    public void testCalcularMagnitudVector() {
        double resultado = Calculadora.calcularMagnitudVector(3.0, 4.0);
        assertEquals(5.0, resultado, 0.0001);

        resultado = Calculadora.calcularMagnitudVector(0.0, 0.0);
        assertEquals(0.0, resultado, 0.0001);
    }
}

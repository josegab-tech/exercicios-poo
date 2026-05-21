package models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;


public class CalculadoraTest {
    
    private Calculadora calc;

    @BeforeEach
    void setUp(){
        calc = new Calculadora();
    }

    @Test
    void testSoma(){
        int resultado = calc.somar(2,3);
        assertEquals(5, resultado, "A soma 2 + 3 deveria ser 5");
    }

    @Test
    void testSubtracaoNegativo(){
        int resultado = calc.subtrair(2, 5);
        assertEquals(-3, resultado);
    }

    @Test
    void testMultplicacaoNegativo(){
        int resultado = calc.multiplicar(0, 10);
        assertEquals(0, resultado);
    }

    @Test
    void testDivisaoExata(){
        int resultado = calc.dividir(10, 2);
        assertEquals(5.0, resultado);
    }

    @Test
    void testDivisaoPorZero(){
        assertThrows(IllegalArgumentException.class , ()-> calc.dividir(10,2));
    }

    @Test
    void testMult(){
        int resultado = calc.multiplicar(5, 15);
        assertEquals(75, resultado, "A multiplicação de 5 * 15 deveria ser 75");
    }
}

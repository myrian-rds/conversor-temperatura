package br.edu.icomp.ufam.gc.myrian;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorCelsiusTest {

    private Conversor conversorTest;

    @BeforeEach
    public void setup(){
        conversorTest = new Conversor('C', 20);
    }

    @Test
    public void testeConvertendoDeCelsiusParaFahrenheit() {
        conversorTest.converter('F');

        assertEquals(conversorTest.getTemp().getEscala(), 'F');
        assertEquals(conversorTest.getTemp().getTemperatura(), 68.00);
    }
}
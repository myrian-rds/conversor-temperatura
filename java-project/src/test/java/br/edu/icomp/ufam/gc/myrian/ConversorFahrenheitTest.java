package br.edu.icomp.ufam.gc.myrian;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// import org.junit.Assert.assertEquals;
// import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorFahrenheitTest {

    private Conversor conversorTest;

    @BeforeEach
    public void setup(){
        conversorTest = new Conversor('F', 40);
    }

    @Test
    public void testeConvertendoDeFahrenheitParaCelsius() {
        conversorTest.converter('C');

        assertEquals(conversorTest.getTemp().getEscala(), 'C');
        assertEquals(conversorTest.getTemp().getTemperatura(), 10.00);
    }
}
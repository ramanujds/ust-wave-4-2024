package wave4.service;

import com.ust.wave4.service.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testAdd(){

        Calculator calculator = new Calculator();
        Assertions.assertEquals(30, calculator.add(10,20));
        Assertions.assertEquals(0,calculator.add(0,0));
        Assertions.assertEquals(-5,calculator.add(5,-10));

    }

}

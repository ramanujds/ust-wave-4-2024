package wave4.service;

import com.ust.wave4.service.Calculator;
import org.junit.jupiter.api.*;

public class CalculatorTest {

    Calculator calculator;

    @BeforeAll
    static void init(){
        System.out.println("Unit Testing begins");
    }

    @AfterAll
    static void complete(){
        System.out.println("Unit Testing ends");
    }


    @BeforeEach
    void setUp(){
        calculator = new Calculator();
        System.out.println("Test Begin : ");
    }

    @AfterEach
    void tearDown(){
        calculator = null;
        System.out.println("Test Done");
    }

    @Test
    void testAdd(){

        Assertions.assertEquals(30, calculator.add(10,20));
        Assertions.assertEquals(0,calculator.add(0,0));
        Assertions.assertEquals(-5,calculator.add(5,-10));

    }


    @Test
    void testDivide(){

        Assertions.assertEquals(2, calculator.divide(10,5));
        Assertions.assertThrowsExactly(ArithmeticException.class, ()-> calculator.divide(2,0));

    }





}

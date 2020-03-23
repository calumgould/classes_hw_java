import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;
    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void add(){
        assertEquals(9, calculator.add(4, 5));
    }

    @Test
    public void subtract(){
        assertEquals(5, calculator.subtract(9, 4));
    }

    @Test
    public void multiply(){
        assertEquals(20, calculator.multiply(5, 4));
    }

    @Test
    public void divide(){
        assertEquals(5.5, calculator.divide(22, 4), 0.01);
    }
}

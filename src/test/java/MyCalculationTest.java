import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCalculationTest {

    @Test
    public void calculateSum() {
        MyCalculation myCalculation = new MyCalculation();
        int calc = myCalculation.calculateSum(10, 20);
        assertEquals(30, calc);
    }
}
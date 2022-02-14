package Calculation;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CalculatorTest
{
        @Test(timeOut = 10)

        public void testAdd() {

            Calculator instance = new Calculator();

            assertEquals(7, instance.add(3,4));

        }



        @Test(timeOut = 20)

        public void testSubtract() {

            Calculator instance = new Calculator();

            assertEquals(5, instance.subtract(10,5));

        }
}

package SquareRoot;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ArthmaticTest
{

        public void ArithmeticTest() { }

        @Test

        public void testFindSquareroot() {

            Arthmatic instance = new Arthmatic();

            double expResult = 3;

            double result = instance.findSquareroot(9);
            assertEquals("findSquareroot",expResult, result, 0.0);

        }
}

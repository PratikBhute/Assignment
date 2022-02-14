package CalculationDemo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClassTest2
{
        int x=0;
        int y=0;
        int result=0;
        Calc calculator =null;

        @Before
        public void setup(){
            x=30;
            y=20;
            calculator =new Calc();
        }
        @Test
        public void add(){
            result=50;
            int finalResult=calculator.Add(x,y);
            Assert.assertEquals(result, finalResult);
        }
        @Test
        public void sub(){
            x=30;
            y=20;
            result=10;
            int finalResult=calculator.sub(x,y);
            Assert.assertEquals(result, finalResult);
        }
        @After
        public void cleaning(){
            x=0;
            y=0;
            calculator =null;
        }

}

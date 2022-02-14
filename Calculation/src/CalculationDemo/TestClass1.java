package CalculationDemo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestClass1
{
        int x=0;
        int y=0;
        int result=0;
        Calc calculator =null;

        @Before
        public void setup(){
            int a =30;
            inr=20;
            result=50;
            calculator =new Calc();
        }
        @Test
        public void Add(){
            int finalResult=calculator.Add(x,y);
            Assert.assertEquals(result, finalResult);
        }
        @Test
        public void sub(){
          int  a=30;
           int b=20;
            result=10;
            int finalResult=calculator.sub(x,y);
            Assert.assertEquals(result, finalResult);
        }


}

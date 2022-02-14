package CalculationDemo;
import org.junit.*;
public class TestClass3
{
       int  a=0;
        int b =0;
        int result=0;
        Calc calculator =null;
        @BeforeClass
        public void setupClassLevel(){
            System.out.println("Invoke before loading class in JVM");
        }
        @Before
        public void setup(){
            int a = 30;
             int b= 20;
            calculator =new Calc();
        }
        @Test
        public void Add(){
            result=50;
            int finalResult=calculator.Add(a,b);
            Assert.assertEquals(result, finalResult);
        }
        @Test
        public void sub(){
            result=10;
            int finalResult=calculator.sub(a,b);
            Assert.assertEquals(result, finalResult);
        }
        @After
        public void cleaning(){
            int a=0;
            int b =0;
            calculator =null;
        }
        @AfterClass
        public void setupAfterClassLevel(){
            System.out.println("Invoke After class loading class in JVM");
        }
}

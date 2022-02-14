package CalculationDemo;

import groovy.transform.ASTTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase
{
   @Test
    public void Add()
    {
        int a=30;
        int b=20;
        int result=50;
       Calc c =new Calc();
        int finalResult=c.Add(a,b);
        Assert.assertEquals(result, finalResult);
    }

    @Test
    public void sub()
    {
        int a=30;

        int b=20;
        int result=10;
        Calc s =new Calc();
        int finalResult=s.sub(a,b);
        Assert.assertEquals(result, finalResult);
    }
    @Test
    public void multy()
    {
        int a=30;
        int b=20;
        int result=600;
        Calc c =new Calc();
        int finalResult=c.multy(a,b);
        Assert.assertEquals(result, finalResult);
    }

    @Test
    public void div()
    {
        int a=30;
        int b=2;
        int result=15;
        Calc c =new Calc();
        int finalResult=c.div(a,b);
        Assert.assertEquals(result, finalResult);
    }
    @Test
    public void module()
    {
        int a=10;
        int b=2;
        int result=0;
        Calc c =new Calc();
        int finalResult=c.module(a,b);
        Assert.assertEquals(result, finalResult);
    }
    @Test
    public void square()
    {
        int a=3;
        int result=9;
        Calc c =new Calc();
        int finalResult=c.square(a);
        Assert.assertEquals(result, finalResult);
    }

}
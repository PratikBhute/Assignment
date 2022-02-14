package ReverseNum;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class FactorialTest
{
    public void FactorialClass() {
        int fact = 120;
        FactorialTest fac = new FactorialTest();
       int actual=fac.FactorialClass(5);
        byte[] FactorialClass;
        Assert.assertEquals(FactorialClass,actual);
    }
}

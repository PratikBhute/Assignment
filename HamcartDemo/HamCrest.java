package HamcartDemo;

import org.hamcrest.core.StringContains;
import org.junit.Assert;
import org.junit.Test;
public class HamCrest
{
    @Test
    public void testEmailID(){
        String email="pratikvbhute@gmail.com";
        Assert.assertTrue(email.contains("@"));
    }
    @Test
    public void testEmailIDHamcrest(){
        String email="pratikvbhute@gmail";
        Assert.assertEquals(email, StringContains.containsString("gmail.com"));
    }

}
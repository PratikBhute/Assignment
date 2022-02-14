package Hamcrest;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.hamcrest.core.StringStartsWith.startsWith;

public class StringStartWith
{
    @Test
    public void ContainString()
    {
        assertThat("pratikbhute@gmail.com",containsString("bhute"));
    }
    @Test
    public void StartWith()
    {
        assertThat("pratikbhute@gmail.com",startsWith("pratikbhute"));
    }
    @Test
    public void endWith()
    {
        assertThat("pratikbhute@gmail.com",endsWith(".com"));

    }
}

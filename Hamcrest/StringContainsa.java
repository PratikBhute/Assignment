package Hamcrest;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.hamcrest.core.StringEndsWith.endsWith;


public class StringContainsa {
    @Test
    public void testcontainsString(){
        assertThat("pratikbhute@gmail.com",containsString("@gmail.com"));
    }

    @Test
    public void testendsWith(){
        assertThat("pratikbhute@gmail.com",endsWith("@gmail.com"));
    }
}

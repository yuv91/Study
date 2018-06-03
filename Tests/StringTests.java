import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringTests {

    @Test
    public void testReverseOddString(){
        ReverseString rs = new ReverseString();
        assertEquals("cba",rs.reverseStringUsingArray("abc"));
    }

    @Test
    public void testReverseEvenString(){
        ReverseString rs = new ReverseString();
        assertEquals("dcba",rs.reverseStringUsingArray("abcd"));
    }




}

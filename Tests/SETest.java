import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SETest{
    @Test
    public void calculation() throws AssertionError, Exception{
        String test1 = "log10(30)";
        String test2 = "abs(99)((";
        String test3 = "9/0";
        String test4 = "5*3985/log(((";
        String test5 = "abs(10-11)";

        assertEquals("calculation()", "1.4771212547196624", SE.calculation(test1));
        assertEquals("calculation()", "Error", SE.calculation(test2));
        assertEquals("calculation()", "Error", SE.calculation(test3));
        assertEquals("calculation()", "Error", SE.calculation(test4));
        assertEquals("calculation()", "1.0", SE.calculation(test5));
    }
}

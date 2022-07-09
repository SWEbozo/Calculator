import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ControlTest {

    @Test
    public void setNext(){  
        Control.clear();
        Control.setNext("1");
        assertEquals("setNext()", "1", Control.getExpression());
    }

    @Test
    public void clear(){
        assertEquals("clear()", "", Control.clear());
    }
	
    @Test
    public void backspace(){
        Control.clear();
        Control.setNext("5");
        Control.setNext("5");

        assertEquals("backspace()", "5", Control.backspace());
    }

    @Test
    public void saveResult(){
        Control.saveResult("555");

        assertEquals("saveResult()", "555", Control.getResult());
    }

    @Test
    public void getResult(){
        assertEquals("getResult()", "", Control.getResult());
    }

    @Test
    public void solveExp() throws AssertionError, Exception{
        Control.setNext("5*3985/log(((");

        assertEquals("solveExp()", "Error", Control.solveExp());
        assertEquals("getResult()", "", Control.getResult());

        Control.clear();
        Control.setNext("3+4");

        assertEquals("solveExp()", "7.0", Control.solveExp());
        assertEquals("getResult()", "7.0", Control.getResult());

    }
}


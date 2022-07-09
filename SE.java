import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

/**
 * It takes a string, converts it to an expression, and evaluates it
 */
public class SE {
    /**
     * Method that feeds a string expression into an expression evaluator.
     * @param s A string expression to be solved.
     * @return either an error string or the answer in string form.
     * @throws AssertionError
     */
    public static String calculation(String s) throws Exception {
        String result;
        Expression exp;
        try{
            exp = new ExpressionBuilder(s)
            .build(); 
              
            result = Double.toString(exp.evaluate());
        } catch (Exception e){
            return "Error";
        } 
        
        return result;
    }
}

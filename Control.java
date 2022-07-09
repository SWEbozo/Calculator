public class Control {
    private static String expression = "";
    private static String result = "";

    /**
     * Sets the next gui input into the expression variable.
     * @param next Gui input to be added.
     * @return updated expression variable.
     */
    static String setNext(String next){
        expression = expression.concat(next);
        return expression;
    }

    /**
     * Resets the expression variable to an empty string.
     * @return updated expression variable.
     */
    static String clear(){
        expression = "";
        return expression;
    }

    /**
     * Deletes the previous input added to expression.
     * @return updated expression variable.
     */
    static String backspace(){
        if(expression.length() == 0 ){
            return expression;
        }
        expression = expression.substring(0, expression.length()-1);
        return expression;
    }

    /**
     * Saves an answer repr String as the result variable.
     * @param ans answer in String form.
     */
    static void saveResult(String ans){
        result = ans;
    }

    /**
     * Returns the result variable and also adds it to the expression.
     * @return updated expression variable.
     */
    static String getResult(){
        setNext(result);
        return expression;
    }

    /**
     * Solves the expression and saves the answer as the result variable.
     * @return answer in String form.
     * @throws Exception returns error messege and clears result variable.
     */
    static String solveExp() throws Exception{
        if(expression.length() == 0){
            return expression;
        }

        String ans = SE.calculation(expression);
        if(ans != "Error"){
            saveResult(ans);
        }
        else{
            saveResult("");
        }
        clear();
        return ans;
    }
    /**
     * Returns the current expression. For testing only.
     * @return expression class variable.
     */
    static String getExpression(){
        return expression;
    }
}

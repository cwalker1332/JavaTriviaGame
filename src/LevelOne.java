import java.util.Random;

public class LevelOne {

    // enter questions into appropriate array's squiggly braces
    // decide whether we want to do a separate array for multiple choice or just include it with question
    static String[][] typesQna = new String[][]{
            {"What is the proper way to declare a variable?", "A", "A. VariableType variableName;", "B. VariableName;", "C. VariableName variableType;", "D. VariableType;"},
            {"The following code will result in: int num = 6.7;", "D", "A runtime error", "B. Num being 6", "C. Num being 7", "D. A compilation error"},
            {"Choose the appropriate data type for: 8,675,309", "A", "A. int", "B. char", "C. double", "D. Short"},
            {"What is the difference between a float and a double?", "A", "A. A float is a real number with single-precision 32-bit, and a double is a real number with double-precision 64-bit.", "B. A double is a real number with single-precision 32-bit, and a float is a real number with float-precision 64-bit."}};

    static String[][] controlFlowQna = new String[][]{
            {"What type of control flow is defined here? This statement is equivalent to an if-else statement, with one key difference. Of all the blocks of code defined in an if-else statement, only one will be executed. In this statement, multiple blocks of code can be executed.", "B", "A. Ternary Operator Statement;", "B. Switch Statement;"},
            {"What is the difference between a continue and break statement?", "A", "A. A break statement terminates a loop and a continue statement terminates the current loop iteration", "B. Only a continue statement may have a label", "C. Both can be used with a switch statement", "D. Only a break statement may have a label"}};

    static String[][] loopsQna = new String[][]{
            {"What is the difference between do-while and while statements?", "B", "A. Code within while blocks are always executed at least once before condition is evaluated", "B. Code within do-while blocks are always executed at least once before condition is evaluated"},
            {"What are the three important components that help determine how many times a for-loop will loop?", "A", "A. Initialization, Termination/Condition, Increment/Decrement ", "B. Initialization, Void, Termination/Condition"}};;

    static String[][] methodCompQna = new String[][]{
            {"What is the proper way to declare a variable?", "A", "A. VariableType variableName;", "B. VariableName;", "C. VariableName variableType;", "D. VariableType;"},
            {"", "C", "A. Option 1", "B. Option 2", "C. Option 3", "D. Option 4"},
            {"Question 3?", "A", "A. Option 1", "B. Option 2", "C. Option 3", "D. Option 4"},
            {"Question 4?", "D", "A. Option 1", "B. Option 2", "C. Option 3", "D. Option 4"}};;
        //TODO finish methodCompQna

    static void demi(){

    }
    // method to retrieve questions
    public static String[] getLevelOneQuestion(){
        // initialize new Random object as rand
        Random rand = new Random();

        /* make an integer called randomNum be equal to the first randomly generated number
        with a maximum returned value of 4 */
        int randomNum = rand.nextInt(5);

        //TODO: Figure out how to get all level one questions without creating one massive array
        return typesQna[randomNum];

    }
}

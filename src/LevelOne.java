import java.util.Random;

public class LevelOne {

    // enter questions into appropriate array's squiggly braces
    // decide whether we want to do a separate array for multiple choice or just include it with question
    static String[][] typesQna = new String[][]{
            {"What is the proper way to declare a variable?", "A", "A. VariableType variableName;", "B. VariableName;", "C. VariableName variableType;", "D. VariableType;"},
            {"", "C", "A. Option 1", "B. Option 2", "C. Option 3", "D. Option 4"},
            {"Question 3?", "A", "A. Option 1", "B. Option 2", "C. Option 3", "D. Option 4"},
            {"Question 4?", "D", "A. Option 1", "B. Option 2", "C. Option 3", "D. Option 4"}};
    static String[][] controlFlowQna = new String[][]{
            {"What is the proper way to declare a variable?", "A", "A. VariableType variableName;", "B. VariableName;", "C. VariableName variableType;", "D. VariableType;"},
            {"", "C", "A. Option 1", "B. Option 2", "C. Option 3", "D. Option 4"},
            {"Question 3?", "A", "A. Option 1", "B. Option 2", "C. Option 3", "D. Option 4"},
            {"Question 4?", "D", "A. Option 1", "B. Option 2", "C. Option 3", "D. Option 4"}};

    static String[][] loopsQna = new String[][]{
            {"What is the proper way to declare a variable?", "A", "A. VariableType variableName;", "B. VariableName;", "C. VariableName variableType;", "D. VariableType;"},
            {"", "C", "A. Option 1", "B. Option 2", "C. Option 3", "D. Option 4"},
            {"Question 3?", "A", "A. Option 1", "B. Option 2", "C. Option 3", "D. Option 4"},
            {"Question 4?", "D", "A. Option 1", "B. Option 2", "C. Option 3", "D. Option 4"}};;

    static String[][] methodCompQna = new String[][]{
            {"What is the proper way to declare a variable?", "A", "A. VariableType variableName;", "B. VariableName;", "C. VariableName variableType;", "D. VariableType;"},
            {"", "C", "A. Option 1", "B. Option 2", "C. Option 3", "D. Option 4"},
            {"Question 3?", "A", "A. Option 1", "B. Option 2", "C. Option 3", "D. Option 4"},
            {"Question 4?", "D", "A. Option 1", "B. Option 2", "C. Option 3", "D. Option 4"}};;


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

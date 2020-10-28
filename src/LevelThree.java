import java.util.Random;

public class LevelThree {

    // enter questions into appropriate array's squiggly braces
    // decide whether we want to do a separate array for multiple choice or just include it with question
    static String[][] timeSpaceQna = new String[][]{
            {"How is time complexity measured?", "B",
                    "A. By counting the number of statements in an algorithm",
                    "B. By counting the number of primitive operations performed by the algorithm on a given input size",
                    "C. By counting the size of data input to the algorithm",
                    "D. None of the above"},
            {"Algorithms A and B have a worst-case running time of O(n) and O(log n), respectively. Therefore, algorithm B always runs faster than algorithm A.", "B",
                    "A. True",
                    "B. False"},

            //TODO: fill in questions
            {"Question 3?", "A",
                    "A. Option 1",
                    "B. Option 2",
                    "C. Option 3",
                    "D. Option 4"},
            {"Question 4?", "D",
                    "A. Option 1",
                    "B. Option 2",
                    "C. Option 3",
                    "D. Option 4"}};;

    static String[][] jsonQna = new String[][]{
            {"JSON stands for:", "B",
                    "A. Java Standard Output Network",
                    "B. JavaScript Object Notation",
                    "C. JavaScript Output Name",
                    "D. Java Source Open Network"},
            {"What is the correct format for writing JSON key/value pairs?", "D",
                    "A. 'key : value'",
                    "B. ‘key’ = 'value'",
                    "C. key = \"value\"",
                    "D. \"key\" : \"value\""},

            //TODO: fill in questions
            {"Question 3?", "A",
                    "A. Option 1",
                    "B. Option 2",
                    "C. Option 3",
                    "D. Option 4"},
            {"Question 4?", "D",
                    "A. Option 1",
                    "B. Option 2",
                    "C. Option 3",
                    "D. Option 4"}};;

    static String[][] exceptionsQna = new String[][]{
            {"WWhat is the difference between throw and throws?", "B",
                    "A. Throw declares an exception, while throws is used to throw an exception",
                    "B. Throw is used to throw an exception, while throws declares an exception"},
            {"Which is true about Java exception handling?", "D",
                    "A. A finally clause of a try-catch statement is only executed if at least one clause has been triggered",
                    "B. A catch clause may only catch object of the class Exception",
                    "C. Finally is required for a try-catch statement to run",
                    "D. If an object is thrown by a throw statement then it must be a subclass of the Throwable class"},

            //TODO: fill in questions
            {"Question 3?", "A",
                    "A. Option 1",
                    "B. Option 2",
                    "C. Option 3",
                    "D. Option 4"},
            {"Question 4?", "D",
                    "A. Option 1",
                    "B. Option 2",
                    "C. Option 3",
                    "D. Option 4"}};;

    static String[][] oopQna = new String[][]{
            {"Fill in the blank. If something within a class is declared as ______ then it can only be accessed within its class and all inheriting or parent classes, but if it is declared as _____ then it is only accessible within its class.?", "C",
                    "A. public, private",
                    "B. public, protected",
                    "C. protected, private",
                    "D. protected, public"},
            {"What is the role of a constructor?", "B",
                    "A. To create some type of change in the state of an object",
                    "B. To create an instance of a class",
                    "C. To create names for a method"},

            //TODO: fill in questions
            {"Question 3?", "A",
                    "A. Option 1",
                    "B. Option 2",
                    "C. Option 3",
                    "D. Option 4"},
            {"Question 4?", "D",
                    "A. Option 1",
                    "B. Option 2",
                    "C. Option 3",
                    "D. Option 4"}};;


    // methods to retrieve question
    public static String[] getLevelThreeQuestion(){
        // initialize new Random object as rand
        Random rand = new Random();

        /* make an integer called randomNum be equal to the first randomly generated number
        with a maximum returned value of 4 */
        int randomNum = rand.nextInt(5);

        //TODO: Figure out how to get all level one questions without creating one massive array
        // will prob have to create multiple methods for each array and run a for loop in main
        return timeSpaceQna[randomNum];
    }
}

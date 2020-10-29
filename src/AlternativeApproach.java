import java.util.Random;

// This class was our first attempt at trying to create level 3 of our trivia game. If completed, it can be done
// this way as well but this was more advanced than we needed at the time so progress on it was discontinued.

public class AlternativeApproach {
    static String[][] timeSpaceQna = new String[][]{
            {"How is time complexity measured?", "B",
                    "A. By counting the number of statements in an algorithm",
                    "B. By counting the number of primitive operations performed by the algorithm on a given input size",
                    "C. By counting the size of data input to the algorithm",
                    "D. None of the above"},
            {"Algorithms A and B have a worst-case running time of O(n) and O(log n), respectively. Therefore, algorithm B always runs faster than algorithm A.", "B",
                    "A. True",
                    "B. False"},
            {"An algorithm whose complexity does NOT change with the input size is:", "A",
                    "A. 0(1)",
                    "B. 0(n)",
                    "C. 0(n2)"},
            {"The fastest algorithms are:", "A",
                    "A. 0(1)",
                    "B. 0(n)",
                    "C. 0(n2)"}};;

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
            {"Which of the following examples is a correct way to represent a JSON object?", "B",
                    "A. {[ “sports” : [ “football” , “cricket” , “hockey” ] }]",
                    "B. { “sports” : [ “football” , “cricket” , “hockey” ] }",
                    "C. [ “sports” : { “football” , “cricket” , “hockey” } ]",
                    "D. { “sports” - [ “football” : “cricket” : “hockey” ] }"},
            {"Is JSON case sensitive?", "A",
                    "A. Yes",
                    "B. No"}};;

    static String[][] exceptionsQna = new String[][]{
            {"What is the difference between throw and throws?", "B",
                    "A. Throw declares an exception, while throws is used to throw an exception",
                    "B. Throw is used to throw an exception, while throws declares an exception"},
            {"Which is true about Java exception handling?", "D",
                    "A. A finally clause of a try-catch statement is only executed if at least one clause has been triggered",
                    "B. A catch clause may only catch object of the class Exception",
                    "C. Finally is required for a try-catch statement to run",
                    "D. If an object is thrown by a throw statement then it must be a subclass of the Throwable class"},
            {"What happens during execution if a negative value is used for an array index?", "A",
                    "A. An IndexOutOfBoundsException is thrown",
                    "B. A NumberFormatException is thrown",
                    "C. The first slot of the array is used",
                    "D. This is an Error so the program immediately terminates"},
            {"An exception that occurs at compile time is called a(n):", "C",
                    "A. Error",
                    "B. Unchecked Exception",
                    "C. Checked Exception"}};;

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
            {"Which of the following is a mechanism by which an object acquires the properties of another object?", "B",
                    "A. Encapsulation",
                    "B. Inheritance",
                    "C. Abstraction",
                    "D. Polymorphism"},
            {"Which of the following concepts is often expressed by the phrase, ‘One method, multiple implementations’?", "D",
                    "A. Encapsulation",
                    "B. Inheritance",
                    "C. Abstraction",
                    "D. Polymorphism"}};;


    // methods to retrieve question
    public static String[] getTimeSpaceQuestion(){
        // initialize new Random object as rand
        Random rand = new Random();

        /* make an integer called randomNum be equal to the first randomly generated number
        with a maximum returned value of 3 */
        int randomNum = rand.nextInt(4);

        //TODO: Figure out how to get all level one questions without creating one massive array
        // will prob have to create multiple methods for each array and run a for loop in main
        return timeSpaceQna[randomNum];
    }
}

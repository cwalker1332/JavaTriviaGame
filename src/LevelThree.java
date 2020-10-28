import java.util.Scanner;

public class LevelThree {

public static void startLevelThree(){
    //TODO: fix to take in score from level two

    // reset score
    int score = 0;

    // initialize level three questions
    String q1 = "How is time complexity measured?\n" +
            "A. By counting the number of statements in an algorithm\n" +
            "B. By counting the number of primitive operations performed by the algorithm on a given input size\n" +
            "C. By counting the size of data input to the algorithm\n" +
            "D. None of the above";
    String q2 = "Algorithms A and B have a worst-case running time of O(n) and O(log n), respectively. Therefore, algorithm B always runs faster than algorithm A\n" +
            "A. True\n" +
            "B. False";
    String q3 = "An algorithm whose complexity does NOT change with the input size is:\n" +
            "A. 0(1)\n" +
            "B. 0(n)\n" +
            "C. 0(n2)";
    String q4 = "The fastest algorithms are:\n" +
            "A. 0(1)\n" +
            "B. 0(n)\n" +
            "C. 0(n2)";
    String q5 = "JSON stands for:\n" +
            "A. Java Standard Output Network\n" +
            "B. JavaScript Object Notation\n" +
            "C. JavaScript Output Name\n" +
            "D. Java Source Open Network";
    String q6 = "What is the correct format for writing JSON key/value pairs?\n" +
            "A. 'key : value'\n" +
            "B. ‘key’ = 'value'\n" +
            "C. key = \"value\"\n" +
            "D. \"key\" : \"value\"";
    String q7 = "Which of the following examples is a correct way to represent a JSON object?\n" +
            "A. {[ “sports” : [ “football” , “cricket” , “hockey” ] }]\n" +
            "B. { “sports” : [ “football” , “cricket” , “hockey” ] }\n" +
            "C. [ “sports” : { “football” , “cricket” , “hockey” } ]\n" +
            "D. { “sports” - [ “football” : “cricket” : “hockey” ] }";
    String q8 = "Is JSON case sensitive?\n" +
            "A. Yes\n" +
            "B. No";
    String q9 = "What is the difference between throw and throws?\n" +
            "A. Throw declares an exception, while throws is used to throw an exception\n" +
            "B. Throw is used to throw an exception, while throws declares an exception";
    String q10 = "Which is true about Java exception handling?\n" +
            "A. A finally clause of a try-catch statement is only executed if at least one clause has been triggered\n" +
            "B. A catch clause may only catch object of the class Exception\n" +
            "C. Finally is required for a try-catch statement to run\n" +
            "D. If an object is thrown by a throw statement then it must be a subclass of the Throwable class";
    String q11 = "What happens during execution if a negative value is used for an array index?\n" +
            "A. An IndexOutOfBoundsException is thrown\n" +
            "B. A NumberFormatException is thrown\n" +
            "C. The first slot of the array is used\n" +
            "D. This is an Error so the program immediately terminates";
    String q12 = "An exception that occurs at compile time is called a(n):\n" +
            "A. Error\n" +
            "B. Unchecked Exception\n" +
            "C. Checked Exception";
    String q13 = "Fill in the blank. If something within a class is declared as ______ then it can only be accessed within its class and all inheriting or parent classes, but if it is declared as _____ then it is only accessible within its class.?\n" +
            "A. public, private\n" +
            "B. public, protected\n" +
            "C. protected, private\n" +
            "D. protected, public";
    String q14 = "What is the role of a constructor?\n" +
            "A. To create some type of change in the state of an object\n" +
            "B. To create an instance of a class\n" +
            "C. To create names for a method";
    String q15 = "Which of the following is a mechanism by which an object acquires the properties of another object?\n" +
            "A. Encapsulation\n" +
            "B. Inheritance\n" +
            "C. Abstraction\n" +
            "D. Polymorphism";
    String q16 = "Which of the following concepts is often expressed by the phrase, ‘One method, multiple implementations’?\n" +
            "A. Encapsulation\n" +
            "B. Inheritance\n" +
            "C. Abstraction\n" +
            "D. Polymorphism";

    // create an array with level three questions and their corresponding answers
    Questions[] levelThreeQuestions = {
            new Questions(q1, "B"),
            new Questions(q2, "B"),
            new Questions(q3, "A"),
            new Questions(q4, "A"),
            new Questions(q5, "B"),
            new Questions(q6, "D"),
            new Questions(q7, "B"),
            new Questions(q8, "A"),
            new Questions(q9, "B"),
            new Questions(q10, "D"),
            new Questions(q11, "A"),
            new Questions(q12, "C"),
            new Questions(q13, "C"),
            new Questions(q14, "B"),
            new Questions(q15, "B"),
            new Questions(q16, "D")
    };

    // create Scanner object
    Scanner input = new Scanner(System.in);

    // create for loop to run through questions
    for(int i = 0; i < levelThreeQuestions.length; i++){
        //TODO: figure out how to randomize without repeating
            //Random rand = new Random();
            //int randomNum = rand.nextInt(levelThreeQuestions.length);
            //Collections.shuffle(Arrays.asList(levelThreeQuestions));

        // print question with multiple choice options
        System.out.println(levelThreeQuestions[i].prompt);

        // create variable to hold whatever user answers with
        // TODO: print statement to tell user to enter their answer (A-D)
        String selection = input.nextLine();

        // if statement to increase score if user's selection is correct
        if(selection.equalsIgnoreCase(levelThreeQuestions[i].answer)){
            score++;
        }
    }
    // TODO: switch statement to give user choice to continue with more questions, start back from level one, or exit

    System.out.println("Your score is: " + score + "/" + levelThreeQuestions.length);
}
}

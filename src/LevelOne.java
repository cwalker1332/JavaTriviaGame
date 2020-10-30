import java.util.Scanner;

public class LevelOne {

    public static void startLevelOne() {
        // initialize score variable
        int score = 0;

        // initialize level one questions
        String q1 = "What is the proper way to declare a variable?\n" +
                "A. VariableType variableName;\n" +
                "B. VariableName;\n" +
                "C. VariableName variableType;\n" +
                "D. VariableType;";
        String q2 = "The following code will result in: int num = 6.7;\n" +
                "A. A runtime error\n" +
                "B. Num being 6\n" +
                "C. Num being 7\n" +
                "D. A compilation error";
        String q3 = "Choose the appropriate data type for: 8,675,309\n" +
                "A. int\n" +
                "B. char\n" +
                "C. double\n" +
                "D. short";
        String q4 = "What is the difference between a float and a double?\n" +
                "A. A float is a real number with single-precision 32-bit, and a double is a real number with double-precision 64-bit.\n" +
                "B. A double is a real number with single-precision 32-bit, and a float is a real number with float-precision 64-bit.";
        String q5 = "What type of control flow is defined here? This statement is equivalent to an if-else statement, with one key difference. Of all the blocks of code defined in an if-else statement, only one will be executed. In this statement, multiple blocks of code can be executed.\n" +
                "A. Ternary Operator Statement\n" +
                "B. Switch Statement";
        String q6 = "What is the difference between a continue and break statement?\n" +
                "A. A break statement terminates a loop and a continue statement terminates the current loop iteration\n" +
                "B. Only a continue statement may have a label\n" +
                "C. Both can be used with a switch statement\n" +
                "D. Only a break statement may have a label";
        String q7 = "What is the difference between do-while and while statements?\n" +
                "A. Code within while blocks are always executed at least once before condition is evaluated\n" +
                "B. Code within do-while blocks are always executed at least once before condition is evaluated";
        String q8 = "What are the three important components that help determine how many times a for-loop will loop?\n" +
                "A. Initialization, Termination/Condition, Increment/Decrement\n" +
                "B. Initialization, Void, Termination/Condition";
        String q9 = "What is Throw?\n" +
                "A. Java try block is used to enclose the code that might throw an exception. It must be used within the method. Java try block must be followed by either catch or finally block.\n" +
                "B. Java Throw is not an exception handling keyword\n" +
                "C. Java throw keyword is used to explicitly throw an exception. We can throw either checked or uncheck exception in java by throw keyword. The throw keyword is mainly used to throw custom exception.\n" +
                "D. None of the above";
        String q10 = "What is Throws?\n" +
                "A. Java catch block is used to handle the Exception. It must be used after the try block only. You can use multiple catch block with a single try.\n" +
                "B. Java finally block is a block that is used to execute important code such as closing connection, stream etc. Java finally block is always executed whether exception is handled or not. Java finally block follows try or catch block.\n" +
                "C. Java throws keyword is used to declare an exception. It gives an information to the programmer that there may occur an exception so it is better for the programmer to provide the exception handling code.\n" +
                "D. None of the above";

        // create an array with level one questions and their corresponding answers
        Questions[] levelOneQuestions = {
                new Questions(q1, "A"),
                new Questions(q2, "D"),
                new Questions(q3, "A"),
                new Questions(q4, "A"),
                new Questions(q5, "B"),
                new Questions(q6, "A"),
                new Questions(q7, "B"),
                new Questions(q8, "A"),
                new Questions(q9, "C"),
                new Questions(q10, "C")
        };

        // create Scanner object
        Scanner input = new Scanner(System.in);

        // create for loop to run through questions
        for (int i = 0; i < levelOneQuestions.length; i++) {
            //TODO: figure out how to randomize without repeating

            // print question with multiple choice options
            System.out.println(levelOneQuestions[i].prompt);

            // create variable to hold whatever user answers with
            System.out.println("Please select one of the multiple choice options.");
            String selection = input.nextLine();

            // if statement to increase score if user's selection is correct
            if (selection.equalsIgnoreCase(levelOneQuestions[i].answer)) {
                score++;

                // if statement to allow user to move on to level two once they achieve 8 correct answers
                if (score == 5) {
                    System.out.println("You're doing great! Did you want to move on to Level Two? (Select 1 or 2)\n" +
                            "1. Yes, move on to Level 2\n" +
                            "2. No, continue level 1\n");

                    int choice = input.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println("Okay, moving on to level 2!");
                            LevelTwo nextLevel = new LevelTwo();
                            nextLevel.startLevelTwo();
                            break;
                        case 2:
                            System.out.println("Okay, continuing level 1!");
                            break;
                    }
                }
            }
            System.out.println("Your score is: " + score + "/" + levelOneQuestions.length);
        }
        System.out.println("Would you like to move on to level 2?\n" +
                "1. Yes\n" +
                "2. No, exit session.");

        int next = input.nextInt();

        switch (next) {
            case 1:
                System.out.println("Okay, moving on to level 2!");
                LevelTwo nextLevel = new LevelTwo();
                nextLevel.startLevelTwo();
                break;
            case 2:
                System.out.println("Good work today! See you next time :)");
                System.exit(0);
                break;
        }
    }
}


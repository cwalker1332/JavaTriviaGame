import java.util.Scanner;

public class LevelTwo {

    public static void startLevelTwo() {
        // reset score
        int score = 0;

        // initialize level two questions
        String q1 = "How do you check the state of your local git repository since your last commit?\n" +
                "A. git check\n" +
                "B. git status\n" +
                "C. git commit\n" +
                "D. git checkout";
        String q2 = "What is the command syntax to change to a different branch using Git?\n" +
                "A. git checkout ‘branch name’\n" +
                "B. git Status ‘branch name’";
        String q3 = "What is a directory?\n" +
                "A. An organizational file system structure that contains files and/or other directories\n" +
                "B. An alphabetical list\n" +
                "C. A book";
        String q4 = "What is the command line for the calendar in the terminal?\n" +
                "A. Cd\n" +
                "B. Cal";
        String q5 = "What is pseudocode?\n" +
                "A. Informal descriptions of algorithms\n" +
                "B. Strict syntax of code";
        String q6 = "Is an ‘if statement’ an example of a control structure?\n" +
                "A. True \n" +
                "B. False";

        // create an array with level two questions and their corresponding answers
        Questions[] levelTwoQuestions = {
                new Questions(q1, "B"),
                new Questions(q2, "A"),
                new Questions(q3, "A"),
                new Questions(q4, "B"),
                new Questions(q5, "A"),
                new Questions(q6, "A")
        };

        // create Scanner object
        Scanner input = new Scanner(System.in);

        // create for loop to run through questions
        for (int i = 0; i < levelTwoQuestions.length; i++) {
            //TODO: figure out how to randomize without repeating

            // print question with multiple choice options
            System.out.println(levelTwoQuestions[i].prompt);

            // create variable to hold whatever user answers with
            System.out.println("Please select one of the multiple choice options.");
            String selection = input.nextLine();

            // if statement to increase score if user's selection is correct
            if (selection.equalsIgnoreCase(levelTwoQuestions[i].answer)) {
                score++;

                // TODO: figure out how to let user continue from last question rather than start all over

                // if statement to allow user to move on to level three once they achieve 8 correct answers
                if (score == 3) {
                    System.out.println("You're doing great! Did you want to move on to Level Three? (Select 1 or 2)\n" +
                            "1. Yes, move on to Level 3\n" +
                            "2. No, continue level 2");

                    int choice = input.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println("Okay, moving on to level 3!");
                            LevelThree nextLevel = new LevelThree();
                            nextLevel.startLevelThree();
                            break;
                        case 2:
                            System.out.println("Okay, continuing level 2!");
                            break;
                    }
                }
            }
            System.out.println("Your score is: " + score + "/" + levelTwoQuestions.length);
        }
        System.out.println("Would you like to move on to level 3?\n" +
                "1. Yes\n" +
                "2. No, exit session.");

        int next = input.nextInt();

        switch (next) {
            case 1:
                System.out.println("Okay, moving on to level 2!");
                LevelThree nextLevel = new LevelThree();
                nextLevel.startLevelThree();
                break;
            case 2:
                System.out.println("Good work today! See you next time :)");
                System.exit(0);
                break;
        }
    }
}

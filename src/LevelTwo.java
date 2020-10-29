import java.util.Scanner;

public class LevelTwo {

    public static void startLevelTwo(){
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
        String q6 = "Is an ‘if statement’, and example of a Control Structure?\n" +
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
        for(int i = 0; i < levelTwoQuestions.length; i++){
            //TODO: figure out how to randomize without repeating

            // print question with multiple choice options
            System.out.println(levelTwoQuestions[i].prompt);

            // create variable to hold whatever user answers with
            System.out.println("Please select one of the multiple choice options.");
            String selection = input.nextLine();

            // if statement to increase score if user's selection is correct
            if(selection.equalsIgnoreCase(levelTwoQuestions[i].answer)){
                score++;

                // TODO: make option to let user choose to continue with more questions or move on using switch statement

                // if statement to allow user to move on to level three once they achieve 8 correct answers
                if (score >= 3){
                    System.out.println("You're doing great! Did you want to move on to Level Three?");
                    LevelThree nextLevel = new LevelThree();
                    nextLevel.startLevelThree();
                }
            }
        }
        System.out.println("Your score is: " + score + "/" + levelTwoQuestions.length);
    }
}

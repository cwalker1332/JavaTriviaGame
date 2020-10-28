import java.util.Scanner;

public class JavaTrivia {

    public static void main(String[] args) {
        //declare variables to be used
        //TODO: can potentially do a high score feature
        int score = 0;

        // create new Scanner named input
        Scanner input = new Scanner(System.in);

        // instruct user to enter their name
        System.out.println("Hi! Welcome to the Dream Corps Midterm Trivia Game!" +
                " Enter your name so we know what to call you.");
        String name = input.nextLine();

        System.out.println("Hi " + name + ". Let's get started!");

        // print out random question from level one
        System.out.println(LevelOne.getLevelOneQuestion());

        //TODO: for loop to run through questions and increase score
        //TODO: if-else statement within for loop to give option to move on to next level when sufficient points (8) are reached or start over for more questions

        // System.out.println("Good work! Would you like to review some topics or exit session?");
        // TODO: write if else statement, if they choose 1. Review, then give list of topics to go back over or 2. exit and sout "Good work today! See you next time!"
    }
}

import java.util.Scanner;

public class JavaTrivia {

    public static void main(String[] args) {
        //TODO: can potentially do a high score feature

        // create new Scanner object
        Scanner input = new Scanner(System.in);

        // instruct user to enter their name
        System.out.println("Hi! Welcome to the Dream Corps Midterm Trivia Game!" +
                " Enter your name so we know what to call you.");
        String name = input.nextLine();

        System.out.println("Hi " + name + ". Let's get started!");

        // start level one
        LevelOne.startLevelOne();

        System.out.println("Good work! Would you like to review some topics or exit session?");
        // TODO: write if else statement, if they choose 1. Review, then give list of topics to go back over or 2. exit and sout "Good work today! See you next time!"
    }
}

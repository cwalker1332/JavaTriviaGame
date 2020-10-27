import java.util.Scanner;

public class JavaTrivia {

    public static void main(String[] args) {
        //declare variables to be used
        int score = 0;

        // create new Scanner named input
        Scanner input = new Scanner(System.in);

        // instruct user to enter their name
        System.out.println("Hi! Welcome to the Dream Corps Midterm Trivia Game!" +
                " Enter your name so we know what to call you.");
        String name = input.nextLine();

        System.out.println("Hi " + name + ". Let's get started!");

        // once 8 points achieved can move on to next lesson
        // at end of each lesson give the option to start over or continue to next lesson if accrued enough points

        // System.out.println("Good work! Would you like to review some topics or exit session?");
        // write if else statement, if they choose 1. Review, then give list of topics to go back over or
        // 2. exit and sout "see you later"
    }
}

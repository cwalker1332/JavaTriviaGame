import java.util.Scanner;

public class JavaTrivia {

    public static void main(String[] args) {
        //declare variables to be used

        // create new Scanner named input
        Scanner input = new Scanner(System.in);

        // instruct user to enter their name
        System.out.println("Hi! Welcome to the Dream Corps Midterm Trivia Game!" +
                " Enter your name so we know what to call you.");
        String name = input.nextLine();

        System.out.println("Hi " + name + ". Let's get started!");


    }
}

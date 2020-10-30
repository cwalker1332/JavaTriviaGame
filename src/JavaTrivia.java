import java.util.Scanner;
import java.util.logging.Level;

public class JavaTrivia {

    //TODO: have to correct each question to only allow for char responses between A and D

    // give user option to restart level(s) or exit session
    public static void restart(){
        // create new Scanner object
        Scanner input = new Scanner(System.in);

        // give user option to exit after finishing the three levels or go back to study again
        System.out.println("Good work! Would you like to review some more or exit the session? (Type 1, 2, 3, or 4)\n" +
                "1. Review Level 1\n" +
                "2. Review Level 2\n" +
                "3. Continue Level 3\n" +
                "4. Exit");

        int choice = input.nextInt();

        switch(choice){
            case 1:
                System.out.println("Okay, let's go back to Level 1!");
                LevelOne.startLevelOne();
                break;
            case 2:
                System.out.println("Okay, let's go back to Level 2!");
                LevelTwo.startLevelTwo();
                break;
            case 3:
                System.out.println("Okay, let's go back to Level 3!");
                LevelThree.startLevelThree();
                break;
            case 4:
                System.out.println("Good work today! See you next time! :)");
                System.exit(0);
            default:
                System.out.println("That was an invalid input. Please select 1-4.");
                restart();
        }
    }

    public static void main(String[] args) {
        //TODO: can potentially do a high score feature

        // create new Scanner object
        Scanner input = new Scanner(System.in);

        // instruct user to enter their name
        System.out.println("Hi! Welcome to the Dream Corps Midterm Trivia Game!" +
                " Enter your name so we know what to call you.");
        String name = input.nextLine();

        System.out.println("Hi " + name + ". Let's get started!");

        // start level one (this will go through all three levels then continue whatever is left on main)
        LevelOne.startLevelOne();
    }
}

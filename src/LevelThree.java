import java.util.Random;

public class LevelThree {

    // enter questions into appropriate array's squiggly braces
    // decide whether we want to do a separate array for multiple choice or just include it with question
    static String[] timeSpaceQna = {};

    static String[] jsonQna = {};

    static String[] exceptionsQna = {};

    static String[] oopQna = {};


    // methods to retrieve question
    public static String[] getLevelThreeQuestion(){
        // initialize new Random object as rand
        Random rand = new Random();

        /* make an integer called randomNum be equal to the first randomly generated number
        with a maximum returned value of 4 */
        int randomNum = rand.nextInt(5);

        //TODO: Figure out how to get all level one questions without creating one massive array
        return timeSpaceQna[randomNum];
    }
}

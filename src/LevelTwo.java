import java.util.Random;

public class LevelTwo {

    // enter questions into appropriate array's squiggly braces
    // decide whether we want to do a separate array for multiple choice or just include it with question
    static String[] gitQna = {};

    static String[] commandLineQna = {};

    static String[] dataStructureQna = {};


    // methods to retrieve question
    public static String[] getLevelTwoQuestion(){
        // initialize new Random object as rand
        Random rand = new Random();

        /* make an integer called randomNum be equal to the first randomly generated number
        with a maximum returned value of 4 */
        int randomNum = rand.nextInt(5);

        //TODO: Figure out how to get all level one questions without creating one massive array
        return gitQna[randomNum];
    }
}

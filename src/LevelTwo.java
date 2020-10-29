import java.util.Random;

public class LevelTwo {

        // enter questions into appropriate array's squiggly braces
        // decide whether we want to do a separate array for multiple choice or just include it with question
        static String[][] gitQna = new String[][]{
                {"How do you check the state of your local git repository since your last commit?", "B", "A. git check", "B. git status", "C. git commit", "D. git checkout"},
                {"What is the command syntax to change to a different branch using Git?", "A", "A. git checkout 'branch name'", "B. git status 'branch name'"}};

        static String[][] basicCommandLineQna = new String[][]{
            {"What is a directory?", "A", "A. An organizational file system structure that contains files and/or other directories", "B. An alphabetical list", "C. A book"},
            {"What is the command line for the calendar in the terminal?", "B", "cd", "B. cal"}};

        static String[][] dataStructuresAndAlgorithmsQna = new String[][]{
            {"What is pseudocode?", "A", "A. Informal descriptions of algorithms", "B. Strict syntax of code"},

            //TODO finish dataStructuresAndAlgorithmsQna

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

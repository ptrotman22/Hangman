// Hangman Project game
/* Hangman Picture
* Hangman word, Accept input, display input and check input to previous inputs*/
import java.util.*;

public class Hangman {
    public static void main(String[] args) {
        //System.out.println("");
        Scanner input = new Scanner(System.in);
        String word = "company";
        String[] winLetters = new String[word.length()];

        // Populate String winLetters array with word.
        for (int i = 0; i < winLetters.length; i++) {
            winLetters[i] = String.valueOf(word.charAt(i));
        }

        int error = 0; //error counter.
        int victory = 0; // victory counter.
        int end = 0;// end game 1 = end, 0 = continue.
        // Game Start
        //String winner = null;
        do {

            System.out.println("H A N G M A N");
            ArrayList<String> missedLetters = new ArrayList<>();
            ArrayList<String> victoryLetters = new ArrayList<>();

            HangPic(error);
            System.out.println("Missed letters: ");
            for (int i = 0; i < winLetters.length; i++) {
                System.out.println(" _ ");
            }

            System.out.println("Guess a letter.\n" +
                    "\n");
            String letter = input.nextLine();

            while (error != 6) {
                int check = CheckLetter(letter, winLetters, missedLetters);
                while (check == 2) {
                    // Choose the same letter condition.
                    System.out.println("You have already guessed that letter. Choose again.");
                    System.out.println("Guess a letter.");
                    String again = new Scanner(System.in).nextLine(); // clear buffer for scanner.
                    check = CheckLetter(again, winLetters, missedLetters);
                }
                if (check == 1) {
                    // Gain a Point Condition
                    HangPic(error);
                    missedLetters = MissedLetters(letter, winLetters, missedLetters);
                    victoryLetters = VictoryLet(letter, winLetters, victoryLetters);
                    letter = RevealWord(victoryLetters, winLetters);
                    victory++;
                } else if (check == 0) {
                    // Lose a point Condition
                    error++;
                    HangPic(error);
                    missedLetters = MissedLetters(letter, winLetters, missedLetters);
                    letter = RevealWord(victoryLetters, winLetters);
                } else if (victory == word.length()) {
                    // Win Condition
                    System.out.println("Yes! The secret word is \""+ word +"\"! You have won!");
                    System.out.println("Do you want to play again? (yes or no)");
                    String winner = new Scanner(System.in).nextLine();
                    if (winner.equalsIgnoreCase("n")){
                        end = 1;
                    }
                    else {
                        error = 6;
                    }
                } else {
                    System.out.println("Error: Program Malfunctioned");
                }

            }


        } while (end != 1);

        System.out.println("Thank you For Playing.");
    }

    public static Integer CheckLetter (String letter, String[] word, ArrayList<String> totalMiss){
        //String word = "company";
        String[] lettersCheck = new String[word.length];
        //int check = word.length;
        // Pass on Array list letters
        ArrayList<String> missedLetters = new ArrayList<String>();
        missedLetters = (ArrayList<String>)totalMiss.clone();



        //Fill letters array with word or example word: company.
        for (int i = 0; i < word.length; i++) {
            lettersCheck[i] = word[i];
        }
        int incorrect = 1;
        //Check if the letter is correct.
        for (int i = 0; i < lettersCheck.length; i++) {
            if (lettersCheck[i].equals(letter)) {
                incorrect = 0;
                break;
            }
        }

        for (int i = 0; i < missedLetters.size(); i++){
            if (missedLetters.get(i).equals(letter)){
                System.out.println();
                return 2;
            }
        }

        // Add letter to Array list.
        if (incorrect == 1) {
            return 1;
        }
        else{
            return 0;
        }
    }

    public static ArrayList<String> VictoryLet (String letter, String[] word, ArrayList<String> victoryLettersP){
        //String word = "company";
        String[] lettersCheck = new String[word.length];
        int check = word.length;
        // Pass on Array list letters
        ArrayList<String> victoryLetters = new ArrayList<String>();
        victoryLetters = (ArrayList<String>)victoryLettersP.clone();



        //Fill letters array with word or example word: company.
        for (int i = 0; i < word.length; i++) {
            lettersCheck[i] = word[i];
        }
        int incorrect = 1;

        for (int i = 0; i < lettersCheck.length; i++){
            //System.out.println();
            if (lettersCheck[i].equals(letter)) {
                victoryLetters.add(letter);
            }
        }

        // Return the victory letters Array List.
            return victoryLetters;
    }


    public static ArrayList<String> MissedLetters (String letter, String[] word, ArrayList<String> totalMiss){
        //String word = "company";
        String[] lettersCheck = new String[word.length];
        int check = letter.length();
        // Pass on Array list letters
        ArrayList<String> missedLetters = new ArrayList<String>();
        missedLetters = (ArrayList<String>)totalMiss.clone();

        //ArrayList<String> victoryLetters = new ArrayList<String>();
        //victoryLetters = (ArrayList<String>)totalMiss.clone();


        //Fill letters array with word or example word: company.
        for (int i = 0; i < word.length; i++) {
            lettersCheck[i] = word[i];
        }
        int correct = 1;
        //Check if the letter is correct.
        for (int i = 0; i < lettersCheck.length; i++) {
            if (lettersCheck[i].equals(letter)) {
                correct = 0;
                break;
            }
        }

        // Add letter to Array list.
        if (correct == 1) {
            //check++;
            missedLetters.add(letter);
        }


        // Print missed letters.
        System.out.println("Missed: ");
        for (int i = 0; i < missedLetters.size(); i++){
            System.out.println(missedLetters.get(i));
        }


        return missedLetters;
    }

    public static String RevealWord(ArrayList<String> victoryLetter, String[] word){
        ArrayList<String> reveal = new ArrayList<String>();
        reveal = (ArrayList<String>)victoryLetter.clone();

        int check = 0;

        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < word.length; i++) {
                if (reveal.get(i).equals(word[j])) {
                    System.out.println(word[j]);
                } else {
                    check++;
                }
            }
            if (check == word.length){
                System.out.println(" _ ");
            }
            check = 0;
        }

        System.out.println("Guess a Letter.");
        String input = new Scanner(System.in).nextLine();

        return input;


    }
    public static void HangPic(int picError){
        int picCheck = picError;

        if (picCheck == 0) {
            System.out.println("+---+\n" +
                    "\n" +
                    "      |\n" +
                    "\n" +
                    "      |\n" +
                    "\n" +
                    "      |\n" +
                    "\n" +
                    "    ===");
        }

        if (picCheck == 1){
            System.out.println("+---+\n" +
                    "\n" +
                    "O   |\n" +
                    "\n" +
                    "      |\n" +
                    "\n" +
                    "      |\n" +
                    "\n" +
                    "    ===");
        }

        if (picCheck == 2){
            System.out.println("+---+\n" +
                    "\n" +
                    "O   |\n" +
                    "\n" +
                    "|    |\n" +
                    "\n" +
                    "      |\n" +
                    "\n" +
                    "    ===");
        }
        if (picCheck == 3){
            System.out.println("+---+\n" +
                    "\n" +
                    "O   |\n" +
                    "\n" +
                    "|    |\n" +
                    "\n" +
                    "|    |");
        }
        if (picCheck == 4){
            System.out.println("+---+\n" +
                    "\n" +
                    "O   |\n" +
                    "\n" +
                    "-- | --   |\n" +
                    "\n" +
                    "|    |");
        }

        if (picCheck == 5){
            System.out.println("+---+\n" +
                    "\n" +
                    "O   |\n" +
                    "\n" +
                    "-- | --   |\n" +
                    "\n" +
                    "|    |\n"
                    +" /   ");
        }

        if (picCheck == 6){
            System.out.println("+---+\n" +
                    "\n" +
                    "O    |\n" +
                    "\n" +
                    "--  | --   |\n" +
                    "\n" +
                    "|    |\n"
                    +"/   \\ ");
        }

        //return picError;
    }
}

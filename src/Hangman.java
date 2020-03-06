// Hangman Project game
/* Hangman Picture
* Hangman word, Accept input, display input and check input to previous inputs*/
import java.util.*;
public class Hangman {
    public static void main(String[] args){
        //System.out.println("");
        String word = "company";
        String[] winLetters = new String[word.length()];

        // Populate String winLetters array with word.
        for (int i = 0; i < winLetters.length; i++) {
            winLetters[i] = String.valueOf(word.charAt(i));
        }

        do {
            System.out.println("H A N G M A N");
            ArrayList<String> missedLetters = new ArrayList<String>();


        }while ();
    }

    public static ArrayList<String> MissedLetters (String letter, String[] word, ArrayList<String> totalMiss){
        //String word = "company";
        String[] lettersCheck = new String[word.length];
        int check = letter.length();
        // Pass on Array list letters
        ArrayList<String> missedLetters = new ArrayList<String>();
        missedLetters = (ArrayList<String>)totalMiss.clone();


        //Fill letters array with word or example word: company.
        for (int i = 0; i < word.length; i++) {
            lettersCheck[i] = word[i];
        }
        int correct = 1;
        //Check if the letter is correct.
        for (int i = 0; i < lettersCheck.length; i++) {
            if (lettersCheck[i] == letter) {
                correct = 0;
                break;
            }
        }

        // Add letter to Array list.
        if (correct == 1) {
            check++;
            missedLetters.add(letter);
        }

        // Print missed letters.
        System.out.println("Missed: ");
        for (int i = 0; i < missedLetters.size(); i++){
            System.out.println(missedLetters.get(i));
        }


        return missedLetters;
    }

    public static String RevealWord(){
        
    }
    public static int HangPic(int picError){
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

        return picError;
    }
}

// Hangman Project game
/* Hangman Picture
* Hangman word, Accept input, display input and check input to previous inputs*/
import java.util.*
public class Hangman {
    public static void main(String[] args){
        //System.out.println("");
        String word = "company"
        String[] winLetters = new String[word.length()];

        // Populate String winLetters array
        for (int i = 0; i < winLetters.length; i++) {
            winLetters[i] = String.valueOf(word.charAt(i));
        }

        do {
            System.out.println("H A N G M A N");
            String[] missedLetters = new String[6];


        }while ()
    }

    public static String MissedLetters (String missed){


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

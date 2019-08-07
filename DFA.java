import java.util.Scanner;

public class DFA {
    public static void main(String[] args) {
        Scanner aString = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String aWord = aString.nextLine();
        boolean result = isWord(aWord);
        if (result) {
            System.out.println(aWord + " is accepted");
        } else {
            System.out.println(aWord + " is not accepted");
        }
    }
        public static boolean isWord(String aWord){
            if (aWord.length() < 2) {
                return false;
            } else {
                int counter = 0;
                while (aWord.charAt(counter) == '0') {
                    counter++;
                    if (aWord.length() == counter) {
                        return false;
                    } else if ((aWord.charAt(counter) == '1') && (counter == aWord.length() - 1)) {
                        return true;
                    }
                }
                counter = 0;
                while (aWord.charAt(counter) == '1') {
                    counter++;
                    if (aWord.length() == counter) {
                        return false;
                    } else if ((aWord.charAt(counter) == '0') && (counter == aWord.length() - 1)) {
                        return true;
                    }
                }
                return false;
            }
        }
}

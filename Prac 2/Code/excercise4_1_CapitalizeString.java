import java.util.Scanner;

public class excercise4_1_CapitalizeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        printCapitalized(input);
    }

    public static void printCapitalized(String str) {
        boolean newWord = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                if (newWord) {
                    System.out.print(Character.toUpperCase(ch));
                    newWord = false;
                } else {
                    System.out.print(Character.toLowerCase(ch));
                }
            } else {
                System.out.print(ch);
                if (ch == ' ') {
                    newWord = true;
                }
            }
        }
    }
}

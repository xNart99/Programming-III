import java.util.Scanner;

public class excercise4_1_CapitalizeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        printCapitalized(input);
    }

    public static void printCapitalized(String str) {
        String[] words = str.split("\s+"); // Split the string into words

        for (String word : words) {
            if (!word.isEmpty()) {
                char firstChar = word.charAt(0);
                if (Character.isLetter(firstChar)) {
                    char capitalizedChar = Character.toUpperCase(firstChar);
                    System.out.print(capitalizedChar);
                    System.out.print(word.substring(1));
                } else {
                    System.out.print(word);
                }
                System.out.print(" ");
            }
        }
    }
}

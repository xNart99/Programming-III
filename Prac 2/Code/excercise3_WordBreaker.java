import java.util.Scanner;

public class excercise3_WordBreaker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] words = input.split("[^a-zA-Z']+");

        for (String word : words) {
            System.out.println(word);
        }
    }
}

import java.util.Scanner;

public class excercise4_2_HexadecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hexadecimal string: ");
        String input = scanner.nextLine();
        scanner.close();

        if (isHexadecimal(input)) {
            int decimalValue = computeDecimalValue(input);
            System.out.println("Base-10 value: " + decimalValue);
        } else {
            System.out.println("Error: Input contains non-hexadecimal characters.");
        }
    }

    public static boolean isHexadecimal(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toUpperCase(str.charAt(i));
            if (!(Character.isDigit(ch) || (ch >= 'A' && ch <= 'F'))) {
                return false;
            }
        }
        return true;
    }

    public static int hexValue(char ch) {
        ch = Character.toUpperCase(ch);

        switch (ch) {
            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            case 'A':
                return 10;
            case 'B':
                return 11;
            case 'C':
                return 12;
            case 'D':
                return 13;
            case 'E':
                return 14;
            case 'F':
                return 15;
            default:
                return -1;
        }
    }

    public static int computeDecimalValue(String str) {
        int value = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toUpperCase(str.charAt(i));
            int digitValue = hexValue(ch);
            value = value * 16 + digitValue;
        }

        return value;
    }
}

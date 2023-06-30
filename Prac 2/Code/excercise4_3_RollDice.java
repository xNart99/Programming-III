import java.util.Random;

public class excercise4_3_RollDice {
    public static void main(String[] args) {
        int targetTotal = 2;

        try {
            int numRolls = rollForTotal(targetTotal);
            System.out.println("Number of rolls to get snake eyes (total of 2): " + numRolls);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int rollForTotal(int targetTotal) {
        if (targetTotal < 2 || targetTotal > 12) {
            throw new IllegalArgumentException("Invalid target total. Please enter a value between 2 and 12.");
        }

        Random rand = new Random();
        int rolls = 0;

        while (true) {
            int dice1 = rand.nextInt(6) + 1;
            int dice2 = rand.nextInt(6) + 1;
            rolls++;

            if (dice1 + dice2 == targetTotal) {
                return rolls;
            }
        }
    }
}

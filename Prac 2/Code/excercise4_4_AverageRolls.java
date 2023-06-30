import java.util.Random;

public class excercise4_4_AverageRolls {
    public static void main(String[] args) {
        System.out.println("Total On Dice\tAverage Number of Rolls");
        System.out.println("-------------------------------------");

        for (int total = 2; total <= 12; total++) {
            double averageRolls = calculateAverageRolls(total);
            System.out.printf("%12d\t\t%.4f%n", total, averageRolls);
        }
    }

    public static double calculateAverageRolls(int total) {
        int numExperiments = 10000;
        int sumRolls = 0;

        for (int i = 0; i < numExperiments; i++) {
            int rolls = rollToGetTotal(total);
            sumRolls += rolls;
        }

        return (double) sumRolls / numExperiments;
    }

    public static int rollToGetTotal(int total) {
        Random rand = new Random();
        int rolls = 0;

        while (true) {
            int dice1 = rand.nextInt(6) + 1;
            int dice2 = rand.nextInt(6) + 1;
            rolls++;

            if (dice1 + dice2 == total) {
                return rolls;
            }
        }
    }
}

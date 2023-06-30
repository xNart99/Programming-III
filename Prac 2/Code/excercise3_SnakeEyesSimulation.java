import java.util.Random;

public class excercise3_SnakeEyesSimulation {
    public static void main(String[] args) {
        Random random = new Random();
        int rolls = 0;

        while (true) {
            int dice1 = random.nextInt(6) + 1;
            int dice2 = random.nextInt(6) + 1;
            rolls++;

            System.out.println("Roll " + rolls + ": " + dice1 + " " + dice2);

            if (dice1 == 1 && dice2 == 1) {
                break;
            }
        }

        System.out.println("It took " + rolls + " rolls to get snake eyes.");
    }
}

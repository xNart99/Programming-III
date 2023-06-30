import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class excercise3_SalesAnalyzer {
    public static void main(String[] args) {
        String filename = "sales.dat";
        double totalSales = 0.0;
        int citiesWithoutData = 0;

        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                int colonIndex = line.indexOf(':');

                if (colonIndex != -1) {
                    String salesData = line.substring(colonIndex + 1).trim();
                    try {
                        double sales = Double.parseDouble(salesData);
                        totalSales += sales;
                    } catch (NumberFormatException e) {
                        citiesWithoutData++;
                    }
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }

        System.out.println("Total Sales: " + totalSales);
        System.out.println("Cities without data: " + citiesWithoutData);
    }
}

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of consecutive primes to list:");
        int n = sc.nextInt();
        System.out.println();

        List<String> list = PrimeList.listPrimes(n);
        System.out.println();

        System.out.println("Would you like to write this data to a file in your Downloads folder? [true] / [false]");
        boolean doWrite = sc.nextBoolean();
        System.out.println();

        if (doWrite) {

            String fileName = n + " consecutive primes";
            FileOperator.writeToFile(getDataFromList(list), FileOperator.createFile(fileName));
        }

        System.out.println();
        System.out.println("System closed");
    }

    public static String getDataFromList(List<String> list) {

        StringBuilder rawData = new StringBuilder();

        for (String s : list) {

            rawData.append(s).append("\n");
        }

        return rawData.toString();
    }
}
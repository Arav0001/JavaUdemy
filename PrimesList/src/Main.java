import java.util.List;
import java.util.Scanner;

public class Main implements Runnable {

    public static void main(String[] args) {

        Thread thread = new Thread(new Main());
        thread.start();

        try {

            Thread.sleep(5000);
            thread.interrupt();
        } catch (InterruptedException ex) {

            System.out.println("Thread Interrupted");
        }
    }

    public void run() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of consecutive primes to list:");
        int n = sc.nextInt();
        System.out.println();

        long timerStart = System.currentTimeMillis();
        List<String> list = PrimeList.listPrimes(n);
        long timerEnd = System.currentTimeMillis();
        long elapsed = timerEnd - timerStart;

        System.out.println();
        System.out.println("Elapsed time to display " + n + " primes: " + elapsed + " milliseconds");
        System.out.println();

        System.out.println("Would you like to write this data to a file in your Downloads folder? [true] / [false]");
        boolean doWrite = sc.nextBoolean();
        System.out.println();

        if (doWrite) {

            String fileName = n + " consecutive primes";
            FileOperator.writeToFile(getDataFromList(list), FileOperator.createFile(fileName));
            System.out.println();
        }

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
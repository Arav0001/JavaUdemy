import java.util.*;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of consecutive primes to list:");
        int n = sc.nextInt();
        System.out.println();

        System.out.println("Would you like to print the " + n + " consecutive primes to the console? [true] / [false]");
        boolean doPrint = sc.nextBoolean();
        System.out.println();

        PrimeList primeList = new PrimeList(doPrint);
        List<String> list;

        long timerStart = getNanoTime();
        System.out.println(timerStart);

        if (doPrint) {

            list = primeList.printListPrimes(n);
        } else {

            list = primeList.dontPrintListPrimes(n);
        }

        long timerEnd = getNanoTime();
        System.out.println(timerEnd);
        long elapsedNano = timerEnd - timerStart;

        if (elapsedNano >= 0 && elapsedNano < Math.pow(10, 6)) {

            System.out.println();
            System.out.println("Elapsed time to process was " + elapsedNano + " nanoseconds.");
            System.out.println();
        } else if (elapsedNano >= Math.pow(10, 6) && elapsedNano < Math.pow(10, 9)) {

            System.out.println();
            System.out.println("Elapsed time to process was " + (elapsedNano / Math.pow(10, 6)) + " milliseconds.");
            System.out.println();
        } else if (elapsedNano >= Math.pow(10, 9) && elapsedNano < 60 * Math.pow(10, 9)) {

            System.out.println();
            System.out.println("Elapsed time to process was " + (elapsedNano / Math.pow(10, 9)) + " seconds.");
            System.out.println();
        } else if (elapsedNano >= 60 * Math.pow(10, 9)) {

            System.out.println();
            System.out.println("Elapsed time to process was " + (elapsedNano / (60 * Math.pow(10, 9))) + " minutes.");
            System.out.println();
        } else {

            System.out.println();
            System.out.println("Error");
            System.out.println();
        }

        System.out.println("Would you like to write these primes to a file in your Downloads folder? [true] / [false]");
        boolean doWrite = sc.nextBoolean();
        System.out.println();

        if (doWrite) {

            String fileName = n + " consecutive primes";
            FileOperator.writeToFile(getDataFromList(list), FileOperator.createFile(fileName));
            System.out.println();
        }

        System.out.println("System Closed");
    }

    private static String getDataFromList(List<String> list) {

        StringBuilder rawData = new StringBuilder();

        for (String s : list) {

            rawData.append(s).append("\n");
        }

        return rawData.toString();
    }

    private static long getNanoTime() {

        return System.nanoTime();
    }
}
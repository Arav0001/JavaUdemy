import java.util.ArrayList;
import java.util.List;

public class PrimeList {

    public static List<String> listPrimes(int n) {

        int count = 0;
        int i = 2;

        List<String> primesList = new ArrayList<>();

        while (count != n && n > 1) {

            if (isPrime(i)) {

                String text = "#" + (count + 1) + ": " + i;
                System.out.println(text);

                primesList.add(text);
                count++;
            }

            i++;
        }

        return primesList;
    }

    private static boolean isPrime (long number) {

        if (number <= 1) {

            return false;
        } else {

            for (long i = 2; i <= Math.sqrt(number); i++) {

                if (number % i == 0) {

                    return false;
                }
            }
        }

        return true;
    }
}
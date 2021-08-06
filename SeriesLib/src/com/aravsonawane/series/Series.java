package com.aravsonawane.series;

public class Series {

    public static long nSum(int n) {

        return (long) n * (n + 1) / 2;
    }

    public static long factorial(int n) {

        long nFactorial = 1;

        while (n > 0) {

            nFactorial = nFactorial * n;
            n--;
        }

        return nFactorial;
    }

    public static long fibonacci(int n) {

        long num1 = 0, num2 = 1, num3;

        if (n == 0) {

            return num1;
        }

        for (int i = 2; i <= n; i++) {

            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }

        return num2;
    }
}
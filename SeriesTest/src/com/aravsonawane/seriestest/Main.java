package com.aravsonawane.seriestest;

import com.aravsonawane.series.Series;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter index for functions to reach:");
        int k = sc.nextInt();

        System.out.println("=========================================================================================");

        for (int i = 0; i <= k; i++) {

            System.out.println(Series.nSum(i));
        }

        System.out.println("=========================================================================================");

        for (int i = 0; i <= k; i++) {

            System.out.println(Series.factorial(i));
        }

        System.out.println("=========================================================================================");

        for (int i = 0; i <= k; i++) {

            System.out.println(Series.fibonacci(i));
        }
    }
}
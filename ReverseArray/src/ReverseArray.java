import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        int[] array = readArray();
        System.out.println("Reversed Array: " + Arrays.toString(reverseArray(array)));
    }

    public static int[] readArray() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of array:");

        int length = sc.nextInt();
        int[] array = new int[length];

        System.out.println("Enter array:");

        for (int i = 0; i < length;  i++) {

            int input = sc.nextInt();
            array[i] = input;
        }

        return array;
    }

    public static int[] reverseArray(int[] array) {

        int length = array.length;

        for (int i = 0; i < length / 2; i++) {

            int temporary = array[i];
            array[i] = array[length - (i + 1)];
            array[length - (i + 1)] = temporary;
        }

        return array;
    }
}
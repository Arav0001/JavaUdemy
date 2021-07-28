import java.util.Scanner;

public class SortedArray {

    public static void main(String[] args) {

        int[] array = getIntegers(5);
        int[] sortedArray = sortIntegers(array);

        printArray(sortedArray);
    }

    public static int[] getIntegers(int size) {

        Scanner sc = new Scanner(System.in);
        int[] array = new int[size];

        System.out.println("Input Array:");

        for (int i = 0; i < size; i++) {

            int input = sc.nextInt();

            array[i] = input;
        }

        return array;
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {

        int[] sortedArray = new int[array.length];

        System.arraycopy(array, 0, sortedArray, 0, array.length);

        boolean instance = true;
        int temporary;

        while (instance) {

            instance = false;

            for (int i = 0; i < sortedArray.length - 1; i++) {

                if (sortedArray[i] < sortedArray[i + 1]) {

                    temporary = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temporary;

                    instance = true;
                }
            }
        }

        return sortedArray;
    }
}
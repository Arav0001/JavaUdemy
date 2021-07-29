import java.util.Scanner;

public class MinimumElement {

    private static int readInteger() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of array:");

        return sc.nextInt();
    }

    private static int[] readElements(int length) {

        Scanner sc = new Scanner(System.in);
        int[] array = new int[length];

        System.out.println("Enter array:");

        for (int i = 0; i < length;  i++) {

            int input = sc.nextInt();
            array[i] = input;
        }

        return array;
    }

    private static int findMin(int[] array) {

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

        return sortedArray[array.length - 1];
    }

    public static void getMinimumElement() {

        System.out.println(findMin(readElements(readInteger())));
    }
}
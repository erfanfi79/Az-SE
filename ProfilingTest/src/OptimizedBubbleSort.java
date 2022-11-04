import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

class OptimizedBubbleSort {

    public static void optimizedBubbleSort(int[] input) {
        boolean swapped = true;
        for (int pass = input.length - 1; pass >= 0 && swapped; pass--) {
            swapped = false;
            for (int i = 0; i < pass; i++) {
                if (input[i] > input[i + 1]) {
                    int temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    swapped = true;
                }
            }
        }
    }

    public static void main(String args[]) {
        int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = new Random().nextInt(100000);
        }
        optimizedBubbleSort(arr);
        System.out.println("Sorted array");
    }
}

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

class BubbleSort {
    static void bubbleSort(Integer[] a) {
        boolean sorted = false;
        Integer temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }


    public static void main(String args[]) {
        Integer[] arr = new Integer[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = new Random().nextInt(100000);
        }
        bubbleSort(arr);
        System.out.println("Sorted array");
    }
}

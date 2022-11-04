import java.util.ArrayList;
import java.util.Scanner;

public class JavaCup {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press number1: ");
        int i = scanner.nextInt();
        System.out.println("Press number2: ");
        int j = scanner.nextInt();
        System.out.println("Press number3: ");
        int k = scanner.nextInt();
        temp();
        eval(i, j, k);
    }
    public static void eval(int i, int j, int k)
    {
        if (i * i + j * j == k * k || i * i == j * j + k * k || j * j == i * i + k * k)
        {
            System.out.println("YES");
        }
        else { System.out.println("NO"); }
    }
    public static void temp() {
        ArrayList<Integer> a = new ArrayList<>(10000*20000);
        ArrayList<Integer> temp = new ArrayList<>(20000);
        for (int j = 0; j < 20000; j++) {
            temp.add(j);

        }
        for (int i = 0; i < 10000; i++)
        {
            a.addAll(temp);
            temp.remove(0);
            temp.add(temp.get(temp.size()-1)+1);
        }
    }
}

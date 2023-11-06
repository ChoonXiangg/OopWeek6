package ie.atu;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] anArray;
        int i;
        anArray = new int[10];
        for (i = 0; i <= 9; i++) {
            anArray[i] = 100 * (i + 1);
        }
        int value1 = 0;
        method1(anArray, value1);
        Scanner scanner1 = new Scanner(System.in);
        try {
            System.out.println("Enter a new value: ");
            anArray[10] = scanner1.nextInt();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }
    }
    static void method1(int[] anArray, int value1) {
        for (int value : anArray) {
            System.out.println("Element at index " + value1 + ": " + value);
            value1++;
        }
    }
}
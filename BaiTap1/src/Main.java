import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list");
        int size = sc.nextInt();
        int[] list = new int[size];
        System.out.println("Enter the elements of the list");
        for (int i = 0; i < size; i++) {
             list[i] =sc.nextInt();
        }
        System.out.println("your input list: ");
        for (int i = 0; i < size; i++) {
            System.out.print(list[i] + " ");
        }
        selectionSort(list);
        System.out.println("\nYour sorted list: ");
        for (int i = 0; i < size; i++) {
            System.out.print(list[i] + " ");
        }
    }
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
    }
}
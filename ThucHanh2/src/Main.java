import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the size of the array: ");
    int size = sc.nextInt();
    int[] array = new int[size];
    System.out.println("Please enter the elements of the array: ");
    for (int i = 0; i < size; i++) {
        array[i] = sc.nextInt();
    }
        System.out.println("your input list: ");
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
    }
    bubbleSortByStep(array);
    }
    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int i = 0; i < list.length - 1&&needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - i -1; j++) {
                if (list[j] > list[j+1]) {
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;

                    needNextPass = true;
                }
            }
            if (needNextPass==false) {
                System.out.println("Maybe the list is sorted and next pass is not needed");
                break;
            }

        }
        System.out.println("show the list after bubble sort");
        for (int j = 0; j < list.length; j++) {
            System.out.print(list[j] + " ");
        }
        System.out.println();
    }
}
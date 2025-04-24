//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    insertionSort(list);
    System.out.println("\nYour sorted list: ");
    for (int i = 0; i < list.length; i++) {
        System.out.print(list[i] + " ");
    }
    }
    static int[] list = {2,5,6,4,9,1,7,5,12,10};
    public static void insertionSort(int[] list) {
        int pos,x;
        for (int i = 1; i < list.length; i++) {
        x=list[i];
        pos=i;
        while (pos > 0 && list[pos-1] > x) {
            list[pos] = list[pos-1];
            pos--;
        }
        list[pos] = x;
        }
    }
}
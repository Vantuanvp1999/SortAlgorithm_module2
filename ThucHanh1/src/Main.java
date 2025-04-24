//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int[] list = {1, -2, 23, 4, 5, 16, 19,8, 18,12, 11, 10};
    public static void bubleSort(int[] arr) {
        boolean needNextPass = true;
        for (int i = 0; i < arr.length - 1; i++) {
            needNextPass = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    needNextPass = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        bubleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
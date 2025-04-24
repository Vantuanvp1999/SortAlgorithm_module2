//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    selectionSort(list);
    for (int i = 0; i < list.length; i++) {
        System.out.print(list[i] + " ");
    }
    }
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length-1; i++) {
            int CurrentMinIndex = i;
            double currentMin = list[i];
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < currentMin) {
                    currentMin = list[j];
                    CurrentMinIndex = j;
                }
            }
            if (CurrentMinIndex != i) {
                list[CurrentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
    static double[] list = {12.4,23.5,15.6,6.7, 7.9,11.1};
}
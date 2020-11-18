package by.epam.linear_program.main;
import java.util.Arrays;
public class Main668 {
    public static void main(String[] args) {
        int[] array = {5, 7, 2, 8, 1, 0};
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
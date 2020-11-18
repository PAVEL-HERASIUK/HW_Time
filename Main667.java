package by.epam.linear_program.main;

import java.util.Arrays;
//мертвый
public class Main667 {
    public static void main(String[] args) {
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(array));
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
          swap(array, left, minInd);
        }
        System.out.println(Arrays.toString(array));
    }

    private static int[] swap(int[] array, int left, int minInd) {
        return array;
    }
}

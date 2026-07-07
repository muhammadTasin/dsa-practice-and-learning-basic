import java.util.*;

public class Matrix_Highest_Row_Sum {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 8, 1, 4},
                {10, 2, 6, 9},
                {5, 5, 5, 5},
                {7, 12, 3, 1}
        };

        int highest = Integer.MIN_VALUE;
        int highestRow = -1;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }

            if (sum > highest) {
                highest = sum;
                highestRow = i;
            }
        }

        System.out.println("Highest row sum: " + highest);
        System.out.println("Row index: " + highestRow);
    }
}

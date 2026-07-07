import java.util.*;

public class firstRow_LastColDeleate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row: ");
        int row = sc.nextInt();
        System.out.print("Enter column: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] result = firstRow_LastColDeleate(arr);

        System.out.println("After deleting first row and last column:");
        printMatrix(result);

        sc.close();
    }

    public static int[][] firstRow_LastColDeleate(int[][] arr) {

        int array2[][] = new int[arr.length - 1][arr[0].length - 1];
        int newrow = 0;

        for (int i = 0; i < arr.length; i++) {
            int newCol = 0;

            for (int j = 0; j < arr[0].length; j++) {
                if (i != 0) {
                    if (j != arr[0].length - 1) {
                        array2[newrow][newCol] = arr[i][j];
                        newCol++;
                    }
                }
            }

            if (i != 0) {
                newrow++;
            }
        }

        return array2;
    }

    public static void printMatrix(int[][] arr) {
        if (arr.length == 0 || arr[0].length == 0) {
            System.out.println("Empty matrix");
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

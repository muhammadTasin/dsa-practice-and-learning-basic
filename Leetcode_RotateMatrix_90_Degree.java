import java.util.*;
public class Leetcode_RotateMatrix_90_Degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter row  size: ");
        int row = sc.nextInt();
        System.out.println("Rnter c size : ");
        int col = sc.nextInt();

        int array [][] = new int[row][col];
        int array2 [][]= new int [col][row];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter value off row "+(i+1));
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array2[j][row-1-i]=array[i][j];
            }
        }

            for (int i = 0; i < array2.length; i++) {
                for (int j2 = 0; j2 < array2[0].length; j2++) {
                    System.out.print(array2[i][j2]+" ");
                }
                System.out.println();
                
            }

    sc.close();
    }
}

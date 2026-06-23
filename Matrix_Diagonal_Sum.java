import java.util.*;
public class Matrix_Diagonal_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row : ");
        int row = sc.nextInt();
        System.out.println("Enter col : ");
        int col = sc.nextInt();
        int sum =0;

        int array[][] = new int [row][col];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Entering row :"+(i+1));
            for (int j = 0; j < col; j++) {
                System.out.println("Enter data for row : "+(i+1 )+ " col "+ (j));
                array[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < col; j++) {
                if (i==j){
                    sum+=array[i][j];
                }
            }
        }
        System.out.println("The matrix diagonal sum is : "+sum);
    }
}

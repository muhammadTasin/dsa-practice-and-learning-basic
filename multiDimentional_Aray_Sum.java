import java.util.*;
public class multiDimentional_Aray_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter row size : ");
        int row = sc.nextInt();
        System.out.println("Enter coloum size : ");
        int col = sc.nextInt();

        int [][]array = new int[row][col];
        int sumOfall =0;

        for (int i = 0; i < row; i++) {
            System.out.println("Entering row "+(i+1));
            for (int j = 0; j < col ; j++) {
                System.out.println("Enter your elements for row "+(i+1)+" column "+(j+1)+ " : ");
                array[i][j] = sc.nextInt();
                sumOfall+=array[i][j];


            }
        }
        System.out.println("And the sum of  all elements of the 2d array is : "+sumOfall);
    }
}

import java.util.*;
public class Upper_Triangle_Matrix {    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many row do you want to take :   ");
        int row = sc.nextInt();
        System.out.println("Enterb how many coloumn do you want to take : ");
        int col = sc.nextInt();

        int array[][] = new int[row][col];
         

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter elemets for row :"+(i+1));
            for (int j = 0; j < array[0].length; j++) {
                System.out.println("Enter elememts : ");
                array[i][j]=sc.nextInt();
            }
        }
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if(i<=j){
                    System.out.print(array[i][j]+" ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    sc.close();
    }
}

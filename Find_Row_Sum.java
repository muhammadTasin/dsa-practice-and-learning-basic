import java.util.*;
public class Find_Row_Sum {
public static void main (String[] args) {
         int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        

       int maxSum = Integer.MIN_VALUE;
        for ( int i =0; i<matrix.length;i++){
            int sum =0;
            for( int j =0; j<matrix[0].length;j++){
                sum+=matrix[i][j];
               if(sum>maxSum){
                maxSum=sum;
               }
            }
        }
        int counter =-1;
        
for (int i = 0; i < matrix.length; i++) {
        int summ2 =0;
    for (int j = 0; j < matrix[0].length; j++) {
        summ2+=matrix[i][j];
        if (summ2==maxSum){
            break;
        }
    }
      counter++;
}
System.out.println("The max sum is : "+maxSum);
System.out.println("The max sum row is : "+counter);

}
}



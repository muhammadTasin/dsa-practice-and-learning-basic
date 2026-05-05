import java.util.*;
 class AraiseB {
     public static double cube (double num, int root ){

         if (root==0){
             return 1 ;
         }
         //double ans = Math.pow(num,root-1);
         return num*cube(num,root-1);

     }

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter the base case : ");
         double base = sc.nextDouble();
         System.out.println("Enter the power case : ");
         int pow = sc.nextInt();

         System.out.println("The recursive answer is : ");
         System.out.println(cube(base,pow));

     }
}

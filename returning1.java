import java.util.*;
public class returning1 {
    public static void recursion (int start) {
        if (start ==0){
            System.out.println(1);
            return;
        }
        System.out.println(start);
        recursion(start-1);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int start =sc.nextInt();


        System.out.println("The extra 1 printing ");
        recursion(start);


    }
}

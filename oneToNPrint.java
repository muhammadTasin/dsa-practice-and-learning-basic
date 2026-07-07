import java.util.*;
public class oneToNPrint {

    public static void recursion (int a){
        if (a==0){
            return;
        }
        recursion(a-1);
        System.out.println(a);

    }
    public static void revRecursion (int start,int end ){
        if (start > end){
            return;
        }
        System.out.println(end);
        revRecursion(start,end-1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Enter start number : ");
        int start =sc.nextInt();
        System.out.println("Enter end number : ");
        int end = sc.nextInt();

        System.out.println("THe recurrence answer is : ");
        recursion(num);
        System.out.println("And the reverse recurssion is : ");
        revRecursion(start,end);

    }

}

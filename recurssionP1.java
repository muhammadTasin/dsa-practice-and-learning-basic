import java.util.*;
public class recurssionP1 {

    public static void recursiveCall (int n){
        if (n >5) {
            System.out.println("Input should be 5 or smaller ");
            return ;
        }
        System.out.println(n);
        if (n ==5){
            return;
        }
        recursiveCall(n+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println("my first recursive program output is : ");
        recursiveCall(n);



    }
}

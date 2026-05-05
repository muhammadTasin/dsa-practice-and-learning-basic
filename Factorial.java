import java.util.*;
public class Factorial {
    public static int factorial (int n) {
        if (n == 0) return 1;

        return n*factorial((n - 1));
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        System.out.println("Rhe factorial of "+ num+ " is : ");
        System.out.println(factorial(num));

    }
}

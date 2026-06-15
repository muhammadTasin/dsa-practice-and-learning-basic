import java.util.*;
public class duplicate_element_in_2D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many elements do you want to take : ");
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the elements of the array : ");
            array[i] = sc.nextInt();
        }

        // int counter = 0;
        int save = -1;
        int save_num = 0;
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    //counter++;
                    save = j;
                    save_num = array[i];
                    flag = true;
                    break;
                }
            }
            break;
        }


        if (flag) {
            System.out.println(" Repeated element Found at index : " + save + " and the number is : " + save_num);
        } else {
            System.out.println("No repeated elements were found");
        }
    }
}

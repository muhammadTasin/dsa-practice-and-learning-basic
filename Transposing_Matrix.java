public class Transposing_Matrix{
    public static void main(String[] args) {
        int [] [] array = new int[3][3];

        int [][]array2 = {
            {1, 2, 3},
            {3,5,6},
            {7,8,9}
        };


        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                array[j][i]=array2[i][j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}

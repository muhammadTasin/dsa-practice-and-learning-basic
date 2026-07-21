public class roate90degree_matrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // A 90-degree clockwise rotation is the same as reading
        // every column from bottom to top.
        for (int col = 0; col < matrix[0].length; col++) {
            for (int row = matrix.length - 1; row >= 0; row--) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}

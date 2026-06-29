class AssgnTask2{

    public static Integer[][] compressMatrix( Integer[][] matrix ){
        
        int row = matrix.length;
        int col = matrix[0].length;

        Integer[][] newMatrix = new Integer[row / 2][col / 2];

        int newRow = 0;
        for(int i = 0; i < row; i = i + 2){
            int newCol = 0;
            for(int j = 0; j < col; j = j + 2){
                int sum = 0;

                for(int k = i; k < i + 2; k++){
                    for(int l = j; l < j + 2; l++){
                        sum = sum + matrix[k][l];
                    }
                }

                newMatrix[newRow][newCol] = sum;
                newCol++;
            }
            newRow++;
        }

        return newMatrix;
    }

    public static void main(String[] args){
        Integer[][] matrix = {
            { 1 , 2 , 3 , 4 },
            { 5 , 6 , 7 , 8 },
            { 1 , 3 , 5 , 2 },
            {-2 , 0 , 6 ,-3 }
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        
        System.out.println("\nExpected Output:");
        System.out.print("| 14 | 22 |\n| 2  | 10 |\n");
        
        System.out.print("\nYour Output:\n");
        Integer[][] returnedArray = compressMatrix( matrix );
        Arr.print2D( returnedArray );
    }
}

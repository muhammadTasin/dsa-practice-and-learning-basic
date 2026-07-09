class AssgnTask1{

    public static Integer rowRotation( Integer examWeek, String[][] matrix ){

        int row = matrix.length;
        int col = matrix[0].length;
        int rotate = examWeek - 1;

        for(int i = 0; i < rotate; i++){
            String[] temp = new String[col];

            for(int j = 0; j < col; j++){
                temp[j] = matrix[row - 1][j];
            }

            for(int j = row - 1; j > 0; j--){
                for(int k = 0; k < col; k++){
                    matrix[j][k] = matrix[j - 1][k];
                }
            }

            for(int j = 0; j < col; j++){
                matrix[0][j] = temp[j];
            }
        }

        Arr.print2D(matrix);

        int rowNumber = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(matrix[i][j].equals("AA")){
                    rowNumber = i + 1;
                }
            }
        }

        return rowNumber;
    }

    public static void main(String[] args){
        String[][] seatStatus = {
                {"A" , "B"  , "C"  , "D"  , "E"},
                {"F" , "G"  , "H"  , "I"  , "J"},
                {"K" , "L"  , "M"  , "N"  , "O"},
                {"P" , "Q"  , "R"  , "S"  , "T"},
                {"U" , "V"  , "W"  , "X"  , "Y"},
                {"Z" , "AA" , "BB" , "CC" , "DD"}
        };
        System.out.println("Given Seat Status: ");
        Arr.print2D(seatStatus);
        
        System.out.println("\nExpected Output:");
        System.out.println("| U  | V  | W  | X  | Y  | ");
        System.out.println("| Z  | AA | BB | CC | DD | ");
        System.out.println("| A  | B  | C  | D  | E  | ");
        System.out.println("| F  | G  | H  | I  | J  | ");
        System.out.println("| K  | L  | M  | N  | O  | ");
        System.out.println("| P  | Q  | R  | S  | T  | ");
        System.out.println("Your friend AA will be on row 2");
        
        System.out.print("\nYour Output:\n");
        Integer examWeek = 3;
        Integer rowNumber = rowRotation( examWeek, seatStatus );
        System.out.println("Your friend AA will be on row "+rowNumber);
    }
}

class Arr {
    public static void print2D(Object[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("| " + arr[i][j] + " ");
            }
            System.out.println("|");
        }
    }
}

public class SpiralMatrix {
    public static void printSpiral(int matrix[][]) {
        int stRow = 0, stCol = 0;
        int endRow = matrix.length-1, endCol = matrix[0].length-1;
        while(stRow <= endRow && stCol <= endCol) {
            //top
            for(int j=stCol; j<=endCol; j++) {
                System.out.print(matrix[stRow][j]+" ");
            }
            //right
            for(int i=stRow+1; i<=endRow; i++) {
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottom
            for(int j=endCol-1; j>=stCol; j--) {
                if(stRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for(int i=endRow-1; i>= stRow+1; i--) {
                if(stCol == endCol){
                    break;
                }
                System.out.print(matrix[i][stCol]+" ");
            }
            stCol++;
            stRow++;
            endCol--;
            endRow--;
        }
        System.err.println();
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
                        printSpiral(matrix);
    }
}

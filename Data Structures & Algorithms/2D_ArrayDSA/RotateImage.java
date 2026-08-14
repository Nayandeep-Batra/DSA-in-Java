public class RotateImage {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0; i<n; i++) { // Transposing the matrix in place
            for(int j=i+1; j<n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
            int left = 0;
            int right = n-1;
            while(left < right) { // making row in reverse order
                    int t = matrix[i][left];
                    matrix[i][left] = matrix[i][right]; 
                    matrix[i][right] = t;
                    left++;
                    right--;
            }
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        rotate(matrix);
        for(int i=0; i<matrix.length; i++) {
            for(int j = 0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

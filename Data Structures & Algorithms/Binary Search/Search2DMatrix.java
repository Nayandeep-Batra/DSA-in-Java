public class Search2DMatrix {
    // public static boolean searchMatrix(int[][] matrix, int target) { // TC = O(m+n))
    //     int row = 0, col = matrix[0].length-1;
    //     while(row < matrix.length && col >= 0) {
    //         if(matrix[row][col] == target) {
    //             return true;
    //         }
    //         else if(target < matrix[row][col]) {
    //             col--;
    //         }
    //         else {
    //             row++;
    //         }
    //     }
    //     return false;
    // }

    public static boolean searchMatrix(int[][] matrix, int target) { // TC = O(log(m*n))
        int rowSize = matrix.length; int colSize = matrix[0].length;
        int left = 0, right = rowSize * colSize - 1;
        while(left <= right) {
            int mid = left + (right-left)/2;
            int row = mid / colSize;
            int col = mid % colSize;
            if(matrix[row][col] == target) {
                return true;
            }
            else if(matrix[row][col] > target) {
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int mat[][]={{1,2,3},
                    {4,5,6},
                    {7,8,9}};
        System.out.println(searchMatrix(mat, 3));
    }
}

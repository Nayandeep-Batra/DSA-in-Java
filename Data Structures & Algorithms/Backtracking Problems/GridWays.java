// find number of ways to reach from (0,0) to (n-1,m-1) in a N*M grid. 
// Allowed moves - right or down

public class GridWays {
    public static int countWays(int i, int j, int n, int m) { // TC = O(2^(n+m))
        // base case
        if(i == n-1 && j == m-1) {
            return 1;
        } 
        else if(i==n || j == m) { // edge case - boundary cross condition
            return 0;
        }

        int way1 = countWays(i+1, j, n, m); // moving down
        int way2 = countWays(i, j+1, n, m); // moving right
        return way1 + way2;
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(countWays(0,0, n, m));
    }
}

// Normally grid ways has exponential TC, but it can be reduced down to linear TC using Permutations.
// Formula for total ways will be____
// Total charactrs = (n-1 + m-1)
//  Repeating characters = n-1 times D (down) & n-1 times R(right)
// therefore, total ways = (n-1 + m-1)! / (n-1)! * (m-1)!
// TC = O(n+m)
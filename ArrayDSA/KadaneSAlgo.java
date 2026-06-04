import java.util.*;
public class KadaneSAlgo { // TC = O(n)
    public static void Kadanes(int num[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0; i<num.length; i++) {
            currSum += num[i];
            maxSum = Math.max(maxSum, currSum);
            if(currSum < 0) {
                currSum = 0;
            }
        }
        System.out.println("Maximum SubArray Sum is : " + maxSum);
    }
    public static void main(String[] args) {
        int num[] = {-2,-3,4,-1,-2,1,5,-3};
        Kadanes(num);
        int num2[] = {-4,-3,-2,-1};
        Kadanes(num2);
    }
}


// +ve + +ve = +ve
// Big+ve + Small-ve = +ve
// Small+ve + Big-ve = -ve , then we consider it 0
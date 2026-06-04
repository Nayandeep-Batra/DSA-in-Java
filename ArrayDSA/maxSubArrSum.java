import java.util.*;
public class maxSubArrSum {

// This is the brute force approach for calculating maximum SubArray sum.
// The best approach is Kadane's Algorithm


//     public static void SubArr(int num[]) { // Tc = O(n^3)
//         int currSum=0;
//         int maxSum = Integer.MIN_VALUE;
//         for(int i=0; i<num.length; i++) {
//             for(int j=i; j<num.length; j++) {
//                 currSum = 0;
//                 for(int k=i; k<=j; k++) {
//                     currSum += num[k];
//                 }
//                 if(maxSum < currSum){
//                     maxSum = currSum;
//                 }
//             }
//         }
//         System.out.println("Maximum Sum : " + maxSum);
//     }
//     public static void main(String[] args) {
//         int num[] = {1,-2,6,-1,3};
//         SubArr(num);
//     }
// }


// 2nd Approach is Prefix Sum Approach in which we create an array named prefix

public static void SubArr(int num[]) { // Tc = O(n^2)
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];
        // Calculating prefix array
        prefix[0] = num[0];
        for(int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + num[i];
        }

        for(int i=0; i<num.length; i++) {
            int start = i;
            for(int j=i; j<num.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum Sum : " + maxSum);
    }
    public static void main(String[] args) {
        int num[] = {1,-2,6,-1,3};
        SubArr(num);
    }
}
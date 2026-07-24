public class MaxAvgSubarr {
    public static double findMaxAverage(int[] nums, int k) {
        int start = 0;
        int sum = 0;
        double maxAvg = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            if((i - start + 1) == k) { // checking if window size is exactly equal to k.
                double currAvg = (double)sum/k;
                maxAvg = Math.max(currAvg, maxAvg);
                sum-= nums[start];
                start++;
            }
        }
        return maxAvg; 
    }
    public static void main(String args[]) {
        int nums[] = {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums, 4));
    }
}

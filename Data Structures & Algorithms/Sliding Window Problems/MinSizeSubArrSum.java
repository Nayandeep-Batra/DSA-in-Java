public class MinSizeSubArrSum {
    public static int minSubArrayLen(int target, int[] nums) { // Tc = O(n)
        int start = 0;
        int sum = 0;
        int minCount = Integer.MAX_VALUE;
        for(int end=0; end<nums.length; end++) {
            sum += nums[end];
            while(sum >= target) {
                int count = end - start + 1; // here count is window size which is variable. the window size tells us about the no. of elements.
                minCount = Math.min(minCount, count);
                sum -= nums[start];
                start++;
            }
        }
        if(minCount == Integer.MAX_VALUE) {
            return 0;
        }
        return minCount;
    }
    public static void main(String[] args) {
        int nums [] = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7, nums));
    }
}

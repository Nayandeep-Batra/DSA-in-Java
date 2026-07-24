public class MaxConsecutiveOneIII {
    public static int longestOnes(int[] nums, int k) {
        int start = 0;
        int zeroCount = 0;
        int maxOneCount = Integer.MIN_VALUE;
        for(int end=0; end<nums.length; end++) {
            if(nums[end] == 0) {
                zeroCount++;
            }
            while(zeroCount > k) {
                if(nums[start] == 0){
                    zeroCount--;
                }
                start++;
            }
            int OneCount = end - start + 1;
                maxOneCount = Math.max(maxOneCount, OneCount);
        }
        return maxOneCount;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(longestOnes(nums, 2));
    }
}

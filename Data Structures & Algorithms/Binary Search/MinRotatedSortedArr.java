public class MinRotatedSortedArr {
    public static int findMin(int[] nums) { // This question is same as LeetCode 162
        int st = 0, end = nums.length-1;
        while(st < end) {
            int mid = st + (end - st)/2;
            if(nums[mid] >= nums[end]) {
                st = mid+1;
            }
            else {
                end = mid;
            } 
        }
        return nums[st];
    }
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        System.out.println(findMin(nums));
    }
}

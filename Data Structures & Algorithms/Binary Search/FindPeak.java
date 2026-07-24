public class FindPeak {
    public static int findPeakElement(int[] nums) {
        int st = 0, end = nums.length-1;
        while(st < end) {
            int mid = st + (end-st)/2;
            if(nums[mid] < nums[mid+1]) {
                st = mid+1;
            }
            else {
                end = mid;
            }
        }
        return st;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(nums));
    }
}

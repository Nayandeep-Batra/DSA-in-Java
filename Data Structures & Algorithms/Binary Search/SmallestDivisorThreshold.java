public class SmallestDivisorThreshold {
    public static int smallestDivisor(int[] nums, int threshold) {
        int st = 1, end = 0;
        for(int i=0; i<nums.length; i++) {
            end = Math.max(end, nums[i]);
        }
        int smallestDivisor = end;
        while(st <= end) {
            int sum = 0;
            int mid = st + (end-st)/2; // mid is the divisor here.
            for(int numbers : nums) {
                sum += (numbers + mid - 1)/mid;
            }
            if(sum <= threshold) {
                smallestDivisor = mid;
                end = mid-1;
            }
            else {
                st = mid+1;
            }
        }
        return smallestDivisor;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,5,9};
        int threshold = 6;
        System.out.println(smallestDivisor(nums, threshold));
    }
}

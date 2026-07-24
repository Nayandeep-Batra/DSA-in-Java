public class SearchInsertPos {
    public static int searchInsert(int[] nums, int target) {
        int st = 0, end = nums.length - 1;
        while(st <= end) {
            int mid = st + (end-st)/2;
            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] < target) {
                st = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return st;
    }
    public static void main(String[] args) {
        int nums[] = {1,3,5,6};
        System.out.println(searchInsert(nums, 2));
    }
}

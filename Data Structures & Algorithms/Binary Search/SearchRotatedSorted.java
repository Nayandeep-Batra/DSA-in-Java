public class SearchRotatedSorted {
    public static int search(int nums[] , int target) {
        int st = 0 , end = nums.length - 1;
        while(st <= end) {
            int mid = st+(end-st)/2;
            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[st] <= nums[mid]) { // Left sorted part
                if(nums[st] <= target && target <= nums[mid]) {
                    end = mid-1;
                }
                else{
                    st = mid+1;
                }
            }
            else { // Right sorted part
                if(nums[mid] <= target && target <= nums[end]) {
                    st = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));
    }
}

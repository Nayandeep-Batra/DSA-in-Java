import java.util.*;
public class FirstandLastPos {
    public static int firstPosition(int[] nums, int target) {
        int firstPos = -1;
        int st = 0, end = nums.length-1;
        while(st <= end) {
            int mid = st + (end-st)/2;
            if(nums[mid] == target) {
                firstPos = mid;
                end = mid-1;
            }
            else if(nums[mid] > target) {
                end = mid-1;
            }
            else {
                st = mid+1;
            }
        }
        return firstPos;
    }

    public static int lastPosition(int[] nums, int target) {
        int lastPos = -1;
        int st = 0, end = nums.length-1;
        while(st <= end) {
            int mid = st + (end-st)/2;
            if(nums[mid] == target) {
                lastPos = mid;
                st = mid+1;
            }
            else if(nums[mid] > target) {
                end = mid-1;
            }
            else {
                st = mid+1;
            }
        }
        return lastPos;
    }
    public static int[] searchRange(int[] nums, int target) {
        int firstPos = firstPosition(nums, target);
        int lastPos = lastPosition(nums, target);
        if(firstPos == -1) {
            return new int[] {-1,-1};
        }
        return new int[] {firstPos, lastPos};
    }

    public static void main(String[] args) {
        int nums[] = {5,7,7,8,8,1};
        System.out.println(Arrays.toString(searchRange(nums, 8)));
    }
}

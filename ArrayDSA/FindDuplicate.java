import java.util.*;
public class FindDuplicate {
    public static int duplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == nums[i+1]) {
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {1,3,4,2,2};
        int ans = duplicate(nums);
        System.out.println("Duplicate element found : " + ans);
    }
}
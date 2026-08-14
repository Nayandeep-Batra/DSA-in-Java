import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingEle {
    public static List<Integer> findMissingElements(int[] nums) {
        int minElement = Integer.MAX_VALUE;
        int maxElement = Integer.MIN_VALUE;
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            minElement = Math.min(minElement, nums[i]);
            maxElement = Math.max(maxElement, nums[i]);
        }
        Arrays.sort(nums);
        int idx = 0;
        for(int i=minElement; i<=maxElement; i++) {
            if(i == nums[idx]) {
                idx++;
            }
            else {
                ans.add(i);
            }
        } 
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {1,4,2,5};
        System.out.println(findMissingElements(nums));
    }
}

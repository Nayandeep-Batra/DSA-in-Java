public class MajorityElement {
    public static int majorityElement(int[] nums) { // Boyer-Moore Majority Vote Algorithm.
        int n = nums.length;
        int ans = 0, c = 0;
        for(int i=0; i<n; i++) {
            if(c == 0) {
                ans = nums[i];
            }
            if(ans == nums[i]) {
                c++;
            }
            else {
                c--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}

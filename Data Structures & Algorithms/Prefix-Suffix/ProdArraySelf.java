import java.util.Arrays;
public class ProdArraySelf {
    public static int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        ans[0] = 1;
        // prefix
        for(int i=1; i<nums.length; i++) {
            ans[i] = ans[i-1] * nums[i-1];
        }
        //suffix
        int suffix = 1;
        for(int i=nums.length-2; i>=0; i--) {
            suffix *= nums[i+1];
            ans[i] *= suffix; 
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}

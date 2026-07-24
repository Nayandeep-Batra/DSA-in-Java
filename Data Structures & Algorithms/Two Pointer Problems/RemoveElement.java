public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int writer = 0;
        for(int reader = 0; reader<nums.length; reader++) {
            if(nums[reader] != val) {
                nums[writer] = nums[reader];
                writer++;
            } 
        }
        return writer;
    }
    public static void main(String[] args) {
        int nums[] ={0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums, val));
    }
}

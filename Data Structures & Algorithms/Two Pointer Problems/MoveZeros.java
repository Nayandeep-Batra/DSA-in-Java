public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int writer = 0;
        for(int reader = 0; reader < nums.length; reader++) {
            if(nums[reader] != 0) {
                nums[writer] = nums[reader];
                writer++;
            }
        }
        while(writer < nums.length) {
            nums[writer] = 0;
            writer++;
        }
    }
    public static void main(String[] args) {
        int nums[] ={0,1,0,3,12};
        moveZeroes(nums);
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}

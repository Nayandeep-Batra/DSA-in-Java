public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int writer = 0;
        int k = 1;
        for(int reader=1; reader<nums.length; reader++) {
            if(nums[reader] != nums[writer]) {
                writer++;
                nums[writer] = nums[reader];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
}

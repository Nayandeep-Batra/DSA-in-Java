public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        int pivot = -1, n = nums.length;
        for(int i=n-2; i>=0; i--) { // finding Pivot.
            if(nums[i] < nums[i+1]) {
                pivot = i;
                break;
            }
        }
        if(pivot == -1) { // if no pivot is found, then reversing the array.
            int st = 0, end = n-1;
            while(st < end) {
                int temp = nums[st];
                nums[st] = nums[end];
                nums[end] = temp;
                st++;
                end--;
            }
            return;
        }
        for(int i=n-1; i>pivot; i--) { // finding next bigger element than pivot.
            if(nums[i] > nums[pivot]) {
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                break;
            }
        }
        int st = pivot+1, end = n-1;
        while(st < end) { // reversing the remaining array after the pivot.
            int temp = nums[st];
            nums[st] = nums[end];
            nums[end] = temp;
            st++;
            end--;
        } 
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        nextPermutation(nums);
        for(int val : nums) {
            System.out.print(val + " ");
        }
    }
}

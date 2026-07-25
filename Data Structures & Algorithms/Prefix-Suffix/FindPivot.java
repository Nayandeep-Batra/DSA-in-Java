public class FindPivot {
    // public static int pivotIndex(int[] nums) { // TC = O(n) & SC = O(n)
    //     int leftSum[] = new int[nums.length];
    //     int rightSum[] = new int[nums.length];
    //     // left Sum of each index
    //     for(int i=1; i<nums.length; i++) {
    //         leftSum[i] = leftSum[i-1] + nums[i-1];
    //     }
    //     // right Sum of each index
    //     for(int i=nums.length-2; i>=0; i--) {
    //         rightSum[i] = rightSum[i+1] + nums[i+1]; 
    //     }
    //     for(int i=0; i<nums.length; i++) {
    //         if(leftSum[i] == rightSum[i]) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    // Better Approach because we optimise space complexity to O(1)
    public static int pivotIndex(int[] nums) { // TC = O(n) & SC = O(1)
        int totalSum = 0;
        int leftSum  = 0;
        for(int i=0; i<nums.length; i++) {
            totalSum += nums[i];
        }
        for(int i=0; i<nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            if(leftSum == rightSum) {
                return i;
            }
            else {
                leftSum += nums[i];
            } 
        }
        return -1;
    }


    public static void main(String[] args) {
        int nums[] = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
}

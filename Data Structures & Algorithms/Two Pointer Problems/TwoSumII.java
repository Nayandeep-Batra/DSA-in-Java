public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int st = 0, end = numbers.length-1;
        while(st < end) {
            if(numbers[st] + numbers[end] == target) {
                return new int[] {st+1,end+1};
            }
            else if(numbers[st] + numbers[end] > target) {
                end--;
            }
            else{
                st++;
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int numbers[] = {2,7,11,15};    
        System.out.println(twoSum(numbers, 9));
    }    
}

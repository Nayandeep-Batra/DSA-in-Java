public class kSubArrAvgThreshold {
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int start = 0;
        int subArrCount = 0;
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
            if((i - start + 1) == k) {
                double avg = (double)sum/k;
                if(avg >= threshold) {
                    subArrCount++;
                }
                sum -= arr[start];
                start++;
            }
        }
        return subArrCount;
    }
    public static void main(String args[]) {
        int arr[] = {2,2,2,2,5,5,5,8};
        System.out.println(numOfSubarrays(arr, 3, 4));
    }
}

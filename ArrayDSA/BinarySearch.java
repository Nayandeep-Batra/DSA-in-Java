public class BinarySearch {

        public static int BinSearch(int num[], int key) { // TC = O(log n)
            int st = 0, end = num.length-1;
            while (st <= end) {
                int mid = st+(end-st)/2;
                if(num[mid] == key)
                    return mid;
                else if(num[mid] >= key) {
                    end = mid-1;
                }
                else
                    st = mid+1;
            }
            return -1;
        }
        public static void main(String[] args) {
        int num[] = {-1,0,3,5,9,12};
        int key = 9;
        System.out.println(BinSearch(num, key));
    }
}

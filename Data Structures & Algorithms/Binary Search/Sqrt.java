public class Sqrt {
    public static int mySqrt(int x) {
        int st = 1, end = x;
        while(st <= end) {
            int mid = st + (end-st)/2;
            long square = (long)mid*mid;
            if(square == x) {
                return mid;
            }
            else if(square < x) {
                st = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
}

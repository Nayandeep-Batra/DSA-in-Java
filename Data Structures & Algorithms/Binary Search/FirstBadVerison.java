/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class FirstBadVerison {
    public static int firstBadVersion(int n) {
        int st = 1, end = n;
        int ans = 0;
        while(st <= end) {
            int mid = st + (end - st)/2;
            if(true) {// if(isBadVersion(mid)) {
                ans = mid;
                end = mid-1;
            }
            else {
                st = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }
}

public class KokoEatsBanana {
    public static int minEatingSpeed(int[] piles, int h) {
        int st = 1, end = 0;
        for(int i=0; i<piles.length; i++) { // Getting Maximum Pile Size
            end = Math.max(end, piles[i]);
        }
        int minSpeed = end;
        while(st <= end) {
            int mid = st + (end - st)/2;  // mid is eating speed of koko per hour.
            long hours = 0;
            for(int pile : piles) {
                hours += (pile + mid - 1)/ mid;
            }
            if(hours <= h) {
                minSpeed = mid;
                end = mid - 1;
            }
            else {
                st = mid + 1;
            }
        }
        return minSpeed;
    }
    public static void main(String[] args) {
        int piles[] = {3,6,7,11};
        int h = 8;
        System.out.println(minEatingSpeed(piles, h));
    }
}

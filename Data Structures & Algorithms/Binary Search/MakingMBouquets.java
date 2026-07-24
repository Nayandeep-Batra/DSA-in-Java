public class MakingMBouquets {
    public static int minDays(int[] bloomDay, int m, int k) {
        if((long) m*k > bloomDay.length) { // Edge case : checking not enough flowers to make m bouquets. 
            return -1;
        }
        // Applying Binary Search on the answer (Minimum Days)
        int st = Integer.MAX_VALUE, end = 0;
        int minDays = -1;
        for(int i=0; i<bloomDay.length; i++) { // Calculating the search space : earliest and lastest possible blooming days.
            st = Math.min(st, bloomDay[i]);
            end = Math.max(end, bloomDay[i]);
        }
        while(st <= end) {
            int bouquets = 0;
            int mid = st + (end-st)/2; // mid is the day on which we check if required flowers are bloomed or not.
            int consecutiveDays = 0;
            for(int i=0; i<bloomDay.length; i++) {
                if(bloomDay[i] <= mid) { // if flower has bloomed by mid(day) then increment consecutive days.
                    consecutiveDays++;
                    if(consecutiveDays == k) { // if we get k consecutive flowers then we make a bouquet and start counting flowers again.
                        bouquets++;
                        consecutiveDays = 0; 
                    }
                }
                else { // Consecutive sequence breaks because the current flower has not bloomed yet.
                    consecutiveDays = 0;
                }
            }
            if(bouquets >= m) { // Finally calculating minimum days to make m bouquets, i.e. if we can make enough bouquets, try to find an even smaller day.
                minDays = mid;
                end = mid-1;
            } 
            else { // otherwise, we need to wait for more flowers to bloom.
                st = mid+1;
            }
        }
        return minDays;
    }

    public static void main(String[] args) {
        int bloomDay[] = {1,10,3,10,2};
        int m = 3;
        int k = 1;
        System.out.println(minDays(bloomDay,m,k));
    }
}

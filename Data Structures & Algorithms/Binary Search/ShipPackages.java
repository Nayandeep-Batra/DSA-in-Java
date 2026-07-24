public class ShipPackages {
    public static int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        int minShipCap = 0;
        for(int i=0; i<weights.length; i++) {
            left = Math.max(left, weights[i]);
            right += weights[i];
        }
        while(left <= right) {
            int capacity = left + (right - left)/2;
            int currWeight = 0, daysTaken = 1;
            for(int i=0; i<weights.length; i++) { // Simulating if the capacity of ship is adequate for weights or not.
                if((currWeight + weights[i]) > capacity) {
                    daysTaken++;
                    currWeight = weights[i];
                }
                else {
                    currWeight += weights[i];
                }
            }
            if(daysTaken <= days) {
                minShipCap = capacity;
                right = capacity-1;
            }
            else {
                left = capacity+1;
            }
        }
        return minShipCap;
    }

    public static void main(String[] args) {
        int weights[] = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(shipWithinDays(weights, days));
    }
}

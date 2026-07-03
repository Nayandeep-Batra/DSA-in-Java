public class CountSetBits {
    // to compute any decimal number in binary, the decimal no. can be represented in (log n + 1) binary digits.
    public static int setBits(int n) { // Tc = O(log n)
        int count = 0;
        int bitMask = 1;
        while(n>0) {
            if((n & bitMask) != 0) { // checking the least significant bit (LSB)
                count++;
            } 
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(setBits(15));
    }
}

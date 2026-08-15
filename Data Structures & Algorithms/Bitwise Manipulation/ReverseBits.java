public class ReverseBits {
    public static int reverseBits(int n) {
        int ans = 0;
        for(int i=0; i<32; i++){ // we cant use while(n != 0) because the question specifically asks us for 32 bits integer. if we use while, if n has leading zeros, they'll never be processed. so, we use for loop 32 times.
            int bit = n & 1;
            ans = ans << 1;
            ans = ans | bit;
            n = n >> 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(reverseBits(43261596));
    }
}

public class Number1Bits {
    public static int hammingWeight(int n) { // Brian Kernighan's algorithm.
        int count = 0;
        while(n != 0) {
            n = n & (n-1);    
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(hammingWeight(11));
    }
}

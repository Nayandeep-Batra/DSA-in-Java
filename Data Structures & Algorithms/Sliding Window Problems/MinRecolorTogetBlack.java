public class MinRecolorTogetBlack {
    public static int minimumRecolors(String blocks, int k) {
        int start = 0;
        int wCount = 0;
        int minWcount = Integer.MAX_VALUE;
        for(int i=0; i<blocks.length(); i++) {
            char ch = blocks.charAt(i);
            if(ch == 'W'){
                wCount++;
            }
            if((i - start + 1) == k) {
                minWcount = Math.min(minWcount, wCount);
                if(blocks.charAt(start) == 'W') {
                    wCount--;
                }
                start++;
            }
        } 
        return minWcount;
    }
    public static void main(String args[]) {
        String blocks = "WBBWWBBWBW";
        System.out.println(minimumRecolors(blocks, 7));
    }
}

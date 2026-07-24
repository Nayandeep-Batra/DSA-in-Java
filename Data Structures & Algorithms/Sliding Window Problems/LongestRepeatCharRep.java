public class LongestRepeatCharRep {
    public static int characterReplacement(String s, int k) {
        int start = 0;
        int freq[] = new int[26];
        int maxFreq = 0;
        int longestStr = 0;
        for(int end=0; end<s.length(); end++) {
            freq[s.charAt(end) - 'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(end) - 'A']);
            while((end-start+1) - maxFreq > k) {
                freq[s.charAt(start) - 'A']--;
                start++;
            }
            int windowSize = end - start + 1;
            longestStr = Math.max(longestStr, windowSize);
        }
        return longestStr;
    }
    public static void main(String[] args) {
        String s = "ABAB";
        System.out.println(characterReplacement(s, 2));
    }
}

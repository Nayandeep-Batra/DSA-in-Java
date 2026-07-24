public class PermutationInString {
    public static boolean isSame(int freqs1[], int freqs2[]) {
        for(int i=0; i<26; i++) {
            if(freqs1[i] != freqs2[i]) {
                return false;
            }
        }
        return true;
    }
    public static boolean checkInclusion(String s1, String s2) {
        int start = 0;
        int freqs1[] = new int[26];
        int freqs2[] = new int[26];
        for(int i=0; i<s1.length(); i++) {
            freqs1[s1.charAt(i) - 'a']++;
        }
        int windowSize = s1.length();
        for(int end=0; end<s2.length(); end++) {
            freqs2[s2.charAt(end) - 'a']++;
            if((end - start + 1) == windowSize) {
                if(isSame(freqs1, freqs2)) {
                    return true;
                }
                freqs2[s2.charAt(start) - 'a']--;
                start++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }
}

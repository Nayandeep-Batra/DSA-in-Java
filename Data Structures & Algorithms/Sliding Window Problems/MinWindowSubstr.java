public class MinWindowSubstr {
    public static String minWindow(String s, String t) {
        int tarFreq[] = new int[128];
        int windFreq[] = new int[128];
        int start = 0, matched = 0;
        String ans = "";
        for(int i=0; i<t.length(); i++) {
            tarFreq[t.charAt(i)]++;
        }
        for(int end=0; end<s.length(); end++) {
            windFreq[s.charAt(end)]++;
            if(windFreq[s.charAt(end)] <= tarFreq[s.charAt(end)]) {
                matched++;
            }
            while(matched == t.length()) {
                if(ans.isEmpty() || ((end - start + 1)< ans.length())) {
                    ans = s.substring(start, end + 1);
                }
                windFreq[s.charAt(start)]--;
                if(windFreq[s.charAt(start)] < tarFreq[s.charAt(start)]) {
                    matched--;
                }
                start++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));
    }
}

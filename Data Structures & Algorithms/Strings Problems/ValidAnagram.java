public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int count[] = new int[26];
        for(int i=0; i<s.length(); i++) {
            int idx = s.charAt(i) - 'a'; // calculating frequency of each character in string and storing it in frequency array "count".
            count[idx]++; 
        }
        for(int i=0; i<t.length(); i++) {
            int idx = t.charAt(i) - 'a';
            if(count[idx] == 0) {
                return false;
            }
            count[idx]--;
        }
        return true;
    }
    public static void main(String args[]) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
}

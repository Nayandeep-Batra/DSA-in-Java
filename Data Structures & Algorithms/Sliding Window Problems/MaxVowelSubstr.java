public class MaxVowelSubstr {
    public static int maxVowels(String s, int k) {
        int maxCount = 0;
        int start = 0;
        int count = 0;
        String vowels = "aeiou";
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(vowels.indexOf(ch) != -1) {
                count++;
            }
            if((i - start + 1) == k) {
                maxCount = Math.max(maxCount, count);
                if(vowels.indexOf(s.charAt(start)) != -1) {
                    count--;
                }
                start++;
            }
        }
        return maxCount;
    }
    public static void main(String args[]) {
        String s = "abciiidef";
        System.out.println(maxVowels(s, 3));
    }
}

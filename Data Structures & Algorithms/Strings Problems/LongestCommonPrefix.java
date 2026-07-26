public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0]; // Assuming the first string as a common prefix.
        for(int i=1; i<strs.length; i++) { // outer loop to traverse the remaining strings in the array to compare them with prefix
            if(prefix.isEmpty()) { // Once prefix becomes empty, it can never become non-empty again.
                return prefix;
            }
            for(int j=0; j<Math.min(prefix.length(), strs[i].length()); j++) { // inner loop to compare the characters of prefix with strs[i] only till shorter string ends.
                char ch = strs[i].charAt(j);
                char pre = prefix.charAt(j);
                if(pre != ch) { // As soon as the character differs, we update prefix string with common prefix and break the current iteration.
                    prefix = prefix.substring(0, j);
                    break;
                }
            } 
            // if no mismatch occurs between prefix and strs[i], the smaller string among prefix and strs[i] becomes the longest common prefix. 
            prefix = prefix.substring(0,Math.min(prefix.length(), strs[i].length()));
        }
        return prefix;   
    }
    public static void main(String[] args) {
        String strs[] = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}

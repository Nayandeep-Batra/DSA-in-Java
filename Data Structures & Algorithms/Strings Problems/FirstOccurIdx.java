public class FirstOccurIdx {
    public static int strStr(String haystack, String needle) {
        int j = 0;
        for(int i=0; i<=haystack.length()-needle.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(0)) {
                for(j=0; j<needle.length(); j++) {
                    if(needle.charAt(j) != haystack.charAt(i+j)){
                        break;
                    }
                }
                if(j==needle.length()){
                        return i;
                    }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack, needle));
    }
}

public class ReverseWordStr {
    public static String reverseWords(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        int i=s.length()-1;
        while(i>=0) {
            while(i>=0 && s.charAt(i) == ' ') {
                i--;
            }
            int end = i;
            while(i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            int start = i+1;
            sb.append(s, start, end+1);
            sb.append(' ');
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
}

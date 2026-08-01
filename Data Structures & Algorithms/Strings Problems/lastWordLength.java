public class lastWordLength {
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder("");
        for(int i=s.length()-1; i>=0; i--) {
            char ch = s.charAt(i);
            if(ch == ' ') {
                break;
            }
            else {
                sb.append(ch);
            }
        }
        return sb.length();
    }
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
}

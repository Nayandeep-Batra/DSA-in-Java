public class ReverseString {
    public static void reverseString(char[] s) {
        int st = 0, end = s.length-1;
        char temp = ' ';
        while(st < end) {
            temp = s[st];
            s[st] = s[end];
            s[end] = temp;
            st++;
            end--;
        }
    }
    public static void main(String args[]) {
        char s[] = {'h','e','l','l','o'};
        reverseString(s);
        for(int i=0; i<s.length; i++) {
            System.out.print(s[i] + " ");
        }
    }
}

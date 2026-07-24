public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int st = 0, end = s.length()-1;
        while(st <= end) {
            char left = s.charAt(st); 
            char right = s.charAt(end);
            if(!Character.isLetterOrDigit(left)) {
                st++;
                
            }
            if(!Character.isLetterOrDigit(right)) {
                end--;
                
            }
            if(Character.isLetterOrDigit(left) && Character.isLetterOrDigit(right)) {
                if(left != right) {
                    return false;
                }
                st++; end--;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}

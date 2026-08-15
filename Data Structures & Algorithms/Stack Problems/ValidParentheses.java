import java.util.*;
public class ValidParentheses {
    public static boolean isMatch(char c1, char c2) {
        return ((c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}'));
    }
    public static boolean isValid(String s) {
        Stack <Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            }
            else {
                if(st.isEmpty()) {
                    return false;
                }
                else if(isMatch(st.peek() , ch)) {
                    st.pop();
                }
                else {
                    return false;
                }
            }
        }
        return (st.isEmpty());
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
}

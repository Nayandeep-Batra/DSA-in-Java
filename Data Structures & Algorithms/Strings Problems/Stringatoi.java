public class Stringatoi {
    // public int myAtoi(String s) {
    //     int result = 0;
    //     int i = 0;
    //     int sign = 1;
    //     while(i<s.length() && s.charAt(i) == ' ') {
    //         i++;
    //     }
    //     if(i == s.length()) {
    //         return 0;
    //     }
    //    if(s.charAt(i) == '-') {
    //             sign = -1;
    //             i++;
    //     }
    //     else if(s.charAt(i) == '+') {
    //         sign = 1;
    //         i++;
    //     }
    //     while(i < s.length()) {
    //         char ch = s.charAt(i);
    //         if(!Character.isDigit(ch)) {
    //             return sign*result;
    //         }
    //         if(result > Integer.MAX_VALUE / 10) {
    //             if(sign == 1) {
    //                 return Integer.MAX_VALUE;     
    //             }
    //             else {
    //                 return Integer.MIN_VALUE;
    //             }
                
    //         }
    //         if(sign == -1 && result == Integer.MAX_VALUE / 10 && ch-'0' == 8) {
    //             return Integer.MIN_VALUE;
    //         }
    //         if(result == Integer.MAX_VALUE / 10) {
    //             if(sign == 1 && ch - '0' > 7) {
    //                 return Integer.MAX_VALUE;
    //             }
    //             if(sign == -1 && ch - '0' > 8) {
    //                 return Integer.MIN_VALUE;
    //             }
    //         }
    //         result = result * 10 + (ch - '0');
    //         i++;
    //     }
    //     return sign * result;
    // }

    // SOLVING THIS QUESTION USING LONG WILL BE MUCH EASIER AND BETTER.

    public static int myAtoi(String s) {
        long result = 0;
        int i = 0;
        int sign = 1;
        while(i<s.length() && s.charAt(i) == ' ') {
            i++;
        }
        if(i == s.length()) {
            return 0;
        }
        if(s.charAt(i) == '-') {
                sign = -1;
                i++;
        }
        else if(s.charAt(i) == '+') {
            sign = 1;
            i++;
        }
        while(i < s.length()) {
            char ch = s.charAt(i);
            if(!Character.isDigit(ch)) {
                return (int)(sign*result);
            }
            result = result * 10 + (ch - '0'); // ch-'0' is converting numbers in character to digit.
            if(sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if(sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int)(sign * result);
    }

    public static void main(String[] args) {
        String s = "1337c0d3";
        System.out.println(myAtoi(s));
    }
}

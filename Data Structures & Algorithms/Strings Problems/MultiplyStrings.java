public class MultiplyStrings {
    public static String multiply(String num1, String num2) {
        int result[] = new int[num1.length() + num2.length()];
        StringBuilder sb = new  StringBuilder();
        if(num1.charAt(0) == '0' || num2.charAt(0) == '0'){
            return "0";
        }
        for(int i=num1.length()-1; i>=0; i--) {
            int d1 = num1.charAt(i)-'0';
            for(int j=num2.length()-1; j>=0; j--) {
                int d2 = num2.charAt(j)-'0';
                int product = d1 * d2;
                int sum = product + result[i+j+1];
                result[i+j+1] = sum % 10;
                result[i+j] += sum/10;
            }
        }
        int i=0;
        while( i < result.length && result[i] == 0) {
            i++;
        }
        while(i < result.length) {
            sb.append(result[i]);
            i++;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";
        System.out.println(multiply(num1, num2));
    }
}

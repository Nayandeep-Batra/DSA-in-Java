public class ZigZagConversion {
    public static String convert(String s, int numRows) {
        StringBuilder rows[] = new StringBuilder[numRows];
        if(numRows == 1) {
            return s;
        }
        for(int i=0; i<numRows; i++) { // One StringBuilder for each row.
            rows[i] = new StringBuilder();
        }
        int row = 0;
        boolean goingDown = true;
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<s.length(); i++) { 
            char ch = s.charAt(i);
            rows[row].append(ch); // Appending current character to current row.  

            // changing directions only at the top or bottom
            if(row == 0) {
                goingDown = true; 
            }
            if(row == numRows-1) {
                goingDown = false;
            }

            // Moving to the next row according to current direction.
            if(goingDown) {
                row++;
            }
            else{
                row--;
            }
        }
        for(int i=0; i<numRows; i++) { // Combining all rows to form the final answer.
            ans.append(rows[i]);
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convert(s, numRows));
    }
}

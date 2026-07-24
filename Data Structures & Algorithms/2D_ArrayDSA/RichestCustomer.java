public class RichestCustomer {
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int i=0; i<accounts.length; i++) {
            int wealth = 0;
            for(int j=0; j<accounts[0].length; j++) {
                wealth += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth , wealth);
        }
        return maxWealth;
    }
    public static void main(String[] args) {
        int accounts[][] = {{1,2,3}, {3,2,1}};
        System.out.println(maximumWealth(accounts));
    }
}

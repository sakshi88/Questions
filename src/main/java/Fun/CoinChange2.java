package Fun;

public class CoinChange2 {

    private static int checkCount(int amount, int coins[]){
        int[][] dp = new int[coins.length + 1][amount + 1];
        dp[0][0] = 1;
        for (int j = 1; j <= coins.length; j++) {
            dp[j][0] = 1;
            for (int i = 1; i <= amount; i++) {
                dp[j][i] = dp[j - 1][i]; // exclude current coin
                if (i - coins[j - 1] >= 0) { // check if amount  >= to the current i`th coin
                    dp[j][i] += dp[j][i - coins[j - 1]]; // include current coin
                }
            }
        }
        return dp[coins.length][amount];
    }

    public static void main(String[] args) {
        int amount = 5;
        int coins[] = {1,2,5};
        System.out.println("There are "  + checkCount(amount,coins) + "to make up the amount");
    }
}

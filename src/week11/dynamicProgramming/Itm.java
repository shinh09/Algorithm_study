package week11.dynamicProgramming;

public class Itm {
    public int getWays(int n, int[] c) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        for(int coin:c){
            for(int i=coin;i<=n;i++){
                dp[i] += dp[i-coin];
            }
        }
        return dp[n];
    }
}


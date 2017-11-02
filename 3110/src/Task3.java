public class Task3 {


  public  long countWays(int n, int k)
    {
        long [] dp = new long[n + 1];


              dp[1] = k;

        long same = 0, diff = k;

        for (int i = 2; i <= n; i++)
        {
            same = diff;

            diff = dp[i-1] * (k-1);

            dp[i] = (same + diff);
        }

        return dp[n];
    }

}


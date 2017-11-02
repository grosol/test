/**
 * Created by yaoun on 02.11.2017.
 */
public class FenceAndColors {
    public   long countWays(int n, int k)
    {
        long total = k;
        long same = 0;
        long diff = k;
        for (int i = 2; i <= n; i++)
        {
            same = diff;
            diff = total * (k-1);
            total = (same + diff);
        }
        return total;
    }
}

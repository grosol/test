/**
 * Created by yaoun on 02.11.2017.
 */
public class NumDecomposition {
    public int countWays(int n) {
        System.out.println(n);
        if (n == 0) return 0;
        int[] mass = new int[n + 1];
        mass[0] = 1;
        for (int i = 1; i < n; i++) {
            for (int j = i; j <= n; j++) {
                mass[j] += mass[j - i];
            }
        }
        return mass[n];
    }

}

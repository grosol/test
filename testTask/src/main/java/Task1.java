public class Task1 {
    public int countWays(int N, int[] arr) {
        int count[] = new int[N + 1];
        count[0] = 1;
        for (int i = 1; i <= N; i++)
            for (int j = 0; j < arr.length; j++)
                if (i >= arr[j])
                    count[i] += count[i - arr[j]];
        return count[N];

    }
}

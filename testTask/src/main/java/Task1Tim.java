public class Task1Tim {
    public  int countCombinations(int arr[], int N) {
        for (int i=0;i<arr.length;i++){

        }
        if (N>=0) {
            int count[] = new int[N + 1];

            count[0] = 1;

            for (int i = 1; i <= N; i++)
                for (int j = 0; j < arr.length; j++)
                    if (i >= arr[j]) {
                        count[i] += count[i - arr[j]];
                        //System.out.println(count[i] + " " + j);
                    }
            return count[N];
        }
        else
            return -1;
    }
}

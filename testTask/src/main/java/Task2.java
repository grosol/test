public class Task2 {

        public int serchMaxAmountOfCost(int[] low,int[] high,int workDays) {
            boolean vacation = true;
        int maxAmountOfCost = 0;
        for (int i = 0; i < workDays-1; i++) {
            if(vacation){
                maxAmountOfCost+=high[i];
                vacation=false;
              //  System.out.print(high[i]+" + ");
            }else{
                if((low[i]+low[i+1])>high[i+1]){
                    maxAmountOfCost+=low[i];
                  //  System.out.print(low[i]+" + ");
                }else
                {
                    vacation=true;
                }
            }

        }
        if(vacation){
            maxAmountOfCost+=high[workDays-1];
        }else{
            maxAmountOfCost+=low[workDays-1];
        }
        System.out.println();
        return maxAmountOfCost;
    }


    public static class Task1 {
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
}

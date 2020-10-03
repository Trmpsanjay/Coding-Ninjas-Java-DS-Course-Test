import java.util.Arrays; 
public class solution {

	public static int maximumProfit(int budget[]) {
		// Write your code here
        int sum=0,sumbig=0,index=0;
       // Arrays.sort(budget);
        for(int i=0;i<budget.length;i++)
        {
            sumbig=sumbig+budget[i];
            sum=0;
          for(int j=i+1;j<budget.length;j++)
          {
             sum=sum+budget[j];
          }
            if(sumbig>=sum)
            {
            index=i;
                break;
            }
        }
        return budget[index];

	}

}


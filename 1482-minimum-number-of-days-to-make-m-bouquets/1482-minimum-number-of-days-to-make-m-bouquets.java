class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        int length = bloomDay.length;

        if((long)(m) * (long)(k) > (long)(length))   
            return -1;

        int low = bloomDay[0];
        int high = bloomDay[0];

        for(int num:bloomDay)
        {
            low = Math.min(low,num);
            high = Math.max(high,num);
        }

        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(bouquetsCount(bloomDay,mid,k,length) >= m)
                high = mid - 1;
            else
                low = mid + 1;

        }

        return low;
    }

    public int bouquetsCount(int []bloomDay,int mid,int k,int length)
    {
        int count = 0;
        int result = 0;

        for(int i=0;i<length;i++)
        {
            if(bloomDay[i] <= mid)
                count++;
            else
            {
                result += count / k;
                count = 0;  
            }
        }

        result += count/k;

        return result;
    }
}
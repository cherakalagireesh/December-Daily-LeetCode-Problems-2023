class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int length  = piles.length;
        int max = findMax(piles);
        int low = 1;
        int high = max;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(isPossible(piles,mid,h))
                high = mid - 1;
            else
                low = mid + 1;
        }

        return low;
    }

    public int findMax(int[] piles)
    {
        int max = piles[0];

        for(int num:piles)
        {
            max  = Math.max(max,num);
        }

        return max;
    }

    public boolean isPossible(int[] piles,int mid,int h)
    {
        long cnt = 0;

        for(int num:piles)
        {
            cnt = cnt + num / mid + (num % mid == 0 ? 0 : 1);

            if(cnt > h)
                return false;
        }

        return true;
    }
}
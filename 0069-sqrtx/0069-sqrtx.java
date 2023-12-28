class Solution {
    public int mySqrt(int x) {
       
        long low = 1;
        long high = x;
        
        while(low <= high)
        {
            long mid = low + (high - low) / 2;
            long val = (long)(mid * mid);
            
            
             if (val == x) {
                return (int)mid;
            } else if (val < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return (int)high;
    }
}
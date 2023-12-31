class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        
        int low = 1;
        int high = nums[0];

        for(int num:nums)
        {
            high = Math.max(high, num);
        }

        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(isPossible(nums, mid, threshold))
                high = mid - 1;
            else
                low = mid + 1;
        }

        return low;
    }

    public boolean isPossible(int []nums, int mid, int threshold)
    {
        int count = 0;
        int length = nums.length;

        for(int i=0;i<length;i++)
        {
            count += Math.ceil((double)(nums[i]) / (double)(mid));
            
        }

        return count <= threshold;
    }
}
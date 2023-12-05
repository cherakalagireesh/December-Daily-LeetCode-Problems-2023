class Solution {
    public int minMoves2(int[] nums) {
        
        int length = nums.length;
        int midIndex = nums.length/2;
        int result = 0;

        for(int i=0;i<length-1;i++)
        {
            int min = i;
            
            for(int j=i+1;j<length;j++)
            {
                if(nums[j] < nums[min])
                {
                    min = j;
                }
            }

            if(min != i)
            {
                int temp = nums[min];
                nums[min] = nums[i];
                nums[i] = temp;
            }
            
        }

        for(int i=0;i<length;i++)
        {
            result += Math.abs(nums[midIndex]-nums[i]);
        }

        return result;
    }
}
class Solution {
    public int majorityElement(int[] nums) {
        
        int count = 1;
        int element = nums[0];
        int length = nums.length;
        
        for(int i=1;i<length;i++)
        {
            if(count == 0)
            {
                element = nums[i];
                count = 1;
            }
            else if(element == nums[i])
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        
        return element;
    }
}
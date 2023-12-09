class Solution {
    public boolean check(int[] nums) {
      
        int length = nums.length;
        int temp[] = new int[length];
        int startIndex = -1;
        
        for(int i=0;i<length;i++)
            temp[i] = nums[i];
        
        Arrays.sort(temp);
        
        for(int i=0;i<length-1;i++)
        {
            if(nums[i] > nums[i+1])
            {
                startIndex = i+1;
                break;
            }
        }
        
        if(startIndex == -1)
            return true;
        else
        {
            for(int i=0;i<length;i++)
            {
                if(temp[i] != nums[(i+startIndex) % length])
                {
                    return false;
                }
            }
        }
            
        return true;
    }
}
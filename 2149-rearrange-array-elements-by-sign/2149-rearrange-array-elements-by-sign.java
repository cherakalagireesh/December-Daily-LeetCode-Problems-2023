class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int length = nums.length;
        int result[] = new int[length];
        int posInd = 0;
        int negInd = 1;

        for(int i=0;i<length;i++)
        {
            if(nums[i] >= 0)
            {
                result[posInd] = nums[i];
                posInd+=2;
            }
            else
            {
                result[negInd] = nums[i];
                negInd+=2;
            }
        }

        return result;
    }
}
class Solution {
    public void nextPermutation(int[] nums) {
        
        int index = -1;
        int length = nums.length;

        for(int i=length-2;i>=0;i--)
        {
            if(nums[i] < nums[i+1])
            {
                index = i;
                break;
            }
        }

        if(index == -1)
        {
            int left = 0;
            int right = length-1;

            while(left < right)
            {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                
                left++;
                right--;
            }
        }
        else
        {
            for(int i=length-1;i>=0;i--)
            {
                if(nums[i] > nums[index])
                {
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                    break;
                }
            }

            Arrays.sort(nums,index+1,length);
        }


    }
}
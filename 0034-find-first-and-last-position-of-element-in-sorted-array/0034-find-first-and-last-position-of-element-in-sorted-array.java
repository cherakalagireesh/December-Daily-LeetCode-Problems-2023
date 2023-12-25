class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        return new int[]{startPos(nums,target),endPos(nums,target)};
    }

    public int startPos(int nums[],int target)
    {   
        int left = 0;
        int right = nums.length-1;
        int index = -1;

        while(left <= right)
        {
            int mid = (left+right)/2;

            if(nums[mid]== target)
            {
                index = mid;
                right = mid-1;
            }
            else if(nums[mid] < target)
                left = mid+1;
            else
                right = mid-1;
        }

        return index;
    }

    public int endPos(int nums[],int target)
    {
        int left = 0;
        int right = nums.length-1;
        int index = -1;

        while(left <= right)
        {
            int mid = (left+right)/2;

            if(nums[mid]== target)
            {
                index = mid;
                left = mid+1;
            }
            else if(nums[mid] < target)
                left = mid+1;
            else
                right = mid-1;
        }

        return index;
        
    }
}
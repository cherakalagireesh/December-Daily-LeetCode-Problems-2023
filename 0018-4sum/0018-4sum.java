class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
      
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int length = nums.length;
        
        for(int i=0;i<length;i++)
        {
            if(i>0 && nums[i] == nums[i-1]) continue;
            
            for(int j=i+1;j<length;j++)
            {
                if(j > i+1 && nums[j]==nums[j-1]) continue;
                
                int left = j+1;
                int right = length-1;
                
                while(left < right)
                {
                    long sum = nums[i];
                    sum+= nums[j];
                    sum+= nums[left] + nums[right];
                    
                    if(sum == target)
                    {
                        result.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[left],nums[right])));
                        left++;
                        right--;
                        
                        while(left < length && nums[left]==nums[left-1]) 
                            left++;
                        
                        while(right > 0 && nums[right]==nums[right+1]) 
                            right--;
                    }
                    else if(sum > target)
                    {
                        right--;
                    }
                    else 
                        left++;
                }
            }
        }
        
        return result;
    }
}
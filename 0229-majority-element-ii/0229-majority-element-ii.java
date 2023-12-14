class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int element1=Integer.MAX_VALUE,element2 = Integer.MIN_VALUE;
        int count1 = 0,count2 = 0;
        int length = nums.length;
        List<Integer> result = new ArrayList<>();
        
        if(length<3)
        {
            for(int num:nums)
            {
                if(result.size()==0 || result.get(result.size()-1) != num)
                    result.add(num);
            }
            
            return result;
        }
        
        for(int i=0;i<length;i++)
        {
            if(count1 == 0 && nums[i]!=element2)
            {   
                count1 = 1;
                element1 = nums[i]; 
            }
            else if(count2 == 0 && nums[i]!=element1)
            {
                count2 = 1;
                element2 = nums[i];
            }
            else if(nums[i] == element1)
            {
                count1++;
            }
            else if(nums[i] == element2)
            {
                count2++;
            }
            else 
            {
                count1--;
                count2--;
            }
        }
        
        if(helper(element1,nums))
            result.add(element1);
        if(helper(element2,nums))
            result.add(element2);
        
        return result;
        
    }
    
    public boolean helper(int num,int arr[])
    {
        int count = 0;
        
        for(int a:arr)
        {
            if(a==num)
            {
                count++;
            }
            
            if(count==arr.length/3+1)
                return true;
        }
        
        return false;
    }
    
}
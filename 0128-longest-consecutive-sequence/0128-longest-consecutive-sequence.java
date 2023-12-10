class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        int result = Integer.MIN_VALUE;
        int count = 0;
        
        if(nums.length == 0) return 0;
        if(nums.length ==1) return 1;
        
        for(int num:nums)
            set.add(num);

        for(int num:set)
        {
            
            if(!set.contains(num-1))
            {
                while(set.contains(num++))
                    count++;
            }

            result = Math.max(result,count);
            count = 0;
        }

        return result==Integer.MIN_VALUE?1:result;
    }
}
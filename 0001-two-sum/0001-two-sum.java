class Solution {
    public int[] twoSum(int[] nums, int target) {
       
        int length = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<length;i++)
        {
            int secondVal = target-nums[i];
            
            if(map.containsKey(secondVal))
            {
                return new int[]{map.get(secondVal),i};
            }
            
            map.put(nums[i],i);
        }
        
        return new int[]{-1,-1};
    }
}
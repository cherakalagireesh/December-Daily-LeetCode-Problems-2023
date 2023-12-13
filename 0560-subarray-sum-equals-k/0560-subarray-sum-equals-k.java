class Solution {
    public int subarraySum(int[] nums, int k) {
      
        int prefixSum = 0;
        int length = nums.length;
        int result = 0;
        Map<Integer,Integer> map = new HashMap<>();
        
        map.put(0,1);
        
        for(int i=0;i<length;i++)
        {
            prefixSum+=nums[i];
            int num = prefixSum-k;
            
            if(map.containsKey(num))
            {
                result+=map.get(num);
            }
            
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
            
        }
        
        return result;
    
    }
}
class Solution {
    public int[] singleNumber(int[] nums) {
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        int result[] = new int[2];
        int index = 0;

        for(int num:nums)
            hm.put(num,hm.getOrDefault(num,0) + 1);
        
        for(int num:hm.keySet())
        {
            if(hm.get(num) == 1)
                result[index++] = num;
        }

        return result;
    }
}
class Solution {
    public int characterReplacement(String s, int k) {

        int left = 0;
        int max = 0;
        int result = 0;
        int[] freq = new int[26];
        int length = s.length();

        for(int right=0;right<length;right++)
        {
            freq[s.charAt(right)-'A']++;
            max = Math.max(max,freq[s.charAt(right)-'A']);

            if(right-left+1-max > k)
            {
                freq[s.charAt(left)-'A']--;
                left++;
            }

            result = Math.max(result,right-left+1);
        }

        return result;
    }
}
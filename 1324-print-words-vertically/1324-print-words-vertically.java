class Solution {
    public List<String> printVertically(String s) {
        
        List<String> result = new ArrayList<>();
        String[] words = s.split(" ");
        int maxLength = Integer.MIN_VALUE;

        for(String word:words)
        {
            maxLength = Math.max(maxLength,word.length());
        }

        for(int index = 0;index<maxLength;index++)
        {
            StringBuilder sb = new StringBuilder();

            for(String word:words)
            {
                if(index < word.length())
                    sb.append(word.charAt(index));
                else
                    sb.append(" ");
            }

            int right = sb.length()-1;
            while(sb.charAt(right) == ' ')
            {
                sb.deleteCharAt(right--);
            }

            result.add(sb.toString());
        }

        return result;
    }
}
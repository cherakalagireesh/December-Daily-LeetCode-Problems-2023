class Solution {
    public int minimumSum(int num) {
        
        String s = num+"";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        
        int new1 = (ch[0]-'0')*10 + (ch[2]-'0');
        int new2 = (ch[1]-'0')*10 + (ch[3]-'0');
        
        return new1+new2;

    }
}
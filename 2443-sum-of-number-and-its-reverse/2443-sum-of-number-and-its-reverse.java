class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        
        int firstNum = 1;
        int secondNum = num-1;

        if(num == 0) return true;

        while(firstNum <= secondNum)
        {

            if(rightTrimZero(firstNum+"").equals(leftTrimZero(secondNum+"")))
            {
                return true;
            }

            firstNum++;
            secondNum--;
        }

        return false;
    }

    public String rightTrimZero(String num)
    {
        int index = 0;

        while(num.charAt(index++)=='0');

        return new StringBuilder(num.substring(index-1,num.length())).reverse().toString();
    }

    public String leftTrimZero(String num)
    {
        int index = num.length()-1;

        while(num.charAt(index--)=='0');

        return num.substring(0,index+2);
    }

}
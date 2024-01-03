/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
         
         long low = 1;
         long high = n;

         while(low <= high)
         {
             long mid = (low + high) / 2;
             int ans = guess((int)(mid));

             if(ans == 0)
                return (int)(mid);
             else if(ans == -1)
                high = mid - 1;
             else
                low = mid + 1;
         }

         return -1;
    }
}
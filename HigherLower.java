/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class HigherLower extends GuessGame {
    public int guessNumber(int n) {
        int start = 1, end = n;
        int mid =0;
        while(start<=end){
            mid = start + (end-start)/2;
            int num = guess(mid);
            if(num==0){
                return mid;
        }   else if(num==-1){
                end = mid-1;
            }else{
                start = mid+1;
            }
    }return mid;
} 
}
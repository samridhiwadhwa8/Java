 * @return       -1 if num is higher than the picked number
 *                1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l=0;
        int right=n;
        while(l<=right){
            int mid=l+(right-l)/2;
            int gu=guess(mid);
            if(gu==0){
                return mid;
            }
            else if(gu==-1){
                right=mid-1;
            }else{
                l=mid+1;
            }
        }
        return -1;
    }
}

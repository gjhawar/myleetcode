package adddigits;

/**
 * Created by gjhawar on 10/3/15.
 */
public class Solution {

    /*
    Idea is for each number like 381, The divisor should be 10^(1 less than the length) so 10^2 i.e. 100 in this case.
    When we divide 381 by 100 we get 3 as the dividend and 81 as the remainder which will be the new number. We keep on doing this
    till we have nothing left in the number i.e. we have nothing to divide. Then we check if the length of the sum of the digits
    is >1 in that case we recursively call the addDigits function until we have a single digit number left.
     */
    public int addDigits(int num) {
        return (num<10)?num:((num-1)%9)+1;
    }

    public static void main(String args[]){
        Solution s = new Solution();
        int num = 381;
        System.out.println(s.addDigits(num));
    }
}

package ispalindrome;

/**
 * Created by gjhawar on 10/5/15.
 */
public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int div = 1;
        while(x/div >=10){
            div*=10;
        }

        while(x!=0){
            int l = x/div;
            int r = x%10;
            if(l!=r)
                return false;
            x = (x%div)/10;
            div/=100;
        }

        return true;
    }

    public static void main(String args[]){
        Solution s = new Solution();
        System.out.println(s.isPalindrome(121));
    }
}

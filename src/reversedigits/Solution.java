package reversedigits;

/**
 * Created by gjhawar on 10/4/15.
 */
public class Solution {
        public int reverse(int x) {
            int res = 0;
            while (x != 0) {
                if (res*10/10 != res) return 0;  // if res*10 overflows, return 0
                res = 10*res + x%10;
                x /= 10;
            }
            return res;
        }

    public static void main(String args[]){
        Solution s = new Solution();
        int num = s.reverse(-1463847419);
        System.out.println(num);
    }
}

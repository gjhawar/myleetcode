package atoi;

/**
 * Created by gjhawar on 10/5/15.
 */
public class Solution {
    public int myAtoi(String str) {
        return Integer.parseInt(str);
    }
    public static void main(String args[]){
       Solution s = new Solution();
        System.out.println(s.myAtoi("g"));
    }
}

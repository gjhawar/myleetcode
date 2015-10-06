package zigzagpattern;

/**
 * Created by gjhawar on 10/5/15.
 */
public class Solution {
    public String convert(String s, int numRows) {
        if(numRows<=1 || s.length()<=1 || numRows>=s.length()){
            return s;
        }
        StringBuilder[] final_string = new StringBuilder[numRows];
        for(int i=0;i<final_string.length;i++){
            final_string[i] = new StringBuilder();
        }
        int i =0;
        int length = s.length();
        while(i<length){
            for(int j=0;j<numRows && i<length;j++){
                final_string[j].append(s.charAt(i++));
            }

            for(int j = numRows-2; j>=1 && i<length; j--){
                final_string[j].append(s.charAt(i++));

            }
        }

        for(int j=1;j<final_string.length;j++){
            final_string[0].append(final_string[j]);
        }

        return final_string[0].toString();



    }


    public static void main(String args[]){
        Solution s = new Solution();
        System.out.println(s.convert("abcd", 3));

    }

}


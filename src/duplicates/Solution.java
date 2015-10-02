package duplicates;

import java.util.*;

/**
 * Created by gjhawar on 10/2/15.
 */
public class Solution {

    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        for(Integer i : nums){
            if(countMap.get(i) == null)
            {
                countMap.put(i,1);
            }
            else{
                countMap.put(i, countMap.get(i) + 1);
            }
        }

        Set<Integer> keyset = countMap.keySet();
        Iterator<Integer> itr = keyset.iterator();
        boolean hasDuplicate = false;
        while(itr.hasNext()){
            Integer key = itr.next();
            if(countMap.get(key)>1){
                hasDuplicate = true;
                break;
            }
        }
        return hasDuplicate == true;
    }
}

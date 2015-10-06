package constanttimeDS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by gjhawar on 10/5/15.
 */
public class ConstantDS {
    public ArrayList<Integer> arr;
    public HashMap<Integer, Integer> map;

    public ConstantDS(){
       arr = new ArrayList<Integer>();
        map = new HashMap<Integer, Integer>();
    }

    public void add(Integer n){
        if(map.get(n)!=null && map.size()!=0){
            System.out.println(map.containsKey(n));
            return;
        }
        int size = arr.size();
        arr.add(n);
        map.put(n, size);
    }

    public void remove(Integer n) {
        if (!map.containsKey(n)) {
            return;
        }
        int removal_index = map.get(n);
        int size = arr.size();
        map.remove(n);
        map.put(arr.get(size-1), removal_index);
        arr.set(removal_index, arr.get(size - 1));
        arr.remove(size - 1);

    }

    public Integer search(Integer n){
        return map.get(n);
    }

    public Integer random_ele() {
        Random rand = new Random();  // Choose a different seed
        int index = rand.nextInt(arr.size());
        return arr.get(index);
    }

    public static void main(String args[]){
            ConstantDS ds = new ConstantDS();
            ds.add(10);
            ds.add(20);
            ds.add(30);
            ds.add(40);
            System.out.println(ds.search(30));
            ds.remove(20);
            ds.add(50);
            System.out.println(ds.search(50));
            System.out.println(ds.random_ele());

    }
}

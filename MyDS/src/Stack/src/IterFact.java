package Stack.src;

/**
 * Created by gjhawar on 10/30/15.
 */
public class IterFact {


    public static long fact(int n){
        assert n>0 && n<=20:"Out of range";
        AStack<Integer> stack = new AStack<Integer>(n);
        while(n>1){
            stack.push(n--);
        }
        long result = 1;
        while(stack.length()>0){
            result = result * (Integer)stack.pop();
        }
        return result;
    }

    public static long recursive_fact(int n){
        if(n==0 || n==1)
            return 1;
        return recursive_fact(n-1) * n;

    }

    public static void main(String args[]){
        long st = System.nanoTime();
        System.out.println(fact(20));
        long et = System.nanoTime();
        System.out.println(et-st);
        long st_r = System.nanoTime();
        System.out.println(recursive_fact(20));
        long et_r = System.nanoTime();
        System.out.println(et_r-st_r);

    }
}

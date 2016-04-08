package Dict.src;

/**
 * Created by gjhawar on 3/8/16.
 */
public class KVpair<Key, E> {
    private Key k;
    private E e;

    public KVpair(){
        k = null;
        e = null;
    }

    public KVpair(Key kval, E eval){
        k = kval;
        e = eval;
    }

    public Key key(){
        return k;
    }
    public E e(){
        return e;
    }
}

package Dict.src;

/**
 * Created by gjhawar on 3/8/16.
 */
public interface Dict<Key, E> {

    public void insert(Key k, E e);

    public E remove(Key k);

    public E removeAny();

    public void clear();

    public E find(Key k);

    public int size();

}

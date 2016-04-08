package Dict.src;

import Dict.src.Dict;
import SList.src.LList;

public class LDict<Key, E> implements Dict<Key, E>{

    public int n;
    LList<Key> keyList;
    LList<E> valList;


    @Override
    public void insert(Key k, E e) {
        keyList.append(k);
        valList.append(e);
    }

    @Override
    public E remove(Key k) {
        return null;
    }

    @Override
    public E removeAny() {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public E find(Key k) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}

package DList.src;

/**
 * Created by gjhawar on 10/28/15.
 */

public class DList<E> implements List {
    private DLink<E> curr, head, tail;
    private int cnt;

    public DList(){
        curr = head = tail = new DLink<E>(null, null);
        cnt = 0;
    }


    @Override
    public void clear() {
        head.setNext(null);
        curr = head = tail = new DLink<E>(null, null);
        cnt = 0;
    }

    @Override
    public void insert(Object item) {
        curr.setNext(new DLink<E>((E)item, curr, curr.next()));
        curr.next().next().setPrev(curr.next());
        cnt++;
    }

    @Override
    public Object remove() {
        if(curr.next()==tail) return null;
        E item = curr.next().element();
        curr.setNext(curr.next().next());
        curr.next().next().setPrev(curr);
        //No need to make curr.next() null since nothng is pointing to it and it`ll be garbage collected
        cnt--;
        return item;
    }

    @Override
    public void append(Object item) {
        tail.setPrev(new DLink<E>((E)item, tail.prev(), tail));
        tail.prev().prev().setNext(tail.prev());
        cnt++;
    }

    @Override
    public void prev() {
        if(curr!=head) curr = curr.prev();
    }

    @Override
    public void next() {

    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public void moveToPos(int pos) {

    }

    @Override
    public int currPosn() {
        return 0;
    }

    @Override
    public void moveToStart() {

    }

    @Override
    public void moveToEnd() {

    }

    @Override
    public Object getValue() {
        return null;
    }
}

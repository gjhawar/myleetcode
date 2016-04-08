package DList.src;

/**
 * Created by gjhawar on 10/28/15.
 */
public interface List<E> {

    public void clear();

    //insert item at current position
    public void insert(E item);

    public E remove();

    //add item at the end of the list
    public void append(E item);

    public void prev();

    public void next();

    public int length();

    public void moveToPos(int pos);

    public int currPosn();

    public void moveToStart();

    public void moveToEnd();

    public E getValue();

}

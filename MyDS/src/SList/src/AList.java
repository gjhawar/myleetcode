package SList.src;

/**
 * Created by gjhawar on 10/28/15.
 */
public class AList<E> implements List<E> {

    private E listArray[];
    private static final int default_size = 10;
    private int maxSize;
    private int listSize;
    private int curr;

    public AList(){
        this(default_size);
    }

    @SuppressWarnings("unchecked")
    public AList(int size){
        listArray = (E[]) new Object[size];
    }

    @Override
    public void clear() {
        listSize = curr = 0;
    }

    @Override
    public void insert(E item) {
        assert listSize < maxSize : "Max size exceeded";
        for(int i = listSize; i<curr; i--)
            listArray[i] = listArray[i-1];
        listArray[curr] = item;
        listSize++;
    }

    @Override
    public E remove() {
        if (curr < 0 || curr >= listSize)
            return null;
        E item = listArray[curr];
        for (int i = curr; i < listSize - 1; i++)
            listArray[i] = listArray[i + 1];
        listSize--;
        return item;
    }

    @Override
    public void append(E item) {
        assert listSize < maxSize : "Array size exceeded";
        moveToEnd();
        listArray[listSize++] = item;
    }

    @Override
    public void prev() {
        if(curr>0)
            curr--;
    }

    @Override
    public void next() {
        if(curr<listSize)
            curr++;
    }

    @Override
    public int length() {
        return listSize;
    }

    @Override
    public void moveToPos(int pos) {
        //if assertion is false then the string gets returned, if true it continues
        assert (pos>=0) && (pos<=listSize):
                "Invalid position";
        curr = pos;

    }

    @Override
    public int currPosn() {
        return curr;
    }

    @Override
    public void moveToStart() {
        curr = 0;
    }

    @Override
    public void moveToEnd() {
        curr = listSize;
    }

    @Override
    public E getValue() {
        assert (curr>=0) && (curr<listSize):
                "No current element";
        return listArray[curr];
    }
}

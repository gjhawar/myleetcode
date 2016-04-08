package Queue.src;

/**
 * Created by gjhawar on 10/30/15.
 */
public class AQueue<E> implements Queue<E> {
    private int rear ;
    private int front ;
    private E[] listArray;
    private int maxSize;
    private static int defaultSize = 10;

    public AQueue(){
        this(defaultSize);
    }

    public AQueue(int size){
        maxSize = size + 1;
        rear = 0;
        front = 1;
        listArray = (E[])new Object[maxSize];
    }


    @Override
    public void clear() {
        rear = 0;
        front = 1;
    }

    @Override
    public void enqueue(E it) {

    }

    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public E frontValue() {
        return null;
    }

    @Override
    public int length() {
        return 0;
    }
}

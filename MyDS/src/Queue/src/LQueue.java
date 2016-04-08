package Queue.src;

import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by gjhawar on 3/2/16.
    Assuming front and rear points to header node initially.
    Front always points to the head node, Only rear moves for enqueue,
    And for dequeue the node that front points to changes but front itself doesnt move.
 */
public class LQueue<E> implements Queue<E>, Iterable<E> {

    private Link<E> front;
    private Link<E> rear;
    public Link<E> curr;
    private int size;

    public LQueue(){
        curr = front = rear = new Link<E>(null);
        size = 0;
    }

    @Override
    public void clear() {
        curr = front = rear = new Link<E>(null);
        size = 0;
    }

    @Override
    public void enqueue(E it) {
        rear.setNext(new Link<E>(it, null));
        rear = rear.next();
        size++;
    }

    @Override
    public E dequeue() {
        assert size!=0 : "No elements to remove from the queue";
        E it = front.next().element();
        front.setNext(front.next().next());
        if(front.next() == null){
            rear = front;
        }
        size--;
        return it;
    }

    @Override
    public E frontValue() {
        assert size!=0 : "Queue is empty";
        return front.next().element();
    }

    @Override
    public int length() {
        return size;
    }

    public void reset(){
        curr = front;
    }

    @Override
    public Iterator<E> iterator() {
        return new ListIterator<E>() {
            @Override
            public boolean hasNext() {
                return curr.next()!=null;
            }

            @Override
            public E next() {
                E val = curr.next().element();
                curr = curr.next();
                return val;
            }

            @Override
            public boolean hasPrevious() {
                return false;
            }

            @Override
            public E previous() {
                return null;
            }

            @Override
            public int nextIndex() {
                return 0;
            }

            @Override
            public int previousIndex() {
                return 0;
            }

            @Override
            public void remove() {

            }

            @Override
            public void set(E e) {

            }

            @Override
            public void add(E e) {

            }
        };
    }

    public static void main(String args[]){
        LQueue<Integer> q = new LQueue<Integer>();
        q.enqueue(1);
        q.enqueue(2);
        Iterator<Integer>itr = q.iterator();

        // Need to implement iterable to get an iterator for a forEach loop to work.
        for(Integer ele:q){
            System.out.println(ele);
        }
        q.reset();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}


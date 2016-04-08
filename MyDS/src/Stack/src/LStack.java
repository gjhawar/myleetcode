package Stack.src;

/**
 * Created by gjhawar on 10/30/15.
 */
public class LStack<E> implements Stack<E> {

    private Link<E> top;
    private int size;

    public LStack(E it, Link<E> top){
        size = 0;
        this.top = null;
    }

    public LStack(int size){
        this.size = size;
        top = null;
    }

    @Override
    public void clear() {
        size = 0;
        top = null;
    }

    @Override
    public void push(E it) {
        top = new Link<E>(it, top);
        size++;
    }

    @Override
    public E pop() {
        assert top!=null:"Empty stack";
        E item = top.element();
        top = top.next();
        size--;
        return item;
    }

    @Override
    public E topValue() {
        assert top!=null:"Empty stack";
        return top.element();
    }

    @Override
    public int length() {
        return size;
    }

    public String toString(){
        StringBuffer sb = new StringBuffer((length()+1)*4);
        sb.append("<");
        while(top!=null){
            sb.append(top.element());
            top = top.next();
            sb.append(" ");
        }
        sb.append(">");
        return sb.toString();
    }
}

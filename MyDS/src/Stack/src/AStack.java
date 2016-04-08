package Stack.src;

/**
 * Created by gjhawar on 10/28/15.
 */
public class AStack<E> implements Stack {
    //we asssume top to be first free posn in the array
    private int top;
    private E listArray[];
    private static final int defaultSize = 10;
    private int maxSize;


    public AStack(){
        this(defaultSize);
    }

    public AStack(int size){
        //0 as empty array`s first free posn is 0
        maxSize = size;
        top = 0;
        listArray = (E[]) new Object[size];
    }


    @Override
    public void clear() {
        top = 0;
    }

    @Override
    public void push(Object item) {
        assert top!=maxSize: "MaxSize exceeded";
        listArray[top++] = (E)item;
    }

    @Override
    public Object pop() {
        //we don`t need delete as we are assuming top is the posn of first free element
        assert top != 0: "No elements left to pop";
        return listArray[--top];
    }

    @Override
    public Object topValue() {

        assert top != 0: "No elements in the array";
        return listArray[top-1];
    }

    @Override
    public int length() {
        //we dont do top-1 as array is 0 indexed
        return top;
    }

    public String toString(){
        StringBuffer sb = new StringBuffer((length()+1)*4);
        sb.append("< ");
        for(int i=top-1; i>=0; i--){
            sb.append(listArray[i]);
            sb.append(" ");
        }
        sb.append(">");
        return sb.toString();
    }


}

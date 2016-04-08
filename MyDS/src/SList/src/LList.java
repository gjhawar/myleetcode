package SList.src;

/**
 * Created by gjhawar on 10/28/15.
 */
public class LList<E> implements List {
    //Here curr points to one Link before the actual curr
    private Link<E> curr, head, tail;
    private int cnt;

    //Constructor
    public  LList(){
        //We use empty header
        curr = head = tail = new Link<E>(null);
        cnt = 0;
    }

    @Override
    public void clear() {
        head.setNext(null);
        //EMpty header link
        curr = head = tail = new Link<E>(null);
        cnt = 0;
    }

    @Override
    public void insert(Object item) {
        curr.setNext(new Link<E>((E)item, curr.next()));
        if(tail == curr) tail = curr;
        cnt++;
    }

    @Override
    public Object remove() {
        //no element to remove
        if(curr.next() == null) return null;
        //remove last element
        if(curr.next() == tail) tail = curr;
        E item = curr.next().element();
        curr.setNext(curr.next().next());
        cnt--;
        return item;

    }

    @Override
    public void append(Object item) {
        tail = tail.setNext(new Link<E>((E)item, null));
        cnt++;
    }

    @Override
    public void prev() {
        if(curr==head) return;
        Link<E> temp = head;
        while(temp.next()!=curr) temp=temp.next();
        curr = temp;

    }

    @Override
    public void next() {
        if(curr!=tail)
        curr = curr.next();
    }

    @Override
    public int length() {
        return cnt;
    }

    @Override
    public void moveToPos(int pos) {
        assert pos<=cnt && pos>=0 : "Position out of range";
        curr = head;
        for(int i=0; i<pos; i++){
            curr = curr.next();
        }
    }


    //We don`t return temp_cnt+1 even though curr points to prev element of actual curr bcoz arrays are 0 indexed.
    @Override
    public int currPosn() {
        Link<E> temp = head;
        int temp_cnt = 0;
        while(temp!=curr){
            temp_cnt++;
            temp = temp.next();
        }
        return temp_cnt;
    }


    //Point curr pointer to head
    @Override
    public void moveToStart() {
       curr = head;
    }

    //Move curr pointer to tail
    @Override
    public void moveToEnd() {
        curr = tail;
    }


    @Override
    public Object getValue() {
        if(curr.next() == null) return null;
        return curr.next().element();
    }

    //To find a particular element in List(Implementation doesn`t matter in this case
    public Boolean find(List<Integer> L, int k){
        for(L.currPosn(); L.currPosn()<L.length(); L.next()){
            if(L.getValue() == k){
                return true;
            }
        }
        return false;
    }

}

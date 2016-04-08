package Queue.src;

import java.util.Iterator;

/**
 * Created by gjhawar on 10/27/15.
 */

//Basic Link classvthrcccivfegciuljbhlkgfkijvrlkbunujtkcucilch

public class Link<E> implements Iterator<Link<E>> {
    private E element;
    private Link<E> next;
    public Link(E data, Link<E> nextvalue){
        this.element = data;
        this.next = nextvalue;
    }

    Link(Link<E> nextvalue){
        next = nextvalue;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Link<E> next() {
        return next;
    }

    //setter
    Link<E> setNext(Link<E> nextvalue){
        return next = nextvalue;
    }

    E element(){
        return element;
    }

    E setElement(E data){
        return element = data;
    }

    public Link<E> get(E item, Link<E> nextValue){
        Link<E>temp = new Link<E>(item, nextValue);
        temp.setNext(nextValue);
        temp.setElement(item);
        return temp;
    }

}

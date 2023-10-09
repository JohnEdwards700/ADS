import java.util.Iterator;
import java.util.NoSuchElementException;

public class FixedArrayList<E> implements List<E> {
    E[] arry;
    int len = 0;
   

    @SuppressWarnings("unchecked")
    public FixedArrayList() {
        arry = (E[]) new Object[10];
    }

    public void add(E e) {

        // Check if there's room
        if ( len >= arry.length ) {
            throw new IllegalStateException("out of room in FixedArrayList");
        }

        arry[len] = e;
        len = len + 1;
        return;
    }

    public void remove(int i) {
        if ( i < 0 || i >= len ) {
            throw new IndexOutOfBoundsException();
        }

        for (int j = i ; j < len - 1 ; j++ ) {
            arry[j] = arry[j+1];
        }

        len = len - 1;
        return;
    }

    public E get(int i) {
        if ( i < 0 || i >= len ) {
            throw new IndexOutOfBoundsException();
        }
        return arry[i];
    }

    public int length() {
        return len;
    }

    public Iterator<E> iterator() {
        return new FALIterator();
    }
    
    class FALIterator implements Iterator<E> {
        int loc = 0;
    
        public E next() {
            if ( loc >= len ) {
                throw new NoSuchElementException();
            }
            return arry[loc++];
        }

        public boolean hasNext() {
            return loc < len;
        }
    }
}

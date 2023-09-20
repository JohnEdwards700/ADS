public class ADSArrayList<E> implements List<E> {
    E[] arry;
    int len = 0;

    @SuppressWarnings("unchecked")
    public ADSArrayList() {
        arry = (E[]) new Object[10];
    }

    public void add(E e) {
        // Check if there's room
        if ( len >= arry.length ) {
           E[] newarry = (E[]) new Object[arry.length+1000];
           for ( int i = 0 ; i < arry.length ; i++ ) {
               newarry[i] = arry[i];
           }

           arry = newarry;
        }

        arry[len] = e;
        len = len + 1;
        return;
    }

    public void remove(int i) {
        if ( i < 0 || i >= len ) {
            throw new IndexOutOfBoundsException();
        }

        for (int j = i ; j < len ; j++ ) {
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
    
}
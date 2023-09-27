import java.util.ArrayList;

public class ArrayListSet<E> implements Set<E> {
    ArrayList<E> list = new ArrayList<>();
    int len = 0;

    public void add(E e) {
        if ( ! this.contains(e) ) {
            list.add(e);
            len = len + 1;
        }
        return;
    }

    public void remove(E e) {
        if ( list.remove(e) ) {
            len = len - 1;
        }
        return;
    }

    public boolean contains(E e) {
        for ( E o : list) {
            if ( o.equals(e) ) {
                return true;
            }
        }
        return false;
    }

    public int length() {
        return 0;
    }

}

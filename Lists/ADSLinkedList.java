public class ADSLinkedList<E> implements List<E> {
    private class Node {
        E value;
        Node next;
    }

    Node head = null;
    int len = 0;

    public void add(E e) {
        Node n = new Node();
        n.value = e;
        n.next = head;
        head = n;

        len = len + 1;

        return;
    }

    public void remove(int i) {
        return;
    }

    public E get(int i) {

        if ( i < 0 ) {
            throw new IndexOutOfBoundsException();
        }

        Node cur = head;
        for (int j = 0 ; j < i && cur != null ; j++ ) {
            cur = cur.next;
        }

        if ( cur == null ) {
            throw new IndexOutOfBoundsException();
        }

        return cur.value;
        
    }

    public int length() {
        return len;
    }
}
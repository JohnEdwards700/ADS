public class StringHashSet implements Set<String> {

    class Node {
        String s;
        Node next;
    }

    Node[] arry = new Node[20000];
    int len = 0;

    public StringHashSet() {
        for ( int i = 0 ; i < 20000 ; i++ ) {
            arry[i].next = null;
        }
    }

    public int stringHash(String s) {
        int hashValue = 0;

        for ( char c : s.toCharArray() ) {
            hashValue = (hashValue * 37 + (int) c) % 20000;
        }

        return hashValue;
    }

    public void add(String e) {
        int hv = stringHash(e);

        Node n = new Node();
        n.s = e;
        n.next = arry[hv].next;
        arry[hv].next = n;

        len = len + 1;
    }

    public boolean contains(String e) {
        int hv = stringHash(e);

        Node cur = arry[hv].next;
        while ( cur != null ) {
            if ( e.equals(cur.s) ) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    
    public void remove(String e) {

    }

    public int length() {
        return len;
    }
}

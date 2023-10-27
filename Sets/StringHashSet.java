public class StringHashSet implements Set<String> {

    class Node {
        String s;
        Node next;
    }

    Node[] arry = new Node[20000];
    int len = 0;

    public StringHashSet() {
        for ( int i = 0 ; i < 20000 ; i++ ) {
            arry[i] = null;
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
        n.next = arry[hv];
        arry[hv] = n;

        len = len + 1;
    }

    public boolean contains(String e) {
        int hv = stringHash(e);

        Node cur = arry[hv];
        while ( cur != null ) {
            if ( e.equals(cur.s) ) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    
    public void remove(String e) {
        int hv = stringHash(e);

        if ( arry[hv] != null && arry[hv].s.equals(e) ) {
            arry[hv] = arry[hv].next;
            len = len - 1;
            return;
        }

        Node prev = arry[hv];
        Node cur = arry[hv].next;
        while ( cur != null ) {
            if ( cur.s.equals(e) ) {
                prev.next = cur.next;
                len = len - 1;
                return;
            }
            prev = cur;
            cur = cur.next;  
        }
    }

    public int length() {
        return len;
    }
}

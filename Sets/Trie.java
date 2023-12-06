import java.util.Iterator;

public class Trie implements Set<String>, Iterable<String> {

    private class Tnode {
        String l;
        Tnode lmchild;
        Tnode rsibling;
        boolean wordEnd;
    }

    Tnode root = null;

    public void add(String e) {
        return;
    }

    public boolean contains(String e) {
        if ( e.length() == 0 ) {
            return false;
        }

        return contains(e, root);
    }

    private boolean contains(String e, Tnode t) {
        String fl = e.substring(0,1);
        
        Tnode cur = t;

        while ( cur != null && ! cur.l.equals(fl) ) {
            cur = cur.rsibling;
        }

        if ( cur == null ) {
            return false;
        }

        if ( e.length() == 1 ) {
            return cur.wordEnd;
        }

        String rs = e.substring(1);
        return contains(rs, cur.lmchild);
    }

    void remove(String e) {
        return;
    }

    int length() {
        return 0;
    }
}

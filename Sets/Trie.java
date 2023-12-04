public class Trie implements Set<String> {

    private class Tnode {
        String l;
        Tnode lmchild;
        Tnode rsibling;
        boolean wordEnd;
    }

    Tnode root = null;

    void add(String e) {
        return;
    }

    boolean contains(String e) {
        String fl = e.substring(0,1);

        Tnode cur = root;

        while ( cur != null && ! cur.l.equals(fl) ) {
            cur = cur.rsibling;
        }

        
        return false;
    }

    void remove(String e) {
        return;
    }

    int length() {
        return 0;
    }
}

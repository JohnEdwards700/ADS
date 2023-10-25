public class BinarySearchTreeSet implements Set<Integer> {
    
    class Tree {
        Integer e;
        Tree l;
        Tree r;
    }

    Tree root = null;

    public void add(Integer e) {
        root = addRecursion(e, root);
    }

    Tree addRecursion(Integer e, Tree t) {
        if ( t == null ) {
            Tree node = new Tree();
            node.e = e;
            node.l = null;
            node.r = null;

            return node;
        }

        int comp = e.compareTo(t.e);

        if ( comp > 0 ) {
            t.r = addRecursion(e, t.r);
        }
        else if ( comp < 0 ) {
            t.l = addRecursion(e, t.l);
        }
        
        return t;
    }

    public boolean contains(Integer e) {
        return false;
    }

    public void remove(Integer e) {
        root = removeRecursion(e, root);
    }

    private Tree removeRecursion(Integer e, Tree t) {
        if ( t == null ) {
            return null;
        }

        int comp = e.compareTo(t.e);

        if ( comp == 0 ) {
            if ( t.l == null ) {
                return t.r;
            }

            if ( t.r == null ) {
                return t.l;
            }

            // Found node to delete, with two children
            t.e = getMin(t.r);
            t.r = deleteMin(t.r);
        }
        else if ( comp < 0 ) {
            t.l = removeRecursion(e, t.l);
        }
        else if ( comp > 0 ) {
            t.r = removeRecursion(e, t.r);
        }

        return t;
    }

    private Integer getMin(Tree t) {
        if ( t.l == null ) {
            return t.e;
        }
        else {
            return getMin(t.l);
        }
    }

    private Tree deleteMin(Tree t) {
        if ( t.l == null ) {
            return t.r;
        }
        else {
            t.l = deleteMin(t.l);
            return t;
        }
    }

    public int length() {
        return 0;
    }
}

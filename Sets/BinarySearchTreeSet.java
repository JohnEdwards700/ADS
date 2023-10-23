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

        if ( t.e < e ) {
            t.r = addRecursion(e, t.r);
        }
        else if ( t.e > e ) {
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

        if ( t.e == e ) {
            if ( t.l == null && t.r == null ) {
                return null;
            }

            // Found a non-leaf to delete
            t.e = deleteMin(t.r);
        }
        
        if ( t.e > e ) {
            t.l = removeRecursion(e, t.l);
        }

        if ( t.e < e ) {
            t.r = removeRecursion(e, t.r);
        }
    }

    private Integer deleteMin(Tree t) {
        if ( t.l == null ) {
            return t.e;
        }
        else {
            t.l = ???
            deleteMin(t.l);
        }
    }

    public int length() {
        return 0;
    }
}

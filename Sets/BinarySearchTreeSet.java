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
            t.right = addRecursion(e, t.right);
        }
        else if ( t.e > e ) {
            t.left = addRecursion(e, t.left);
        }
        
        return t;
    }

    public boolean contains(Integer e) {
        return false;
    }

    public void remove(Integer e) {
        
    }

    public int length() {
        return 0;
    }
}

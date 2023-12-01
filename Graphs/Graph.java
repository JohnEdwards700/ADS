import java.util.HashMap;
import java.util.HashSet;

public class Graph {
    
    HashMap<Object, HashSet<Object>> graph = new HashMap<>();

    public void addNode(Object n) {
        HashSet<Object> nSet = graph.get(n);

        if ( nSet == null ) {
            graph.put(n, new HashSet<Object>());
        }
        else {
            System.out.printf("Node '%s' is already in the graph.\n", n);
        }
    }
    
    public void addEdge(Object from, Object to) {
        HashSet<Object> fromSet = graph.get(from);

        if ( fromSet == null ) {
            System.out.printf("Node '%s' is not in the nodes, so I'm not going to add an edge.\n", from);
            return;
        }

        HashSet<Object> toSet = graph.get(to);
        if ( toSet == null ) {
            System.out.printf("Node '%s' is not in the nodes, so I'm not going to add an edge.\n", to);
        }

        fromSet.add(to);
    }

    public boolean connected(Object from, Object to) {
        HashSet<Object> fromSet = graph.get(from);
        HashSet<Object> toSet = graph.get(to);

        if ( fromSet == null ) {
            System.out.printf("'%s' is not a node.\n", from);
            return false;
        }

        if ( toSet == null ) {
            System.out.printf("'%s' is not a node.\n", to);
            return false;
        }

        return fromSet.contains(to);
    }

    private HashSet<Object> visited;

    public boolean connected(Object n1, Object n2) {
        visited = new HashSet<>();
        return dfs(n1, n2);
    }

    private boolean dfs(Object n1, Object n2) {
        visited.add(n1);

        if ( n1 == n2 ) {
            return true;
        }

        for (Object neighbor : graph.get(n1) ) {
           if ( ! visited.contains(neighbor) && dfs(neighbor, n2) ) {
            return true;
           }
        }

        return false;
    }
}

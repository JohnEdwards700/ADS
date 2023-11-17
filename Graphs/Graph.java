import java.util.HashMap;
import java.util.HashSet;

public class Graph {
    
    HashMap<Object, HashSet<Object>> graph = new HashMap<>();
    
    public void addEdge(Object from, Object to) {
        graph.get(from).add(to);
    }
}

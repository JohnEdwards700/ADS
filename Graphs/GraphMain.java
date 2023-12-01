import java.util.Scanner;
import java.io.IOException;
import java.io.FileInputStream;

public class GraphMain {
    public static void main(String[] args) {
        Graph g = new Graph();

        Scanner scan = new Scanner(System.in);

        boolean done = false;
        while ( ! done ) {
            // Get the command
            String cmdstr = scan.next();
            String cmd = cmdstr.substring(0,1).toLowerCase();
            Integer from, to, node;

            switch ( cmd ) {
                case "c":
                    from = scan.nextInt();
                    to = scan.nextInt();
                    if ( g.connected(from, to) ) {
                        System.out.printf("'%s' is connected to '%s'\n", from, to);
                    }
                    else {
                        System.out.printf("'%s' is NOT connected to '%s'\n", from, to);
                    }
                    break;
                case "n":
                    node = scan.nextInt();
                    g.addNode(node);
                    break;
                case "e":
                    from = scan.nextInt();
                    to = scan.nextInt();
                    g.addEdge(from, to);
                    break;
                case "q":
                    done = true;
                    break;
                default:
                    System.err.printf("Unknown command '%s'.\n", cmdstr);
                    break;
            }
            
        }
        
    }

}

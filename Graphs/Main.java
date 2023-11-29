import java.util.Scanner;
import java.io.IOException;
import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {
        Graph g = new Graph();

        Scanner scan = new Scanner(System.in);

        boolean done = false;
        while ( ! done ) {
            // Get the command
            String cmdstr = scan.next();
            String cmd = cmdstr.substring(0,1).toLowerCase();

            switch ( cmd ) {
                case "e":
                    String s1 = scan.next();
                    String s2 = scan.next();
                    g.addEdge(s1, s2);
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

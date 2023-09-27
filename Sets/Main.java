import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Set<String> fruit = new ArrayListSet<>();

        Scanner scan = new Scanner(System.in);

        boolean done = false;
        while ( ! done ) {
            // Get the command
            String cmdstr = scan.next();
            String cmd = cmdstr.substring(0,1).toLowerCase();
            String v;
            Integer i;

            switch ( cmd ) {
                case "a":
                    v = scan.next();
                    fruit.add(v);
                    break;
                case "d":
                    v = scan.next();
                    fruit.remove(v);
                    break;
                case "c":
                    v = scan.next();
                    if ( fruit.contains(v) ) {
                        System.out.printf("%s is in the set.\n", v);
                    }
                    else {
                        System.out.printf("%s is not in the set.\n", v);
                    }
                    break;
                case "l":
                    System.out.println(fruit.length());
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

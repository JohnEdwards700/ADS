import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FixedArrayList<Integer> scores = new FixedArrayList<Integer>();

        Scanner scan = new Scanner(System.in);

        boolean done = false;
        while ( ! done ) {
            // Get the command
            String cmdstr = scan.next();
            String cmd = cmdstr.substring(0,1).toLowerCase();
            Integer v, i;

            switch ( cmd ) {
                case "a":
                    v = scan.nextInt();
                    scores.add(v);
                    break;
                case "d":
                    i = scan.nextInt();
                    try {
                        scores.remove(i);
                    } catch (Exception e) {
                        System.err.println("That's not a valid index: " + e);
                    }
                    break;
                case "g":
                    i = scan.nextInt();
                    System.out.println(scores.get(i));
                    break;
                case "l":
                    System.out.println(scores.length());
                    break;
                case "p":
                    for (Integer j : scores) {
                        System.out.printf("%d ", j);
                    }
                    System.out.println();
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

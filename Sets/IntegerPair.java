public class IntegerPair implements Comparable<IntegerPair> {
    Integer f, s;

    public IntegerPair(Integer x, Integer y) {
        f = x;
        s = y;
    }

    public int compareTo(IntegerPair that) {
        if ( this.f > that.f ) {
            return 1;
        }
        else if ( this.f < that.f ) {
            return -1;
        }
        else if ( this.s > that.s ) {
            return 1;
        }
        else if ( this.s < that.s ) {
            return -1;
        }

        return 0; 
    }
}

import static java.lang.System.*;

/**
 * Created by flerchy on 01.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        out.println("Main OK");
    }
}

class Nya {
    Integer a;
    Double b;


    private Nya() {
        a = 25;
        b = 2.5;
    }

    public Nya(Integer a) {
        this.a = a;
        this.b = 2.5;
    }

    private Nya(Integer a, Double b) {
        this.a = a;
        this.b = b;
    }
}
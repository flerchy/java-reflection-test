import java.lang.reflect.Constructor;
import static java.lang.System.*;
import java.awt.*;
import java.applet.*;

/**
 * Created by flerchy on 01.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Constructor<?>[] constructors = Nya.class.getConstructors();

        for (Constructor<?> constructor : constructors) {
            out.println(constructor.getName());
            out.println(constructor.getParameterCount());
        }


    }
}

class Nya {
    int a;

    public Nya(int a) {
        this.a = a;
    }

    public Nya() {
    }
}
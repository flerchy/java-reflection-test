import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Type;
import static java.lang.System.out;
import java.lang.reflect.Constructor;
/**
 * Created by flerchy on 05.05.2016.
 */
public class NyaTest {
    @Test
    public void testNyaConstructor() {
        Nya nya = new Nya();

        Constructor<?>[] nyaConst = nya.getClass().getDeclaredConstructors();
        Constructor<?>[] nyaClassConst = Nya.class.getDeclaredConstructors();
        for (Integer i = 0; i < nyaConst.length ; i++ ) {
            Constructor ctor = nyaConst[i];
            Constructor nyaCtor = nyaClassConst[i];
            String cname = ctor.getName();
            String nyaCname = nyaCtor.getName();
            Integer paramCount = ctor.getParameterCount();
            Integer nyaParamCount = nyaCtor.getParameterCount();
            Assert.assertEquals(ctor, nyaCtor);
            out.println(cname + " " + nyaCname);
            Assert.assertEquals(cname, nyaCname);
            out.println(paramCount + " " + nyaParamCount);
            Assert.assertEquals(paramCount, nyaParamCount);
            out.println("OK");
        }
    }
}

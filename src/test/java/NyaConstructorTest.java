import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import static java.lang.System.out;
import java.lang.reflect.Constructor;
/**
 * Created by flerchy on 05.05.2016.
 * 1) кол-во конструкторов
 * 2) кол-во параметров
 * 3) имена конструкторов
 *  все способы, как можно ошибиться ))
 */
public class NyaConstructorTest {
    @Test
    public void testNyaConstructor() {

        Integer constructorsCount = 3;
        String constructorName = "Nya";
        String firstConstructorModifier = "private";
        Integer firstConstructorParametersCount = 0;

        String secondConstructorModifier = "public";
        Integer secondConstructorParametersCount = 1;
        String secondConstructorParameterType = "class java.lang.Integer";

        String thirdConstructorModifier = "private";
        Integer thirdConstructorParametersCount = 2;
        String thirdConstructorFirstParameterType = "class java.lang.Integer";
        String thirdConstructorSecondParameterType = "class java.lang.Double";

        Constructor<?>[] nyaClassConstructors = Nya.class.getDeclaredConstructors();

        Assert.assertEquals((long)nyaClassConstructors.length, (long)constructorsCount);

        Constructor<?> currentConstructor = nyaClassConstructors[0];
        String currentConstructorName = currentConstructor.getName();
        Integer currentConstructorModifier = currentConstructor.getModifiers();
        Integer currentConstructorParametersCount = currentConstructor.getParameterCount();

        Assert.assertEquals(currentConstructorName, constructorName);
        Assert.assertEquals(Modifier.toString(currentConstructorModifier), firstConstructorModifier);
        Assert.assertEquals(currentConstructorParametersCount, firstConstructorParametersCount);

        currentConstructor = nyaClassConstructors[1];
        currentConstructorModifier = currentConstructor.getModifiers();
        currentConstructorName = currentConstructor.getName();
        currentConstructorParametersCount = currentConstructor.getParameterCount();
        String currentConstructorParameterType = currentConstructor.getParameterTypes()[0].toString();

        Assert.assertEquals(Modifier.toString(currentConstructorModifier), secondConstructorModifier);
        Assert.assertEquals(currentConstructorName, constructorName);
        Assert.assertEquals(currentConstructorParametersCount, secondConstructorParametersCount);
        Assert.assertEquals(currentConstructorParameterType, secondConstructorParameterType);

        currentConstructor = nyaClassConstructors[2];
        currentConstructorModifier = currentConstructor.getModifiers();
        currentConstructorName = currentConstructor.getName();
        currentConstructorParametersCount = currentConstructor.getParameterCount();
        Class<?>[] currentConstructorParameters = currentConstructor.getParameterTypes();
        String currentConstructorFirstParameterType = currentConstructorParameters[0].toString();
        String currentConstructorSecondParameterType = currentConstructorParameters[1].toString();

        Assert.assertEquals(Modifier.toString(currentConstructorModifier), thirdConstructorModifier);
        Assert.assertEquals(currentConstructorName, constructorName);
        Assert.assertEquals(currentConstructorParametersCount, thirdConstructorParametersCount);
        Assert.assertEquals(currentConstructorFirstParameterType, thirdConstructorFirstParameterType);
        Assert.assertEquals(currentConstructorSecondParameterType, thirdConstructorSecondParameterType);
    }
}


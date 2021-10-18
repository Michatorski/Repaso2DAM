package ieasfm.org.repasoJava.colecciones;

import ieasfm.org.ReapasoJava.colecciones.ListMethods;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListMethodsTest {
    @Test
    public void mediaTest(){
        List<Double> numeros = new ArrayList<>();
        numeros.add(4d);
        numeros.add(5d);
        numeros.add(6d);
        double media  = ListMethods.media(numeros);

        Assert.assertEquals(5.0, media, 0.00000001);
    }
}

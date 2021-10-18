package org.iesfm.calculator;

import org.iesfm.calculator.exceptions.NotANumberException;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculatorTest {

    private static final double DELTA = 0.001;

    @Test
    public void additionTest() throws NotANumberException{
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(1);

        int res = Calculator.sum2(numbers);

        Assert.assertEquals(res, 2);
    }

    @Test
    public void sumaTest() throws NotANumberException {
        List<Integer> numbers = Arrays.asList(1, 2, 3 ,5);

        int res = Calculator.sum2(numbers);

        Assert.assertEquals(res, 11);
    }

    @Test(expected = NotANumberException.class)
    public void emptySumaTest() throws NotANumberException{
        List<Integer> numbers = Arrays.asList();

        int res = Calculator.sum2(numbers);
        
    }

    @Test
    public void averageTest() throws  NotANumberException{
        List<Double> numbers = new ArrayList<>();

        numbers.add(1.2);
        numbers.add(1.2);

      double res = Calculator.media(numbers);

        Assert.assertEquals(res, 1.2, DELTA);
    }

    @Test (expected = NotANumberException.class)
    public void emptyAverageTest() throws  NotANumberException{
        List<Double> numbers = Arrays.asList();

        double res = Calculator.media(numbers);
    }
}

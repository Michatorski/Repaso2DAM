package org.iesfm.calculator;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CalculatorTest {

    private static final double DELTA = 0.001;

    @Test
    public void additionTest(){
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(1);

        int res = Calculator.sum2(numbers);

        Assert.assertEquals(res, 2);
    }

    @Test
    public void averageTest(){
        List<Double> numbers = new ArrayList<>();

        numbers.add(1.2);
        numbers.add(1.2);

      double res = Calculator.media(numbers);

        Assert.assertEquals(res, 1.2, DELTA);
    }
}

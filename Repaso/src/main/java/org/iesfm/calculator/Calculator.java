package org.iesfm.calculator;

import java.util.List;

public class Calculator {
    public static void main(String[] args) {
        System.out.printf("helo world");
    }

    public static int sum (List<Integer> numbers){
        int res = 0;

        for (int i = 0; i < numbers.size(); i++) {
            res = res + numbers.get(i);
        }

        return res;
    }

    public static int sum2 (List<Integer> numbers){
        int res = 0;

        for (int number:
             numbers) {
            res =res + number;

        }

        return res;
    }

    public static double media (List<Double> numbers){
        double res = 0;

        for (int i = 0; i < numbers.size(); i++) {
            res = res + numbers.get(i);
        }

        return res/ numbers.size();
    }

}

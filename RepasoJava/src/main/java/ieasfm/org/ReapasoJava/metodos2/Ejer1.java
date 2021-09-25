package ieasfm.org.ReapasoJava.metodos2;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class Ejer1 {

    public static int listNum(int [] array){
        Collections.reverse(Arrays.asList(array));

        int res = 0;
        for (int num:
             array) {

            res = num;
            System.out.println(res);
        }
        return res;
    }



    public static void main(String[] args) {
        int [] array = {1, 3, 0, 5};

        listNum(array);
    }
}

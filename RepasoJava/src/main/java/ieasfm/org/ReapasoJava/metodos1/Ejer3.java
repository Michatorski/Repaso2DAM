package ieasfm.org.ReapasoJava.metodos1;

public class Ejer3 {

    private static int findMaxInt (int [] array){
        int max = 0;
        for (int num : array) {
            if (num > max){
                max = num;
            }
        }

        return max;
    }

    private static void print (int res){
        System.out.println("El maximo es: " + res);
    }
    public static void main(String[] args) {

        int [] array = {1, 3, 0, 5};

        print(findMaxInt(array));
    }
}

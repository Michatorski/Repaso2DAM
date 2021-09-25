package ieasfm.org.ReapasoJava.metodos1;

public class Ejer4 {

    private static int sumArray (int[] arrayList){
        int res = 0;

        for (int i = 0; i < arrayList.length; i++) {
            int num = arrayList[i];

            res += num;
        }

        return res;
    }

    private static void print (int res){
        System.out.println("El total es: " + res);
    }

    public static void main(String[] args) {
        int [] array = {1, 3, 0, 5};

        print(sumArray(array));
    }
}

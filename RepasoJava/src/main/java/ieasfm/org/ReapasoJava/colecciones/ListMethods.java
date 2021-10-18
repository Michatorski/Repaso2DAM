package ieasfm.org.ReapasoJava.colecciones;

import java.util.*;

public class ListMethods {
    public static double media (List<Double> listNum){
        double res = 0;
        for (double num : listNum) {
            res = (res + num) / listNum.size();
        }

        return res;
    }


    public static double maximo (List<Double> listNum){
        double max = 0;
        for (double num : listNum) {
            if (num > max){
                max = num;
            }
        }

        return max;
    }


    public static double minimo (List<Double> listNum){
        double min = 0;
        for (double num : listNum) {
            if (num < min){
                min = num;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        List<Double> numeros = new ArrayList<>();

        numeros.add(4d);
        numeros.add(5d);
        numeros.add(1d);
        //lista (4, 5, 1)


        //TreeMap = orden alfabetico
        //HasMap = no hay orden
        Map<String, Integer> notasPorUsuarioI = new HashMap<>();

        notasPorUsuarioI.put("Michal", 7 );
        notasPorUsuarioI.put("Ana Luz", 7 );
        // Map(Ana luz -> 7, Michal -> 7)

        Map<Alumno, Integer> notasPorUsuario = new HashMap<>();

//        notasPorUsuario.put(new Alumno("Ana luz", "Aviles"), 7);
//        notasPorUsuario.put(new Alumno("Ana luz", "Aviles"), 3);
        //Map (Ana Luz, Aviales) -> 3
        //sobreescibe el 7

//        Set<Alumno> clase = new HashSet<>();
//        clase.add(new Alumno("Ana luz", "Aviles"));
//        clase.add(new Alumno("Ana luz", "Aviles"));
//
//        System.out.println(clase.size());


        notasPorUsuario.put(new Alumno("Ana luz", "Aviles"), 7);
    notasPorUsuario.put(new Alumno("Michal", "Homenda"), 6);
    notasPorUsuario.put(new Alumno("Otro", "Otro"), 4);

    double totalNotas = 0;
        for (int nota: notasPorUsuario.values() ) {
            totalNotas += nota;
        }

        double media = totalNotas/notasPorUsuario.size();

        System.out.println(media);
   }
}

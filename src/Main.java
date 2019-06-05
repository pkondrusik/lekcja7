import java.util.*;


public class Main {

    public static void main(String[] args) {
        List<String> listaStringow = new ArrayList<>();
        listaStringow.add("test1");
        listaStringow.add("test2");
        listaStringow.add("test3");

        System.out.println(listaStringow);

        Set<String> imie = new TreeSet<>();
        imie.add("set1");
        imie.add("set2");
        imie.add("set3");

        System.out.println(imie);

        Map<String,Double> mapa = new TreeMap<>();
        mapa.put("test1", 1.0);
        mapa.put("test2", 2.0);
        mapa.put("test3", 3.0);

        System.out.println(mapa.keySet() + "\n" + mapa.values());


    }
}

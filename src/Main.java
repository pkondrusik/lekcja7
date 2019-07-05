import java.util.*;
import java.util.stream.Collectors;


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

        Set<String> z4 = new HashSet<>();
        Scanner wczytaj = new Scanner(System.in);
        int i=0;

        for (i=1; i<=5; i++){
            System.out.println("Podaj " + i + " slowo:");
            z4.add(wczytaj.next());
        }

        System.out.println(z4);


        Map<String, String> slownik = new HashMap<>();
        slownik.put("dupa", "ass");
        slownik.put("telefon", "telephone");
        slownik.put("myszka", "mouse");
        String slowo;


        do{
            System.out.println("podaj wyraz (w - wyjdz)");
            slowo = wczytaj.next();
            if (slowo.equals("w")) break;
            if (slownik.containsKey(slowo))
                System.out.println("tlumaczenie: " + slownik.get(slowo));
            else System.out.println("nie ma takiego slowa!");

        } while (true);

        List<Osobowy> auta = new ArrayList<>();

        Benzynka jakiMotor = new Benzynka();
        Osobowy auto = new Osobowy("audi", "a4", "B0 BEK", "kosc sloniowa", 10000, 10, jakiMotor.getJaki(), 50, 180000, 2000, 5);

        auta.add(auto);

        Dizelek jakiMotor1 = new Dizelek();
        Osobowy auto1 = new Osobowy("audi", "a6", "B0 BEK", "kosc sloniowa", 6700, 5, jakiMotor1.getJaki(), 40, 6000, 2500, 5);

        auta.add(auto1);

        List<String> rodzajSilnikow = auta.stream()
                .map((Osobowy s) -> s.get().getRodzaj())
                .collect(Collectors.toList();

        for (int j = 0; j < auta.size(); j++)
            System.out.println(auta.get(j).info());

    }
}

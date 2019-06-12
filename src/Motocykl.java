public class Motocykl extends Pojazd {
    double pojemnosc;
    int iloscMiejsc;

    public Motocykl (String marka, String model, String numerRej, String kolor,
                     double cena, double spalanie, String silnik, double stanPaliwa, double przejechaneKm, double pojemnosc, int iloscMiejsc){

        super(marka, model, numerRej, kolor, cena, spalanie, silnik, stanPaliwa, przejechaneKm);

        this.pojemnosc=pojemnosc;
        this.iloscMiejsc=iloscMiejsc;
    }

    public String info(){
        return  super.info() + "/n" + pojemnosc + "/n" + iloscMiejsc;
    }
}

public class Osobowy extends Pojazd {
    double pojemnosc;
    int iloscDrzwi;

    public Osobowy(String marka, String model, String numerRej, String kolor,
                   double cena, double spalanie, String silnik, double stanPaliwa, double przejechaneKm, double pojemnosc, int iloscDrzwi) {

        super(marka, model, numerRej, kolor, cena, spalanie, silnik, stanPaliwa, przejechaneKm);

        this.pojemnosc = pojemnosc;
        this.iloscDrzwi = iloscDrzwi;

    }
}

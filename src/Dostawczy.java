public class Dostawczy extends Pojazd {
    double pojemnosc;
    int ladownosc;

    public Dostawczy(String marka, String model, String numerRej, String kolor,
                   double cena, double spalanie, String silnik, double stanPaliwa, double przejechaneKm, double pojemnosc, int ladownosc) {

        super(marka, model, numerRej, kolor, cena, spalanie, silnik, stanPaliwa, przejechaneKm);

        this.pojemnosc = pojemnosc;
        this.ladownosc = ladownosc;

    }
}

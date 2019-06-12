abstract class Pojazd {
    protected String marka;
    protected String model;
    protected String numerRej;
    protected String kolor;
    protected double cena;
    protected double spalanie;
    protected String silnik;
    protected double stanPaliwa;
    protected double przejechaneKm;


    public Pojazd (String marka, String model, String numerRej, String kolor, double cena,
                   double spalanie, String silnik, double stanPaliwa, double przejechaneKm){
        this.marka=marka;
        this.model=model;
        this.numerRej=numerRej;
        this.kolor=kolor;
        this.cena=cena;
        this.spalanie=spalanie;
        this.silnik=silnik;
        this.stanPaliwa=stanPaliwa;
        this.przejechaneKm=przejechaneKm;

    }

   public String info(){
        return "\n" + marka + "\n" + model + "\n" + numerRej + "\n" + kolor + "\n" + cena + "\n" + spalanie + "\n" + silnik + "\n" + stanPaliwa  + "\n" + przejechaneKm;
    }

    public void jedz(double przejechaneKm){
        this.przejechaneKm += przejechaneKm;
        stanPaliwa -= przejechaneKm * spalanie / 100;

    }

    public void tankuj(double ileTankuj){
        stanPaliwa += ileTankuj;
    }

    public double stanBaku(){
        return stanPaliwa;
    }



}

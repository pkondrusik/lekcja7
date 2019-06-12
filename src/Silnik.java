abstract class Silnik {
    protected boolean czyUruchomiony;

    void wlacz(){
        czyUruchomiony=true;
        System.out.println("silnik uruchomiony!");
    }

    void wylacz(){
        czyUruchomiony=false;
        System.out.println("silnik wylacznoy!");
    }


}

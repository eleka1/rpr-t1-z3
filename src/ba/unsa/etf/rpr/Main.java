package ba.unsa.etf.rpr;

public class Main {

    public static void main(String[] args) {
        Sat s = new Sat(15, 30, 45);
        System.out.println(s);
        s.sljedeci();
        System.out.println(s);
        s.pomjeriZa(-48);
        System.out.println(s);
        s.setSat(0,0,0);
        System.out.println(s);
    }
}

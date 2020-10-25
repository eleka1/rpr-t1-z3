package ba.unsa.etf.rpr;

public class Sat {
    private int sati, minute, sekunde;

    public Sat(int sati, int minute, int sekunde) {
        setSat(sati, minute , sekunde);
    }

    public void setSat(int sati, int minute, int sekunde) {
        this.sati = sati;
        this.minute = minute;
        this.sekunde = sekunde;
    }

    public void sljedeci(){
        sekunde = sekunde + 1;
        if (sekunde == 60) {
            sekunde = 0;
            minute = minute + 1;
        }
        if(minute == 60) {
            minute = 0;
            sati = sati + 1;
        }
        if (sati == 24) sati = 0;
    }

    public void prethodni(){
        sekunde = sekunde - 1;
        if (sekunde == -1) {
            sekunde = 59;
            minute = minute - 1;
        }
        if(minute == -1) {
            minute = 59;
            sati = sati - 1;
        }
        if (sati == -1) sati = 23;
    }

    public void pomjeriZa(int pomak) {
        if (pomak > 0) for(int i = 0; i < pomak; i++) sljedeci();
        if (pomak < 0) for(int i = 0; i < -pomak; i++) prethodni();
    }

    public int getSati() {
        return sati;
    }

    public int getMinute() {
        return minute;
    }

    public int getSekunde() {
        return sekunde;
    }

    @Override
    public String toString() {
        return sati + ":" + minute + ":" + sekunde;
    }
}

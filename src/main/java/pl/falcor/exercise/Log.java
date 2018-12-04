package pl.falcor.exercise;

public class Log implements Obserwator{

    void wypisz(Ruch ruch){
        System.err.println(ruch);
    }

    @Override
    public void reaguj(Ruch ruch) {
        wypisz(ruch);
    }
}

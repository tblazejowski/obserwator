package pl.falcor.exercise;

public class Sędzia implements Obserwator {

    boolean oceń(Ruch ruch){
        if (ruch.getPole() == 6) return true;
        else return false;
    }

    @Override
    public void reaguj(Ruch ruch) {
        System.out.println(oceń(ruch));
    }
}

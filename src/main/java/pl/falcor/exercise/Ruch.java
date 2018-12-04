package pl.falcor.exercise;

public class Ruch {

    private int pole;

    public Ruch(int pole) {
        this.pole = pole;
    }

    public int getPole() {
        return pole;
    }

    @Override
    public String toString() {
        return "Ruch{" +
                "pole=" + pole +
                '}';
    }
}

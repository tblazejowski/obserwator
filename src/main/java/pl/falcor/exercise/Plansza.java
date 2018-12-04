package pl.falcor.exercise;

import java.util.ArrayList;

public class Plansza {

    private final ArrayList<Obserwator> listaObserwatorow;

    public Plansza(Sędzia sędzia, Log log, IU interfejs) {
        listaObserwatorow = new ArrayList<>();
        listaObserwatorow.add(interfejs);
        listaObserwatorow.add(log);
        listaObserwatorow.add(sędzia);
    }

    public void postaw(Ruch ruch){
        if((ruch.getPole() % 2) == 0) powiadom(ruch);
    }

    void powiadom(Ruch ruch){
        listaObserwatorow.forEach(i -> i.reaguj(ruch));
    }
}
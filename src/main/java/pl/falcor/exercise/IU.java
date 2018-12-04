package pl.falcor.exercise;

import java.util.Scanner;

public class IU implements Obserwator {

    void wypisz(Ruch ruch) {
        System.out.println(ruch.getPole());
    }

    public Ruch wykonaj(Scanner scanner) {
        return new Ruch(scanner.nextInt());
    }

    @Override
    public void reaguj(Ruch ruch) {
        wypisz(ruch);
    }
}
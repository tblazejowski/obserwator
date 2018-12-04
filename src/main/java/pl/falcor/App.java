package pl.falcor;

import pl.falcor.exercise.*;

import java.util.Scanner;

class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Sędzia sędzia = new Sędzia();
		Log log = new Log();
		IU interfejs = new IU();
		Plansza plansza = new Plansza(sędzia, log, interfejs);
		plansza.postaw(interfejs.wykonaj(scanner));
	}
}

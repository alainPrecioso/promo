package promo;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;

import utils.Ser;

public class Main {

	public static void main(String[] args) {
		ArrayList<Promo> promos = (ArrayList<Promo>) Ser.load("promos.xml");
		promos.remove(4);
		Ser.save("promos", promos);


	}

}
package utils;

import java.util.ArrayList;
import java.util.Collections;

import promo.Promo;

public class PSort {
	
	
	public static ArrayList<Promo> sort(ArrayList<Promo> promos) {
		Collections.sort(promos, new PromoComparator());
		for (Promo promo : promos) {
			Collections.sort(promo.getEleve(), new NomComparator());
		}		
		
		return promos;
		
	}

}

package utils;

import java.util.Collections;
import java.util.Comparator;
import promo.Promo;


public class PromoComparator implements Comparator<Promo> {

	//Collections.sort(promos, new PromoComparator());
	@Override
	public int compare(Promo o1, Promo o2) {
		return o1.getNomPromo().compareTo(o2.getNomPromo());
	}

}

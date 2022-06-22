package utils;

import java.util.Comparator;
import promo.Apprenant;


public class NomComparator implements Comparator<Apprenant> {

	//Collections.sort(list, new NomComparator());
	@Override
	public int compare(Apprenant o1, Apprenant o2) {
		if (o1.getNom().equals(o2.getNom())) {
			return o1.getPrenom().compareTo(o2.getPrenom());
		}
		return o1.getNom().compareTo(o2.getNom());
	}

}

package promo;

import java.util.ArrayList;

import utils.Ser;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> contact = new ArrayList<String>();
		ArrayList<Apprenant> list = new ArrayList<Apprenant>();

		list.add(new Alternant("john", "john", 2022, 04, 01, contact, "optimus", 0, 0, "java", "2500"));
		list.add(new Alternant("jones", "boby", 2022, 03, 01, contact, "domédia", 0, 0, "php", "1800"));
		list.add(new Alternant("bertrand", "rene", 2022, 05, 01, contact, "lava", 0, 0, "java", "1500"));
		list.add(new Alternant("michel", "jacky", 2022, 04, 01, contact, "biotech", 0, 0, "java4", "1650"));
		list.add(new Alternant("petit", "dilan", 2022, 03, 01, contact, "eureka", 0, 0, "java", "1977"));

		list.add(new Stagiaire("kurilenko", "olga", 2022, 04, 01, contact,0,0, "java","are", 1010));
		list.add(new Stagiaire("boutin", "louis", 2022, 07, 01, contact, 0, 0, "php","aref", 1101));
		list.add(new Stagiaire("ceasar", "harry", 2022, 05, 01, contact, 0, 0, "java","are", 1200));
		list.add(new Stagiaire("stark", "aria", 2022, 04, 01, contact, 0, 0, "java25", "are", 1300));
		list.add(new Stagiaire("bella", "erika", 2022, 04, 01, contact, 0, 0, "java", "aref", 1360));

		System.out.println(list);
		
		//Ser.save("ListeApprenant", list);

	}

}

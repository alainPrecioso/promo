package promo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> contact = new ArrayList<String>();
		ArrayList<Apprenant> list = new ArrayList<Apprenant>();

		list.add(new Alternant("mins", "jeremy", 2022, 04, 01, contact, "numinf", 0, 0, "java4", "2500"));
		list.add(new Alternant("roy", "alexandre", 2022, 03, 01, contact, "gestinf", 0, 0, "php4", "1800"));
		list.add(new Alternant("ans", "gerard", 2022, 05, 01, contact, "ainum", 0, 0, "java4", "1500"));
		list.add(new Alternant("frech", "jacky", 2022, 04, 01, contact, "reseau", 0, 0, "java4", "1650"));
		list.add(new Alternant("petit", "dilan", 2022, 03, 01, contact, "eureka", 0, 0, "java4", "1977"));

		list.add(new Stagiaire("lins", "cindy", 2022, 04, 01, contact,0,0, "java4","are", 1010));
		list.add(new Stagiaire("grech", "sebastien", 2022, 07, 01, contact, 0, 0, "php4","aref", 1101));
		list.add(new Stagiaire("loyd", "jakson", 2022, 05, 01, contact, 0, 0, "java4","are", 1200));
		list.add(new Stagiaire("mercury", "brendon", 2022, 04, 01, contact, 0, 0, "java4", "are", 1300));
		list.add(new Stagiaire("ren", "linda", 2022, 04, 01, contact, 0, 0, "java4", "aref", 1360));

		System.out.println(list);
	
	}
	
}

package promo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
ArrayList<String> contact = new ArrayList<String>();
ArrayList<Apprenant> list = new ArrayList<Apprenant>();
list.add(new Alternant("john", "john", 2022, 04, 01, contact, "optimus", 0, 0, "java", "2500"));
	
System.out.println(list);

	}

}

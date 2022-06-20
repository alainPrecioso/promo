package promo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Stagiaire extends Apprenant {
	
	protected String typAllo;
	protected Double allocation;

	public Stagiaire() {
		
	}


	public Stagiaire(String nom, String prenom, Integer annee, Integer mois, Integer jour, ArrayList<String> contacts,
			String nomEntreprise, int retards, int asbsences, String promo) {
		super(nom, prenom, annee, mois, jour, contacts, nomEntreprise, retards, asbsences, promo);
		// TODO Auto-generated constructor stub
	}




	@Override
	public String toString() {
		return "Stagiaire [TypAllo=" + typAllo + ", Allocation=" + allocation + "]";
	}

}

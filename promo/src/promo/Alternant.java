package promo;

import java.util.ArrayList;

public class Alternant extends Apprenant{
	protected String salaire;

	public Alternant() {
		
	}

	public Alternant(String nom, String prenom, Integer annee, Integer mois, Integer jour, ArrayList<String> contacts,
			String nomEntreprise, int retards, int asbsences, String promo) {
		super(nom, prenom, annee, mois, jour, contacts, nomEntreprise, retards, asbsences, promo);
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Alternant [Salaire=" + salaire + "]";
	}

}

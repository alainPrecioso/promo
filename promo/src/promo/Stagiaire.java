package promo;

import java.util.ArrayList;

public class Stagiaire extends Apprenant {
	
	protected String typAllo;
	protected Double allocation;

	public Stagiaire() {
		
	}



	protected Stagiaire(String nom, String prenom, Integer annee, Integer mois, Integer jour,
			ArrayList<String> contacts, int retards, int asbsences, String promo, String typAllo, double allocation) {
		super(nom, prenom, annee, mois, jour, contacts, typAllo, retards, asbsences, promo);
		this.typAllo = typAllo;
		this.allocation = allocation;
}



	@Override
	public String toString() {
		return "Stagiaire :\nType d'allocation -> " + typAllo + " --- Allocation -> " + allocation + " --- Nom -> " + nom + " --- Prenom -> " + prenom
				+ " --- Date inscription ->" + dateInscri + " --- Contacts -> " + contacts + "Promo -> " + promo;
	}

	

}

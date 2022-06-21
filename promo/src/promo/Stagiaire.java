package promo;

import java.util.ArrayList;

public class Stagiaire extends Apprenant {
	
	protected String typAllo;
	protected Double allocation;

	public Stagiaire() {
		
	}


	protected Stagiaire(String nom, String prenom, Integer annee, Integer mois, Integer jour,
			ArrayList<String> contacts, String nomEntreprise, int retards, int absences, String promo, String typAllo, double allocation) {
		super(nom, prenom, annee, mois, jour, contacts, nomEntreprise, retards, absences, promo);
		this.typAllo = typAllo;
		this.allocation = allocation;
}
	@Override
	public String toString() {
		return "Stagiaire --> Type d'allocation -> " + typAllo + " --- Allocation -> " + allocation + " --- Nom -> " + nom + " --- Prenom -> " + prenom
				+ " --- Date inscription ->" + dateInscri + " --- Contacts -> " + contacts + "Promo -> " + promo;
	}

	@Override
	public String toStringComplet() {
		return "Stagiaire --> || Nom: " +nom+ "|| Prenom: " +prenom+ " || Date inscription: " +dateInscri+
				" || Promo: " +promo+ " || Type Allocation: " +typAllo+ " || Allocation: " +allocation+ 
			    " || Entreprise: " +nomEntreprise+ " || Contacts: " +contacts+
				"||||  Retards: " +retards+ " || Absences : "+absences;
	}


	
	

	

}

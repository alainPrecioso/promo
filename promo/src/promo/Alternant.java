package promo;

import java.util.ArrayList;

public class Alternant extends Apprenant{
	protected String salaire;

	public Alternant() {
		
	}

	public Alternant(String nom, String prenom, Integer annee, Integer mois, Integer jour, ArrayList<String> contacts,
			String nomEntreprise, int retards, int asbsences, String promo, String salaire ) {
		super(nom, prenom, annee, mois, jour, contacts, nomEntreprise, retards, asbsences, promo);
	this.salaire = salaire;
	
	}
	
	public String getSalaire() {
		return salaire;
	}

	public void setSalaire(String salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Alternant --> "
				+ " || Nom: " +nom+ " || Prenom: " +prenom+ " || Date inscription: " + dateInscri
				+ " || Promo: " +promo+ " || Salaire -> " + salaire;
	}
	
	@Override
	public String toStringComplet() {
		return ""+nom+", "+prenom+", "+dateInscri+", "
				 +promo+", "+salaire+", "+nomEntreprise+", "
				 +retards+", "+absences+", "+ alertAbscences;
	}
	



	
}
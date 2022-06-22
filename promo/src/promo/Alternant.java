package promo;

import java.util.ArrayList;

public class Alternant extends Apprenant{
	protected String salaire;

	public Alternant() {
		
	}

	public Alternant(String nom, String prenom, Integer annee, Integer mois, Integer jour, ArrayList<String> contacts,
			String nomEntreprise, String salaire ) {
		super(nom, prenom, annee, mois, jour, contacts, nomEntreprise);
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
		String str = "Alternant --> "
				+ " || Nom: " +nom+ " || Prenom: " +prenom+ " || Date inscription: " + dateInscri;
		
		if (alertAbsences == true || alertRetards == true) {
			str += " ALERTE";
		}
		return str;
	}
	
	@Override
	public String toStringComplet() {
		String str = nom+", "+prenom+", "+dateInscri+", "
				 +promo+", "+salaire+"€, "+nomEntreprise+", "
				 +retards+" minutes, "+absences;
		
		if (alertAbsences == true || alertRetards == true) {
			str += " ALERTE";
		}
		return str;
	}
	



	
}
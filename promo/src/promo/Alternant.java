package promo;

import java.util.ArrayList;

public class Alternant extends Apprenant{
	protected String salaire;

	public Alternant() {
		
	}

	public Alternant(String nom, String prenom, Integer annee, Integer mois, Integer jour, ArrayList<String> contacts,
			String promo, String nomEntreprise, String salaire ) {
		super(nom, prenom, annee, mois, jour, contacts, promo, nomEntreprise);
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
		String str = prenom+ " " +nom+ " || Date inscription: " + dateInscri;
		
		if (alertAbsences == true || alertRetards == true) {
			str += " ALERTE";
		}
		return str;
	}
	
	@Override
	public String toStringComplet() {
		String str = prenom+", "+nom+", "+dateInscri+", "
				 +promo+", "+salaire+"€, salarié à "+nomEntreprise+", "
				 +retards+" minutes, "+absences + " jours";
		
		if (alertAbsences == true || alertRetards == true) {
			str += " ALERTE";
		}
		return str;
	}
	



	
}
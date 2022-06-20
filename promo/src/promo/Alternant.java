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

	@Override
	public String toString() {
		return "Alternant [salaire=" + salaire + ", nom=" + nom + ", prenom=" + prenom + ", dateInscri=" + dateInscri
				+ ", promo=" + promo + "]";
	}
	



	
}

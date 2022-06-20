package promo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Stagiaire extends Apprenant {
	
	protected String typAllo;
	protected Double allocation;

	public Stagiaire() {
		
	}



	protected Stagiaire(String nom, String prenom, Integer annee, Integer mois, Integer jour,
			ArrayList<String> contacts, String nomEntreprise, int retards, int asbsences, String promo, String typAllo, double allocation) {
		super(nom, prenom, annee, mois, jour, contacts, nomEntreprise, retards, asbsences, promo);
		this.typAllo = typAllo;
		this.allocation = allocation;
}



	@Override
	public String toString() {
		return "Stagiaire [typAllo=" + typAllo + ", allocation=" + allocation + ", nom=" + nom + ", prenom=" + prenom
				+ ", dateInscri=" + dateInscri + ", contacts=" + contacts + ", promo=" + promo + "]";
	}

	

}

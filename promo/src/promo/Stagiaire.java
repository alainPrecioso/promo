package promo;

import java.util.ArrayList;

public class Stagiaire extends Apprenant {
	
	protected String typAllo;
	protected String allocation;

	public Stagiaire() {
		
	}


	protected Stagiaire(String nom, String prenom, Integer annee, Integer mois, Integer jour,
			ArrayList<String> contacts, String nomEntreprise, int retards, int absences, String promo, String typAllo, String allocation) {
		
		super(nom, prenom, annee, mois, jour, contacts, nomEntreprise, retards, absences, promo);
		this.typAllo = typAllo;
		this.allocation = allocation;
}
	
	public String getTypAllo() {
		return typAllo;
	}


	public void setTypAllo(String typAllo) {
		this.typAllo = typAllo;
	}


	public String getAllocation() {
		return allocation;
	}


	public void setAllocation(String allocation) {
		this.allocation = allocation;
	}


	@Override
	public String toString() {
		return "Stagiaire --> "
				+ "|| Nom: " +nom+ "|| Prenom: " +prenom+ " || Date inscription: " +dateInscri+
				"  || Promo: " +promo+ " || Type Allocation: " +typAllo+ " || Allocation: " +allocation;
	}

	@Override
	public String toStringComplet() {
			return  "" +nom+ ", " +prenom+ ", " +dateInscri+
					", " +promo+ ", " +typAllo+ ", " +allocation+ 
				    ", " +nomEntreprise+ ", "
					+retards+ ", "+absences;
		}

	}
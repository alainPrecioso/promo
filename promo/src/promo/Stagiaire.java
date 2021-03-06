package promo;

import java.util.ArrayList;

public class Stagiaire extends Apprenant {
	
	protected String typAllo;
	protected String allocation;

	public Stagiaire() {
		
	}


	protected Stagiaire(String nom, String prenom, Integer annee, Integer mois, Integer jour,
			ArrayList<String> contacts, String promo, String nomEntreprise, String typAllo, String allocation) {
		
		super(nom, prenom, annee, mois, jour, contacts, promo, nomEntreprise);
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
		String str = prenom+ " " +nom+ " || Date inscription: " +dateInscri;
		if (alertAbsences == true || alertRetards == true) {
			str += " ALERTE";
		}
		return str;
	}

	@Override
	public String toStringComplet() {
		String str = prenom+ " " +nom+ ", " +dateInscri+
				", " +promo+ ", " +typAllo+ ", " +allocation+ 
			    "€, Stagiaire a " +nomEntreprise+ ", "
				+retards+ " minutes, "+absences + " jours";
		if (alertAbsences == true || alertRetards == true) {
			str += " ALERTE";
		}
			return str;
		}

	}
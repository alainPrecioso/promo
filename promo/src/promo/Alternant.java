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
		return "Alternant :\nSalaire -> " + salaire + "\t || Nom: \t" + nom + " ||\t Prenom: \t" + prenom + " ||\t Date inscription: \t" + dateInscri
				+ "\t || Promo: \t" + promo;
	}
	
	@Override
	public String toStringComplet() {
		return "Alternant [salaire=" + salaire + ", nom=" + nom + ", prenom=" + prenom + ", dateInscri=" + dateInscri
				+ ", contacts=" + contacts + ", nomEntreprise=" + nomEntreprise + ", retards=" + retards + ", absences="
				+ absences + ", promo=" + promo + ", alertAbscences=" + alertAbscences + "]";
	}
	



	
}
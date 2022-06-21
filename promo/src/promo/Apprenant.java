package promo;
import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Apprenant {
	
	protected String nom;
	protected String prenom;
	protected LocalDate dateInscri;
	protected ArrayList<String> contacts;
	protected String nomEntreprise;
	protected int retards; //minutes
	protected int absences; //jours
	protected String promo;
	protected boolean alertAbscences;
	protected String allocation;
	protected String typAllo;
	
	public Apprenant() {
		
	}
	
	
	public Apprenant(String nom, String prenom, Integer annee, Integer mois, Integer jour, ArrayList<String> contacts, String nomEntreprise,
			int retards, int absences, String promo) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateInscri = LocalDate.of(annee, mois, jour);
		this.contacts = contacts;
		this.nomEntreprise = nomEntreprise;
		this.retards = retards;
		this.absences = absences;
		this.promo = promo;
		this.allocation = allocation;
	}


	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public LocalDate getDateInscri() {
		return dateInscri;
	}
	public void setDateInscri(LocalDate dateInscri) {
		this.dateInscri = dateInscri;
	}
	public ArrayList<String> getContacts() {
		return contacts;
	}
	public void setContacts(ArrayList<String> contacts) {
		this.contacts = contacts;
	}
	public String getNomEntreprise() {
		return nomEntreprise;
	}
	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}
	public String getRetards() {
		String retardsString = Integer.toString(retards) + " minutes.";
		
		if (retards > 30) {
			retardsString += " Alerte retards";
		}
		
		
		return retardsString;
	}
	public void setRetards(int retards) {
		this.retards = retards;
	}
	
	public int getAbsences() {
		return absences;
	}
	
	public String getAbsencesAlerte() {
		String absencesString = Integer.toString(absences) + " jours.";
		
		if (alertAbscences == true) {
			absencesString += " Alerte abscences";
		}
		
		return absencesString;
	}
	public void setAsbsences(int asbsences) {
		this.absences = asbsences;
	}
	public String getPromo() {
		return promo;
	}
	public void setPromo(String promo) {
		this.promo = promo;
	}


	public boolean isAlertAbscences() {
		return alertAbscences;
	}


	public void setAlertAbscences(boolean alertAbscences) {
		this.alertAbscences = alertAbscences;
	}


	public void setAbsences(int absences) {
		this.absences = absences;
	}
	
	
	@Override
	public String toString() {
		return "Apprenant --> Nom: " + nom + "|| Prenom: " +prenom+ " || Date d'inscription " +dateInscri+ " || Promo: " +promo;
	}
	
	public String toStringComplet() {
		
		// TODO Auto-generated method stub
		return  "" +nom+ ", " +prenom+ ", " +dateInscri+
				", " +promo+ ", " +typAllo+ ", " +allocation+ 
			    ", " +nomEntreprise+ ", " +contacts+
				", " +retards+ ", " +absences;
	}
	
}

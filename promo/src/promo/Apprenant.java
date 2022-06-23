package promo;
import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Apprenant {
	
	protected String nom;
	protected String prenom;
	protected LocalDate dateInscri;
	protected ArrayList<String> contacts;
	protected String nomEntreprise;
	
	protected int retards = 0; //minutes
	protected int absences = 0; //jours
	protected boolean alertRetards;
	protected boolean alertAbsences;
	
	protected String promo;
	protected int duree;
	
	
	public Apprenant() {
		
	}
	
	public Apprenant(String nom, String prenom, Integer annee, Integer mois, Integer jour, ArrayList<String> contacts, String nomEntreprise) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateInscri = LocalDate.of(annee, mois, jour);
		this.contacts = contacts;
		this.nomEntreprise = nomEntreprise;
	}

	

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
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
	public int getRetards() {
		return retards;
	}
	public void setRetards(int retards) {
		this.retards = retards;
		if (this.retards >= 30) {
			this.alertRetards = true;
		}
	}
	
	public void addRetards(int retards) {
		this.retards += retards;
		if (this.retards >= 30) {
			this.alertRetards = true;
		}
	}
	
	public int getAbsences() {
		return absences;
	}
	
	public void setAbsences(int absences) {
		this.absences = absences;
		if (this.absences > this.duree * 0.1) {
			this.alertAbsences = true;
		}
	}
	public void addAbsences(int asbsences) {
		this.absences += asbsences;
		if (this.absences > this.duree * 0.1) {
			this.alertAbsences = true;
		}
	}
	public String getPromo() {
		return promo;
	}
	public void setPromo(String promo) {
		this.promo = promo;
	}


	public boolean isAlertAbsences() {
		return alertAbsences;
	}


	public void setAlertAbscences(boolean alertAbscences) {
		this.alertAbsences = alertAbscences;
	}

	
	public boolean isAlertRetards() {
		return alertRetards;
	}

	public void setAlertRetards(boolean alertRetards) {
		this.alertRetards = alertRetards;
	}

	public void setAlertAbsences(boolean alertAbsences) {
		this.alertAbsences = alertAbsences;
	}

	@Override
	public String toString() {
		return "Apprenant --> Nom: " + nom + "|| Prenom: " +prenom+ " || Date d'inscription " +dateInscri+ " || Promo: " +promo;
	}
	
	public String toStringComplet() {
		
		// TODO Auto-generated method stub
		return  "" +nom+ ", " +prenom+ ", " +dateInscri+
				", " +promo+ ", " +nomEntreprise+ ", " +contacts+
				", " +retards+ ", " + absences;
	}
	
}


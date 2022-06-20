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
	protected int asbsences; //jours
	protected String promo;
	
	public Apprenant() {
		
	}
	
	
	public Apprenant(String nom, String prenom, LocalDate dateInscri, ArrayList<String> contacts, String nomEntreprise,
			int retards, int asbsences, String promo) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateInscri = dateInscri;
		this.contacts = contacts;
		this.nomEntreprise = nomEntreprise;
		this.retards = retards;
		this.asbsences = asbsences;
		this.promo = promo;
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
	}
	public int getAsbsences() {
		return asbsences;
	}
	public void setAsbsences(int asbsences) {
		this.asbsences = asbsences;
	}
	public String getPromo() {
		return promo;
	}
	public void setPromo(String promo) {
		this.promo = promo;
	}
	
	
	
	
	

}

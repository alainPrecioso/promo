package promo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Promo {
	private ArrayList<Apprenant> eleve = new ArrayList<Apprenant>();
	// Instance two variables of types String
	private String nomPromo;
	private LocalDate dateDebut;

	
	
	// generate ArrayList
	public Promo(ArrayList<Apprenant> eleve, String nomPromo, LocalDate dateDebut) {
		super();
		this.eleve = eleve;
		this.nomPromo = nomPromo;
		this.dateDebut = dateDebut;
	}
	//Generate getters and setters
	public ArrayList<Apprenant> getEleve() {
		return eleve;
	}

	public void setEleve(ArrayList<Apprenant> eleve) {
		this.eleve = eleve;
	}

	public String getNomPromo() {
		return nomPromo;
	}

	public void setNomPromo(String nomPromo) {
		this.nomPromo = nomPromo;
	}

	public LocalDate getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Promo() {
		// TODO Auto-generated constructor stub
	
	}
// Generate methode toString
	@Override
	public String toString() {
		return "Promo [eleve=" + eleve + ", nomPromo=" + nomPromo + ", dateDebut=" + dateDebut + "]";
	}
	
	
	}


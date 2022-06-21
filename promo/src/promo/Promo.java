package promo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Promo {
	private ArrayList<Apprenant> eleve = new ArrayList<Apprenant>();
	// Instance two variables of types String
	private String nomPromo;
	private LocalDate dateDebut;

	
	
<<<<<<< HEAD
	// generate ArrayList
	public Promo(ArrayList<Apprenant> eleve, String nomPromo, LocalDate dateDebut) {
		super();
=======
	
	
	public Promo(ArrayList<Apprenant> eleve, String nomPromo, Integer annee, Integer mois, Integer jour, Integer duree) {
>>>>>>> refs/heads/develop
		this.eleve = eleve;
		this.nomPromo = nomPromo;
<<<<<<< HEAD
		this.dateDebut = dateDebut;
=======
		this.dateDebut = LocalDate.of(annee, mois, jour);
		this.duree = duree;
>>>>>>> refs/heads/develop
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
	
<<<<<<< HEAD
=======
	public void abscenceCheck() {
		for (Apprenant apprenant : eleve) {
			if (apprenant.getAbsences() > (double)( duree * 0.1 )) {
				apprenant.setAlertAbscences(true);
			}
		}
	}

	
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

	@Override
	public String toString() {
		return "Promo=" + nomPromo + ", dateDebut=" + dateDebut + ", duree=" + duree;
	}
	
	
>>>>>>> refs/heads/develop
	
	}


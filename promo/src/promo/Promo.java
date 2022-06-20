package promo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Promo {
	private ArrayList<Apprenant> eleve = new ArrayList<Apprenant>();
	
	private String nomPromo;
	private LocalDate dateDebut;
	private Integer duree;
	
	
	
	
	public Promo(ArrayList<Apprenant> eleve, String nomPromo, Integer annee, Integer mois, Integer jour, Integer duree) {
		this.eleve = eleve;
		this.nomPromo = nomPromo;
		this.dateDebut = LocalDate.of(annee, mois, jour);
		this.duree = duree;
	}
	
	public Promo() {
		// TODO Auto-generated constructor stub
	
	}
	public Integer getDuree() {
		return duree;
	}
	public void setDuree(Integer duree) {
		this.duree = duree;
	}
	
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
	
	
	

}

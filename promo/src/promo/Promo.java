package promo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Promo {
	private ArrayList<Apprenant> eleve = new ArrayList<Apprenant>();
	
	private String nomPromo;
	private LocalDate dateDebut;
	private Integer duree;
	
	
	
	
	public Promo(ArrayList<Apprenant> eleve, String nomPromo, LocalDate dateDebut, Integer duree) {
		super();
		this.eleve = eleve;
		this.nomPromo = nomPromo;
		this.dateDebut = dateDebut;
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
	

}

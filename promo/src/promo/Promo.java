package promo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Promo {
	private ArrayList<Apprenant> eleve = new ArrayList<Apprenant>();
	
	private String nomPromo;
	private LocalDate dateDebut;
	
	
	
	
	public Promo(ArrayList<Apprenant> eleve, String nomPromo, LocalDate dateDebut) {
		super();
		this.eleve = eleve;
		this.nomPromo = nomPromo;
		this.dateDebut = dateDebut;
	}
	}
	public Promo() {
		// TODO Auto-generated constructor stub
	
	}
	
	}
}

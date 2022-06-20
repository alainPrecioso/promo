package promo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Stagiaire extends Apprenant {
	
	protected String typAllo;
	protected Double allocation;

	public Stagiaire() {
		
	}

	public Stagiaire(String nom, String prenom, LocalDate dateInscri, ArrayList<String> contacts, String typAllo, Double allocation) {
		super();
		this.typAllo = typAllo;
		this.allocation = allocation;
	}

	@Override
	public String toString() {
		return "Stagiaire [TypAllo=" + typAllo + ", Allocation=" + allocation + "]";
	}

}

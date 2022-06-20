package promo;

public class Alternant {
	protected String salaire;

	public Alternant() {
		
	}

	public Alternant(String salaire) {
		super();
		this.salaire = salaire;
	}

	protected String getSalaire() {
		return salaire;
	}

	protected void setSalaire(String salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Alternant [Salaire=" + salaire + "]";
	}

}

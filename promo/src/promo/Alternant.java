package promo;

public class Alternant {
	protected String salaire;

	public Alternant() {
		
	}

	public Alternant(String salaire) {
		super();
		salaire = salaire;
	}

	@Override
	public String toString() {
		return "Alternant [Salaire=" + salaire + "]";
	}

}

package promo;

public class Alternant {
	protected String Salaire;

	public Alternant() {
		
	}

	public Alternant(String salaire) {
		super();
		Salaire = salaire;
	}

	@Override
	public String toString() {
		return "Alternant [Salaire=" + Salaire + "]";
	}

}

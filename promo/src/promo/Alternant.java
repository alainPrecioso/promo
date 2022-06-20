package promo;

public class Alternant {
	String Salaire;

	public Alternant() {
		
	}

	protected Alternant(String salaire) {
		super();
		Salaire = salaire;
	}

	@Override
	public String toString() {
		return "Alternant [Salaire=" + Salaire + "]";
	}

}

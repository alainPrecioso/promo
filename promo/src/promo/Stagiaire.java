package promo;

public class Stagiaire {
	
	protected String TypAllo;
	protected Double Allocation;

	public Stagiaire() {
		
	}

	public Stagiaire(String typAllo, Double allocation) {
		super();
		TypAllo = typAllo;
		Allocation = allocation;
	}

	@Override
	public String toString() {
		return "Stagiaire [TypAllo=" + TypAllo + ", Allocation=" + Allocation + "]";
	}

}

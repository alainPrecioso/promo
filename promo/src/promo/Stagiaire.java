package promo;

public class Stagiaire {
	
	protected String typAllo;
	protected Double allocation;

	public Stagiaire() {
		
	}

	public Stagiaire(String typAllo, Double allocation) {
		super();
		typAllo = typAllo;
		allocation = allocation;
	}

	@Override
	public String toString() {
		return "Stagiaire [TypAllo=" + typAllo + ", Allocation=" + allocation + "]";
	}

}

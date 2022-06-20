package promo;

public class Stagiaire {
	
	protected String typAllo;
	protected Double allocation;

	public Stagiaire() {
		
	}

	public Stagiaire(String typAllo, Double allocation) {
		super();
		this.typAllo = typAllo;
		this.allocation = allocation;
	}

	protected String getTypAllo() {
		return typAllo;
	}

	protected void setTypAllo(String typAllo) {
		this.typAllo = typAllo;
	}

	protected Double getAllocation() {
		return allocation;
	}

	protected void setAllocation(Double allocation) {
		this.allocation = allocation;
	}

	@Override
	public String toString() {
		return "Stagiaire [TypAllo=" + typAllo + ", Allocation=" + allocation + "]";
	}

}

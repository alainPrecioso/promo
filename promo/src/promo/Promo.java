package promo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Promo {
	private ArrayList<Apprenant> eleve = new ArrayList<Apprenant>();
	
	protected String nomPromo;
	private LocalDate dateDebut;
	private int duree;
	
	
	
	
	public Promo(ArrayList<Apprenant> eleve, String nomPromo, Integer annee, Integer mois, Integer jour, Integer duree) {
		this.eleve = eleve;
		this.nomPromo = nomPromo;
		this.dateDebut = LocalDate.of(annee, mois, jour);
		this.duree = duree;
	}
	
	
	public Promo() {
		// TODO Auto-generated constructor stub
	
	}
	public Promo(String nomPromo, Integer annee, Integer mois, Integer jour, Integer duree) {
		this.nomPromo = nomPromo;
		this.dateDebut = LocalDate.of(annee, mois, jour);
		this.duree = duree;
		}
	
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	
	public void abscenceCheck() {
		for (Apprenant apprenant : eleve) {
			if (apprenant.getAbsences() > (double)( duree * 0.1 )) {
				apprenant.setAlertAbscences(true);
			}
		}
	}

	
	public ArrayList<Apprenant> getEleve() {
		return eleve;
	}

	public void setEleve(ArrayList<Apprenant> eleve) {
		this.eleve = eleve;
	}

	public String getNomPromo() {
		return nomPromo;
	}

	public void setNomPromo(String nomPromo) {
		this.nomPromo = nomPromo;
	}

	public LocalDate getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	public void addEleve(Apprenant apprenant) {
		this.eleve.add(apprenant);
	}
	
	@Override
	public String toString() {
		return nomPromo + " || DateDebut : " + dateDebut + " || Duree : " + duree +
				" jours, " + nbJoursSemaine(dateDebut.atStartOfDay(), LocalDate.now().atStartOfDay()) + " passés, " + 
				String.valueOf(duree - Integer.valueOf(nbJoursSemaine(dateDebut.atStartOfDay(), LocalDate.now().atStartOfDay()))) + " restants";
	}
	
	public static String nbJoursSemaine(LocalDateTime startDate, LocalDateTime endDate) {
		Predicate<LocalDateTime> isWeekend = date -> date.getDayOfWeek() != DayOfWeek.SATURDAY && date.getDayOfWeek() != DayOfWeek.SUNDAY;

	    long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

	    List<LocalDateTime> list = Stream.iterate(startDate, date -> date.plusDays(1)).limit(daysBetween).filter(isWeekend).collect(Collectors.toList());

	    return String.valueOf(list.size());
	}
	
}
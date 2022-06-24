package promo;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import utils.PSort;
import utils.Ser;


public class MainFrame extends JFrame {

	
	JPanel contentPane; //panneau principal
	JComboBox comboBox; //menu déroulant qui contiendra les promos
	DefaultComboBoxModel promoBox; //model pour le menu déroulant
	//chargement de la database
	ArrayList<Promo> promos = PSort.sort((ArrayList<Promo>) Ser.load("promos.xml"));
	JList detailedList; //infos détaillés d'un apprenant
	JTextField textField; //field pour entrer les retards ou absences
	Integer spot; //variable qui pointe vers l'indexe d'élève dans sa promo
	Promo affichagePromo; //variable qui stock la promo récupéré dans le menu déroulant
	JLabel timeLabel = new JLabel(""); //label qui affichera les jours passés et restants
	JButton retardButton; //boutton pour ajouter un retard
	JButton absenceButton;//boutton pour ajouter une absence

	//point d'entrée de l'application
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame mainFrame = new MainFrame();
					mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1149, 527);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panelN = new JPanel();
		contentPane.add(panelN, BorderLayout.NORTH);
		panelN.setLayout(new BorderLayout(0, 0));

		DefaultListModel model = new DefaultListModel();
		JList generalJList = new JList(model);
		generalJList.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent evt) {
				printApprenant(generalJList);
			}
		});
		
		panelN.add(generalJList, BorderLayout.SOUTH);

		promoBox = new DefaultComboBoxModel(promos.toArray());
		comboBox = new JComboBox(promoBox);
		panelN.add(comboBox, BorderLayout.NORTH);
		comboBox.setSelectedIndex(-1);
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printPromo(model, panelN);

			}
		});
		
		JPanel panel = new JPanel();
		panelN.add(panel, BorderLayout.EAST);
		
		JButton alertesButton = new JButton("Alertes");
		alertesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printAlertes(model);
			}
		});
		panel.add(alertesButton);
		
		JPanel panelNewPromo = new JPanel();
		panelN.add(panelNewPromo, BorderLayout.WEST);
		
		JButton newPromo = new JButton("Création promo");
		panelNewPromo.add(newPromo);
		newPromo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							NFenetre frame = new NFenetre();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				((MainFrame) ((Component)e.getSource()).getParent().getParent().getParent().getParent().getParent().getParent()).dispose();
				
			}
		});
		
		JButton newApprenant = new JButton("Création Apprenant");
		panelNewPromo.add(newApprenant);
		newApprenant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							EleveFenetre frame = new EleveFenetre();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				((MainFrame) ((Component)e.getSource()).getParent().getParent().getParent().getParent().getParent().getParent()).dispose();
			}
		});
		
		panelN.add(timeLabel, BorderLayout.CENTER);
		
		
		
		
		
		
		

		JPanel panelS = new JPanel();
		contentPane.add(panelS, BorderLayout.SOUTH);
		panelS.setLayout(new BorderLayout(0, 0));
		
		detailedList = new JList();
		panelS.add(detailedList, BorderLayout.SOUTH);
		
		JPanel panelSC = new JPanel();
		panelS.add(panelSC, BorderLayout.CENTER);
		
		textField = new JTextField();
		textField.setVisible(false);
		panelSC.add(textField);
		textField.setColumns(10);
		
		retardButton = new JButton("Ajout Retard");
		retardButton.setVisible(false);
		retardButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				promos.get(comboBox.getSelectedIndex()).getEleve().get(spot).addRetards(Integer.valueOf(textField.getText()));
				printApprenant(generalJList);
				Ser.save("promos", promos);
			}
		});
		panelSC.add(retardButton);
		
		absenceButton = new JButton("Ajout Absence");
		absenceButton.setVisible(false);
		absenceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				promos.get(comboBox.getSelectedIndex()).getEleve().get(spot).addAbsences(Integer.valueOf(textField.getText()));
				printApprenant(generalJList);
				Ser.save("promos", promos);
			}
		});
		panelSC.add(absenceButton);
		
		
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void printAlertes (DefaultListModel model) {
		model.clear();
		timeLabel.setText("");
		for (Promo promo : promos) {
			for (Apprenant apprenant : promo.getEleve()) {
				if (apprenant.isAlertAbsences() == true || apprenant.isAlertRetards() == true) {
					model.addElement(apprenant);
				}
			}
		}
		
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void printPromo(DefaultListModel model, JPanel panelN) {
		affichagePromo = (Promo) comboBox.getSelectedItem();
		model.clear();
		model.addAll(affichagePromo.getEleve());
		//generalJList.setListData(afficherPromo.getEleve().toArray());
		String jr = nbJoursSemaine(affichagePromo.getDateDebut().atStartOfDay(), LocalDate.now().atStartOfDay());
		String jr2 = String.valueOf(affichagePromo.getDuree() - Integer.valueOf(jr));
		timeLabel.setText(jr + " jours passés, " + jr2 + " jours restants");
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void printApprenant(JList generalJList) {
		textField.setVisible(true);
		retardButton.setVisible(true);
		absenceButton.setVisible(true);
		ArrayList<String> selectedApprenant = new ArrayList<String>();
		Object selApp = (Apprenant)  generalJList.getSelectedValuesList().get(0);
		if (selApp instanceof Stagiaire) {
			Stagiaire app = (Stagiaire) selApp;
			selectedApprenant.add(app.toStringComplet());
			selectedApprenant.addAll(app.getContacts());
		}
		if (selApp instanceof Alternant) {
			Alternant app = (Alternant) selApp;
			selectedApprenant.add(app.toStringComplet());
			selectedApprenant.addAll(app.getContacts());
		}
		//selectedApprenant.add(selApp.toStringComplet());
		spot = generalJList.getSelectedIndex();
		
		detailedList.setListData(selectedApprenant.toArray());
	}
	
	
	
	public static String nbJoursSemaine(LocalDateTime startDate, LocalDateTime endDate) {
		Predicate<LocalDateTime> isWeekend = date -> date.getDayOfWeek() != DayOfWeek.SATURDAY && date.getDayOfWeek() != DayOfWeek.SUNDAY;

	    long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

	    List<LocalDateTime> list = Stream.iterate(startDate, date -> date.plusDays(1)).limit(daysBetween).filter(isWeekend).collect(Collectors.toList());

	    return String.valueOf(list.size());
	    
		
	}
}
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
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import utils.PSort;
import utils.Ser;


public class MainFrame extends JFrame {

	//attributs de MainFrame
	private JPanel contentPane; //panneau principal
	private JComboBox comboBox; //menu déroulant qui contiendra les promos
	private DefaultComboBoxModel promoBox; //model pour le menu déroulant
	//chargement et tri de la database
	private ArrayList<Promo> promos = PSort.sort((ArrayList<Promo>) Ser.load("promos.xml"));
	private JList detailedList; //infos détaillés d'un apprenant
	private JTextField textField; //field pour entrer les retards ou absences
	private Promo affichagePromo; //variable qui stock la promo récupéré dans le menu déroulant
	private JLabel timeLabel = new JLabel(""); //label qui affichera les jours passés et restants
	private JButton retardButton; //boutton pour ajouter un retard
	private JButton absenceButton;//boutton pour ajouter une absence


	//constructeur de MainFrame
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1149, 527);
		contentPane = new JPanel(); //panel principal
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		//panel Nord, contient le menu déroulant, la liste des élèves, les boutons d'ajouts et d'alerte
		JPanel panelN = new JPanel();
		contentPane.add(panelN, BorderLayout.NORTH);
		panelN.setLayout(new BorderLayout(0, 0));

		DefaultListModel model = new DefaultListModel();// model pour la JList
		JList generalJList = new JList(model);
		//MouseListener qui lance printApprenant() quand on click dans la liste
		generalJList.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent evt) {
				printApprenant(generalJList); //method qui affiche les infos détaillées d'un apprenant 
			}
		});
		JScrollPane jScrollPane = new JScrollPane(generalJList);
		panelN.add(jScrollPane, BorderLayout.SOUTH);
		promoBox = new DefaultComboBoxModel(promos.toArray());
		comboBox = new JComboBox(promoBox);
		panelN.add(comboBox, BorderLayout.NORTH);
		comboBox.setSelectedIndex(-1); //permet d'afficher le menu déroulant vide au démarrage
		//ActionListener qui lance printPromo() quand on choisit un element dans le menu déroulant
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printPromo(model, panelN); //method qui affiche les élèves de la promo séléctionnée

			}
		});
		
		//panel pour ranger le boutton alerte
		JPanel panel = new JPanel();
		panelN.add(panel, BorderLayout.EAST);
		
		//boutton pour afficher tous les élèves qui sont flagués pour retards ou absences
		JButton alertesButton = new JButton("Alertes");
		alertesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printAlertes(model);
			}
		});
		panel.add(alertesButton);
		
		JPanel panelNewPromo = new JPanel();
		panelN.add(panelNewPromo, BorderLayout.WEST);
		
		//"JButton newPromo" what else is there to say?
		JButton newPromo = new JButton("Création promo");
		panelNewPromo.add(newPromo);
		newPromo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//création d'un nouvel objet NFenetre
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
				//fermeture de la MainFrame
				((MainFrame) ((Component)e.getSource()).getParent().getParent().getParent().getParent().getParent().getParent()).dispose();
				
			}
		});
		
		// "JButton newApprenant" see above
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

		//panneau au Sud du panneau principal
		JPanel panelS = new JPanel();
		contentPane.add(panelS, BorderLayout.SOUTH);
		panelS.setLayout(new BorderLayout(0, 0));
		
		detailedList = new JList(); //liste qui contendra les infos détaillés d'un apprenant
		panelS.add(detailedList, BorderLayout.SOUTH);
		
		//panneau qui contiendra la zone de texte et les bouttons pour les retards/absences
		JPanel panelSC = new JPanel(); 
		panelS.add(panelSC, BorderLayout.CENTER);
		
		textField = new JTextField(); //zone de texte pour ajout de retard/absence
		textField.setVisible(false);
		panelSC.add(textField);
		textField.setColumns(10);
		
		//self explanatory
		retardButton = new JButton("Ajout Retard");
		retardButton.setVisible(false);
		retardButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ajoute le retard entré dans la zone de texte à l'élève puis sauvegarde
				promos.get(comboBox.getSelectedIndex()).getEleve().get(generalJList.getSelectedIndex()).addRetards(Integer.valueOf(textField.getText()));
				printApprenant(generalJList);
				Ser.save("promos", promos);
			}
		});
		panelSC.add(retardButton);
		
		//see above
		absenceButton = new JButton("Ajout Absence");
		absenceButton.setVisible(false);
		absenceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ajoute l'absence entrée dans la zone de texte à l'élève puis sauvegarde
				promos.get(comboBox.getSelectedIndex()).getEleve().get(generalJList.getSelectedIndex()).addAbsences(Integer.valueOf(textField.getText()));
				printApprenant(generalJList);
				Ser.save("promos", promos);
			}
		});
		panelSC.add(absenceButton);
		
		
	}

	//method qui affiche une liste de tous les apprenants flagués pour retard/absence
	private void printAlertes (DefaultListModel model) {
		model.clear(); //vide la liste
		timeLabel.setText(""); //vide l'affichage temps passé
		for (Promo promo : promos) { //pour chaque Promo dans promos
			for (Apprenant apprenant : promo.getEleve()) {// pour chaque Apprenant dans la promo
				//si l'apprenant est flagué
				if (apprenant.isAlertAbsences() == true || apprenant.isAlertRetards() == true) {
					model.addElement(apprenant); //ajouter l'Apprenant au modèle
				}
			}
		}
		
	}
	
	//method qui récupère la promo séléctionnée dans le menu déroulant pour afficher ses élèves
	private void printPromo(DefaultListModel model, JPanel panelN) {
		affichagePromo = (Promo) comboBox.getSelectedItem();
		model.clear();
		model.addAll(affichagePromo.getEleve());
		//string pour afficher les jours passés et restants dans la formation
		String jr = nbJoursSemaine(affichagePromo.getDateDebut().atStartOfDay(), LocalDate.now().atStartOfDay());
		String jr2 = String.valueOf(affichagePromo.getDuree() - Integer.valueOf(jr));
		timeLabel.setText(jr + " jours passés, " + jr2 + " jours restants");
	}
	
	//method pour afficher les infos détaillés d'un apprenant
	private void printApprenant(JList generalJList) {
		//affiche les boutons retards/absences
		textField.setVisible(true);
		retardButton.setVisible(true);
		absenceButton.setVisible(true);
		//liste à afficher dans la jlist
		ArrayList<String> selectedApprenant = new ArrayList<String>();
		//récupère l'apprenant selectionné
		Apprenant selApp = (Apprenant)  generalJList.getSelectedValuesList().get(0); //si plusieurs sélectionnés, ne prend que le premier
		selectedApprenant.add(selApp.toStringComplet());//ajoute le string d'infos détaillés
		selectedApprenant.addAll(selApp.getContacts());//ajoute tous les contacts
		detailedList.setListData(selectedApprenant.toArray());//affiche
	}
	
	
	//compte les jours entre deux dates et filtre les weekends
	private static String nbJoursSemaine(LocalDateTime startDate, LocalDateTime endDate) {
		//prédicat de dates qui sont true si leur jour de semaine n'est ni samedi ni dimanche
		Predicate<LocalDateTime> isWeekend = date -> date.getDayOfWeek() != DayOfWeek.SATURDAY && date.getDayOfWeek() != DayOfWeek.SUNDAY;
		//compte le nombre de jours entre les deux dates pour arrêter le stream
		long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
		//step 1 : crée une liste de dates, step 2 : ???, step 3 : profit!
	    List<LocalDateTime> list = Stream.iterate(startDate, date -> date.plusDays(1)).limit(daysBetween).filter(isWeekend).collect(Collectors.toList());
	    //return la size de la liste qui contient tous les jours qui ne sont ni samedi ni dimanche
	    return String.valueOf(list.size());
	    
		
	}
}
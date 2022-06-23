package promo;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Window;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import utils.PSort;
import utils.Ser;

import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.MutableComboBoxModel;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;


public class MainFrame extends JFrame {

	JPanel contentPane;
	JComboBox comboBox;
	ArrayList<Promo> promos = PSort.sort((ArrayList<Promo>) Ser.load("promos.xml"));
	JList detailedList;
	JTextField textField;
	Integer spot;
	Promo affichagePromo;
	JLabel elapsedTime = new JLabel();
	JButton retardButton;
	JButton absenceButton;

	/**
	 * Launch the application.
	 */
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


		comboBox = new JComboBox(promos.toArray());
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
		
		JButton newApprenant = new JButton("Création Apprenant");
		panelNewPromo.add(newApprenant);
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

	public void printAlertes (DefaultListModel model) {
		model.clear();
		elapsedTime.setText("");
		for (Promo promo : promos) {
			for (Apprenant apprenant : promo.getEleve()) {
				if (apprenant.isAlertAbsences() == true || apprenant.isAlertRetards() == true) {
					model.addElement(apprenant);
				}
			}
		}
		
	}
	public void printPromo(DefaultListModel model, JPanel panelN) {
		affichagePromo = (Promo) comboBox.getSelectedItem();
		model.clear();
		model.addAll(affichagePromo.getEleve());
		//generalJList.setListData(afficherPromo.getEleve().toArray());
		elapsedTime.setText(nbJoursSemaine(affichagePromo.getDateDebut().atStartOfDay(), LocalDate.now().atStartOfDay()) + " jours");
		panelN.add(elapsedTime, BorderLayout.WEST);
	}
	
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
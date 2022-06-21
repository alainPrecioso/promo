package promo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	JComboBox comboBox;
	ArrayList<Promo> promos = new ArrayList<Promo>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
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

		JList generalJList = new JList();
		panelN.add(generalJList, BorderLayout.SOUTH);



		promos.add(genererPromo());
		promos.add(genererPromo2());
		comboBox = new JComboBox(promos.toArray());
		panelN.add(comboBox, BorderLayout.NORTH);

		JButton afficherPromo = new JButton("Afficher Promo");
		afficherPromo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Promo afficherPromo = (Promo) comboBox.getSelectedItem();
				generalJList.setListData(afficherPromo.getEleve().toArray());

			}
		});
		panelN.add(afficherPromo, BorderLayout.EAST);

		JPanel panelS = new JPanel();
		contentPane.add(panelS, BorderLayout.SOUTH);

		JPanel panelW = new JPanel();
		contentPane.add(panelW, BorderLayout.WEST);

		JPanel panelC = new JPanel();
		contentPane.add(panelC, BorderLayout.CENTER);

		JPanel panelE = new JPanel();
		contentPane.add(panelE, BorderLayout.EAST);
	}

	public Promo genererPromo() {
		ArrayList<String> contact = new ArrayList<String>();
		ArrayList<Apprenant> list = new ArrayList<Apprenant>();
		list.add(new Alternant("java", "john", 2022, 04, 01, contact, "optimus", 0, 0, "java", "2500"));
		list.add(new Alternant("jones", "boby", 2022, 03, 01, contact, "domédia", 0, 0, "java", "1800"));
		list.add(new Alternant("bertrand", "rene", 2022, 05, 01, contact, "lava", 0, 0, "java", "1500"));
		list.add(new Alternant("michel", "jacky", 2022, 04, 01, contact, "biotech", 0, 0, "java", "1650"));
		list.add(new Alternant("petit", "dilan", 2022, 03, 01, contact, "eureka", 0, 0, "java", "1977"));

		list.add(new Stagiaire("kurilenko", "olga", 2022, 04, 01, contact, "optimus",0,0, "java","are", 1010));
		list.add(new Stagiaire("boutin", "louis", 2022, 07, 01, contact, "optimus", 0, 0, "java","aref", 1101));
		list.add(new Stagiaire("ceasar", "harry", 2022, 05, 01, contact, "optimus", 0, 0, "java","are", 1200));
		list.add(new Stagiaire("stark", "aria", 2022, 04, 01, contact, "optimus", 0, 0, "java", "are", 1300));
		list.add(new Stagiaire("bella", "erika", 2022, 04, 01, contact, "optimus", 0, 0, "java", "aref", 1360));
		Promo promo = new Promo(list, "Java", 2022, 05, 02, 120);
		return promo;
	}
	public Promo genererPromo2() {
		ArrayList<String> contact = new ArrayList<String>();
		ArrayList<Apprenant> list = new ArrayList<Apprenant>();
		list.add(new Alternant("php", "john", 2022, 04, 01, contact, "optimus", 0, 0, "java", "2500"));
		list.add(new Alternant("jones", "boby", 2022, 03, 01, contact, "domédia", 0, 0, "java", "1800"));
		list.add(new Alternant("bertrand", "rene", 2022, 05, 01, contact, "lava", 0, 0, "java", "1500"));
		list.add(new Alternant("michel", "jacky", 2022, 04, 01, contact, "biotech", 0, 0, "java", "1650"));
		list.add(new Alternant("petit", "dilan", 2022, 03, 01, contact, "eureka", 0, 0, "java", "1977"));

		list.add(new Stagiaire("kurilenko", "olga", 2022, 04, 01, contact, "optimus",0,0, "java","are", 1010));
		list.add(new Stagiaire("boutin", "louis", 2022, 07, 01, contact, "optimus", 0, 0, "java","aref", 1101));
		list.add(new Stagiaire("ceasar", "harry", 2022, 05, 01, contact, "optimus", 0, 0, "java","are", 1200));
		list.add(new Stagiaire("stark", "aria", 2022, 04, 01, contact, "optimus", 0, 0, "java", "are", 1300));
		list.add(new Stagiaire("bella", "erika", 2022, 04, 01, contact, "optimus", 0, 0, "java", "aref", 1360));
		Promo promo = new Promo(list, "PHP", 2022, 05, 02, 120);
		return promo;
	}

}
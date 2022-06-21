package promo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import utils.Ser;

import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	JComboBox comboBox;
	ArrayList<Promo> promos = (ArrayList<Promo>) Ser.load("promos.xml");
	JList detailedList;

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
<<<<<<< HEAD



		promos.add(genererPromo());
		promos.add(genererPromo2());
=======
		
		
		
		//promos.add(genererPromo());
		//promos.add(genererPromo2());
>>>>>>> refs/heads/alain
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
<<<<<<< HEAD

=======
		
		JButton afficherApprenant = new JButton("Infos complètes");
		afficherApprenant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Object> list = new ArrayList<Object>();
				list.add(generalJList.getSelectedValuesList().get(0));
				Integer spot = generalJList.getSelectedIndex();
				detailedList.setListData(list.toArray());
			}
		});
		panelS.setLayout(new BorderLayout(0, 0));
		panelS.add(afficherApprenant, BorderLayout.EAST);
		
		detailedList = new JList();
		panelS.add(detailedList, BorderLayout.SOUTH);
		
>>>>>>> refs/heads/alain
		JPanel panelW = new JPanel();
		contentPane.add(panelW, BorderLayout.WEST);

		JPanel panelC = new JPanel();
		contentPane.add(panelC, BorderLayout.CENTER);
<<<<<<< HEAD

=======
		panelC.setLayout(new BorderLayout(0, 0));
		
>>>>>>> refs/heads/alain
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

<<<<<<< HEAD
		list.add(new Stagiaire("kurilenko", "olga", 2022, 04, 01, contact, "stardust",0,0, "java","are", 1010));
		list.add(new Stagiaire("boutin", "louis", 2022, 07, 01, contact, "tesla", 0, 0, "java","aref", 1101));
		list.add(new Stagiaire("ceasar", "harry", 2022, 05, 01, contact, "air-France", 0, 0, "java","are", 1200));
		list.add(new Stagiaire("stark", "aria", 2022, 04, 01, contact, "sentinel", 0, 0, "java", "are", 1300));
		list.add(new Stagiaire("bella", "erika", 2022, 04, 01, contact, "lexmark", 0, 0, "java", "aref", 1360));
=======
		list.add(new Stagiaire("kurilenko", "olga", 2022, 04, 01, contact, "optimus",0,0, "java","are", "1010"));
		list.add(new Stagiaire("boutin", "louis", 2022, 07, 01, contact, "optimus", 0, 0, "java","aref", "1101"));
		list.add(new Stagiaire("ceasar", "harry", 2022, 05, 01, contact, "optimus", 0, 0, "java","are", "1200"));
		list.add(new Stagiaire("stark", "aria", 2022, 04, 01, contact, "optimus", 0, 0, "java", "are", "1300"));
		list.add(new Stagiaire("bella", "erika", 2022, 04, 01, contact, "optimus", 0, 0, "java", "aref", "1360"));
>>>>>>> refs/heads/alain
		Promo promo = new Promo(list, "Java", 2022, 05, 02, 120);
		return promo;
	}
	public Promo genererPromo2() {
		ArrayList<String> contact = new ArrayList<String>();
		ArrayList<Apprenant> list = new ArrayList<Apprenant>();
		
		list.add(new Alternant("Mathews", "john", 2022, 04, 01, contact, "badam", 0, 0, "php", "2500"));
		list.add(new Alternant("robert", "bertrand", 2022, 03, 01, contact, "derby", 0, 0, "php", "1800"));
		list.add(new Alternant("chino", "sun", 2022, 05, 01, contact, "lenovo", 0, 0, "php", "1500"));
		list.add(new Alternant("baccardi", "ruiz", 2022, 04, 01, contact, "asus", 0, 0, "php", "1650"));
		list.add(new Alternant("musk", "elona", 2022, 03, 01, contact, "msi", 0, 0, "php", "1977"));

<<<<<<< HEAD
		list.add(new Stagiaire("kane", "youri", 2022, 04, 01, contact, "hp",0,0, "php","are", 1010));
		list.add(new Stagiaire("neron", "baptiste", 2022, 07, 01, contact, "apple", 0, 0, "php","aref", 1101));
		list.add(new Stagiaire("sismondi", "julius", 2022, 05, 01, contact, "microsoft", 0, 0, "php","are", 1200));
		list.add(new Stagiaire("albon", "albius", 2022, 04, 01, contact, "razer", 0, 0, "php", "are", 1300));
		list.add(new Stagiaire("chlass", "dominic", 2022, 04, 01, contact, "cci", 0, 0, "php", "aref", 1360));
=======
		list.add(new Stagiaire("kurilenko", "olga", 2022, 04, 01, contact, "optimus",0,0, "java","are", "1010"));
		list.add(new Stagiaire("boutin", "louis", 2022, 07, 01, contact, "optimus", 0, 0, "java","aref", "1101"));
		list.add(new Stagiaire("ceasar", "harry", 2022, 05, 01, contact, "optimus", 0, 0, "java","are", "1200"));
		list.add(new Stagiaire("stark", "aria", 2022, 04, 01, contact, "optimus", 0, 0, "java", "are", "1300"));
		list.add(new Stagiaire("bella", "erika", 2022, 04, 01, contact, "optimus", 0, 0, "java", "aref", "1360"));
>>>>>>> refs/heads/alain
		Promo promo = new Promo(list, "PHP", 2022, 05, 02, 120);
		return promo;
	}

}
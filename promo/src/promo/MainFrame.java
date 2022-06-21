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
		
		JPanel panelW = new JPanel();
		contentPane.add(panelW, BorderLayout.WEST);

		JPanel panelC = new JPanel();
		contentPane.add(panelC, BorderLayout.CENTER);
		panelC.setLayout(new BorderLayout(0, 0));
		JPanel panelE = new JPanel();
		contentPane.add(panelE, BorderLayout.EAST);
	}


}
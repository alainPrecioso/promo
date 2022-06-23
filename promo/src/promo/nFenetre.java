package promo;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import javax.swing.SwingUtilities;

import java.awt.Color;
import java.awt.Component;

import javax.swing.border.LineBorder;

import utils.PSort;
import utils.Ser;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Window;
import java.time.LocalDate;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class nFenetre extends JFrame {
	
	ArrayList<Promo> promos = (ArrayList<Promo>) Ser.load("promos.xml");
	private JPanel contentPane;
	private JTextField dureeField;
	private JTextField nameField;
	private JButton save;
	private JTextPane txtpnNouvellePromotion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nFenetre frame = new nFenetre();
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
	public nFenetre() {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
	
		nameField = new JTextField();
		nameField.setToolTipText("Nom de promotion");
		nameField.setText("Nom de promotion");
		sl_contentPane.putConstraint(SpringLayout.NORTH, nameField, 120, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, nameField, 20, SpringLayout.WEST, contentPane);
		nameField.setBackground(Color.WHITE);
		contentPane.add(nameField);
		nameField.setColumns(10);
		
		dureeField = new JTextField();
		dureeField.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		dureeField.setToolTipText("Durée");
		dureeField.setText("0");
		sl_contentPane.putConstraint(SpringLayout.NORTH, dureeField, 60, SpringLayout.SOUTH, nameField);
		sl_contentPane.putConstraint(SpringLayout.WEST, dureeField, 0, SpringLayout.WEST, nameField);
		dureeField.setBackground(Color.WHITE);
		contentPane.add(dureeField);
		dureeField.setColumns(10);
		
		ArrayList<String> jours = new ArrayList<>();
		for(int i = 1; i <= 31; i++ ) {
			jours.add(String.valueOf(i));
			
		}
		JComboBox jour = new JComboBox(jours.toArray());
		
		jour.setToolTipText("Jour");
		sl_contentPane.putConstraint(SpringLayout.NORTH, jour, 60, SpringLayout.SOUTH, dureeField);
		sl_contentPane.putConstraint(SpringLayout.WEST, jour, 0, SpringLayout.WEST, dureeField);
		contentPane.add(jour);
		
		
		String[] moiss = {"Janvier", "Février","Mars","Avril","Mai","Juin","Juillet","Aout","Septembre","Octobre",
			"Novembre","Decembre"};
		
		//ArrayList<String> mois1 = new ArrayList<>() ;
		//for(int i = 1; i <= 12; i++) {
			//mois1.add(String.valueOf(i));
		//}
		JComboBox mois = new JComboBox(moiss);
		
		mois.setToolTipText("Mois");
		sl_contentPane.putConstraint(SpringLayout.NORTH, mois, 60, SpringLayout.SOUTH, dureeField);
		sl_contentPane.putConstraint(SpringLayout.WEST, mois, 20, SpringLayout.EAST, jour);
		contentPane.add(mois);
		
		ArrayList<String> annees = new ArrayList<>();
		for(int i = 1950; i <= LocalDate.now().getYear() + 1 ; i++) {
			annees.add(String.valueOf(i));
		}
		JComboBox annee = new JComboBox(annees.toArray());
		
		
		annee.setToolTipText("Année");
		sl_contentPane.putConstraint(SpringLayout.NORTH, annee, 60, SpringLayout.SOUTH, dureeField);
		sl_contentPane.putConstraint(SpringLayout.WEST, annee, 20, SpringLayout.EAST, mois);
		contentPane.add(annee);
		
		
		save = new JButton("Valider");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				promos.add(new Promo(nameField.getText(), Integer.valueOf(annee.getSelectedItem().toString()), mois.getSelectedIndex() +1, Integer.valueOf(jour.getSelectedItem().toString()),Integer.parseInt(dureeField.getText())));
				PSort.sort(promos);
				Ser.save("promos", promos);
				nFenetre f = (nFenetre) ((Component) e.getSource()).getParent().getParent().getParent().getParent();
				f.dispose();
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
		});
		save.setToolTipText("Valider");
		sl_contentPane.putConstraint(SpringLayout.NORTH, save, 60, SpringLayout.SOUTH, jour);
		sl_contentPane.putConstraint(SpringLayout.WEST, save, 0, SpringLayout.WEST, jour);
		contentPane.add(save);
		
		txtpnNouvellePromotion = new JTextPane();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtpnNouvellePromotion, 30, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtpnNouvellePromotion, 140, SpringLayout.WEST, contentPane);

		txtpnNouvellePromotion.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		txtpnNouvellePromotion.setText("Nouvelle Promotion");
		contentPane.add(txtpnNouvellePromotion);
	}
}

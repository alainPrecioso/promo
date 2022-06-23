package promo;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.SpringLayout;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import java.awt.ComponentOrientation;
import java.awt.Component;
import javax.swing.border.LineBorder;

import utils.PSort;
import utils.Ser;

import java.awt.Color;

import javax.swing.ComboBoxModel;
import javax.swing.DropMode;
import javax.swing.JButton;

public class EleveFenetre extends JFrame {

	private JPanel contentPane;
	ArrayList<Promo> promos = PSort.sort((ArrayList<Promo>) Ser.load("promos.xml"));


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
	}

	/**
	 * Create the frame.
	 */
	public EleveFenetre() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 650);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelNE = new JPanel();
		panelNE.setBounds(10, 20, 430, 50);
		contentPane.add(panelNE);
		
		JLabel labelNE = new JLabel("Nouvelle élève");
		panelNE.add(labelNE);
		labelNE.setHorizontalAlignment(SwingConstants.CENTER);
		labelNE.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		
		JLabel promoLabel = new JLabel("promotion");
		promoLabel.setBounds(10, 100, 125, 21);
		promoLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		contentPane.add(promoLabel);
		
		JLabel staAltLabel = new JLabel("Salaire");
		staAltLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		staAltLabel.setBounds(10, 150, 125, 21);
		contentPane.add(staAltLabel);
		
		JLabel nomLabel = new JLabel("Nom");
		nomLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		nomLabel.setBounds(10, 200, 125, 21);
		contentPane.add(nomLabel);
		
		JTextPane nomTxtPanel = new JTextPane();
		nomTxtPanel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		nomTxtPanel.setBounds(230, 200, 145, 21);
		contentPane.add(nomTxtPanel);
		
		JLabel prenomLabel = new JLabel("Prénom");
		prenomLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		prenomLabel.setBounds(10, 250, 125, 21);
		contentPane.add(prenomLabel);
		
		JTextPane prenomTxtPanel = new JTextPane();
		prenomTxtPanel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		prenomTxtPanel.setBounds(230, 250, 145, 21);
		contentPane.add(prenomTxtPanel);
		
		JLabel entrLabel = new JLabel("Entreprise");
		entrLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		entrLabel.setBounds(10, 350, 125, 21);
		contentPane.add(entrLabel);
		
		JTextPane entrTxtPanel = new JTextPane();
		entrTxtPanel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		entrTxtPanel.setBounds(230, 350, 145, 21);
		contentPane.add(entrTxtPanel);
		
		JComboBox promoCombo = new JComboBox(promos.toArray());
		promoCombo.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		promoCombo.setBounds(230, 100, 150, 21);
		contentPane.add(promoCombo);
		promoCombo.setSelectedIndex(-1);
		
		
		String[] staAlt = {"Stagiaire", "Alternant"};

		JComboBox staAltCombo = new JComboBox(staAlt);
		staAltCombo.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		staAltCombo.setBounds(230, 150, 150, 21);
		contentPane.add(staAltCombo);
		staAltCombo.setSelectedIndex(-1);
		
		
		
		
		JButton buttonValider = new JButton("Valider");
		buttonValider.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		buttonValider.setBounds(10, 560, 117, 39);
		contentPane.add(buttonValider);
		
		JLabel salaireLabel = new JLabel("Salaire");
		salaireLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		salaireLabel.setBounds(10, 400, 125, 21);
		contentPane.add(salaireLabel);
		salaireLabel.setVisible(false);
		
		JLabel contact1Label = new JLabel("Contact1");
		contact1Label.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		contact1Label.setBounds(10, 450, 125, 21);
		contentPane.add(contact1Label);
		
		JLabel contact2Label = new JLabel("Contact2");
		contact2Label.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		contact2Label.setBounds(10, 500, 125, 21);
		contentPane.add(contact2Label);
		
		String[] type = {"ARE","AREF","RSA","AUTRE"};
		JComboBox typeASBox = new JComboBox(type);
		typeASBox.setBounds(140, 400, 85, 21);
		contentPane.add(typeASBox);
		
		
		JTextPane typeASPanel = new JTextPane();
		typeASPanel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		typeASPanel.setBounds(230, 400, 145, 21);
		contentPane.add(typeASPanel);
		
		JTextPane contact1Txt = new JTextPane();
		contact1Txt.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		contact1Txt.setBounds(230, 450, 145, 21);
		contentPane.add(contact1Txt);
		
		JTextPane contact2Txt = new JTextPane();
		contact2Txt.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		contact2Txt.setBounds(230, 500, 145, 21);
		contentPane.add(contact2Txt);
		
		JLabel allocationLabel = new JLabel("Allocation");
		allocationLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		allocationLabel.setBounds(10, 400, 125, 21);
		contentPane.add(allocationLabel);
		
		JLabel lblDateDinscription = new JLabel("Date d'inscription");
		lblDateDinscription.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblDateDinscription.setBounds(10, 300, 150, 21);
		contentPane.add(lblDateDinscription);
		
		ArrayList<String> jours = new ArrayList<>();
		for(int i = 1; i <= 31; i++ ) {
			jours.add(String.valueOf(i));
			}
			
		JComboBox typeASBox_1 = new JComboBox(jours.toArray());
		typeASBox_1.setBounds(180, 300, 85, 21);
		contentPane.add(typeASBox_1);
		
		String[] moiss = {"Janvier", "Février","Mars","Avril","Mai","Juin","Juillet","Aout","Septembre","Octobre",
				"Novembre","Decembre"};
		
		JComboBox typeASBox_2 = new JComboBox(moiss);
		typeASBox_2.setBounds(260, 300, 85, 21);
		contentPane.add(typeASBox_2);
		
		ArrayList<String> annees = new ArrayList<>();
		for(int i = LocalDate.now().getYear() - 1; i <= LocalDate.now().getYear() + 1 ; i++) {
			annees.add(String.valueOf(i));
		}
		JComboBox typeASBox_3 = new JComboBox(annees.toArray());
		typeASBox_3.setBounds(340, 300, 85, 21);
		contentPane.add(typeASBox_3);
		
		staAltCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(staAltCombo.getSelectedIndex()== 0) {
					
					salaireLabel.setVisible(false);
					allocationLabel.setVisible(true);
					typeASBox.setVisible(true);
				}
				if(staAltCombo.getSelectedItem().equals("Alternant")) {
					salaireLabel.setVisible(true);
					allocationLabel.setVisible(false);
					typeASBox.setVisible(false);
				}
			}
		});
		
		buttonValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> contacts = new ArrayList<>();
				Collections.addAll(contacts, contact1Txt.getText(), contact2Txt.getText());
				
				if(staAltCombo.getSelectedIndex()== 0) {
					
					((Promo)promoCombo.getSelectedItem()).addEleve(new Stagiaire(nomTxtPanel.getText(),prenomTxtPanel.getText(), Integer.valueOf(typeASBox_3.getSelectedItem().toString()), typeASBox_2.getSelectedIndex()+1, Integer.valueOf(typeASBox_1.getSelectedItem().toString()), contacts, entrTxtPanel.getText(), typeASBox.getSelectedItem().toString(),	typeASPanel.getText()));
					Ser.save("promos", promos);
				}
				
				if(staAltCombo.getSelectedItem().equals("Alternant")) {
					((Promo)promoCombo.getSelectedItem()).addEleve(new Alternant(nomTxtPanel.getText(),prenomTxtPanel.getText(), Integer.valueOf(typeASBox_3.getSelectedItem().toString()), typeASBox_2.getSelectedIndex()+1, Integer.valueOf(typeASBox_1.getSelectedItem().toString()), contacts, entrTxtPanel.getText(),	typeASPanel.getText()));
					Ser.save("promos", promos);
				}
				((EleveFenetre)((Component) e.getSource()).getParent().getParent().getParent().getParent()).dispose();

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
		}
	);
	}
}

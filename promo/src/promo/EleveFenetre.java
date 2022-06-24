package promo;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
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
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		
		ArrayList<String> jours = new ArrayList<>();
		for(int i = 1; i <= 31; i++ ) {
			jours.add(String.valueOf(i));
			}
			
		JComboBox joursCombo = new JComboBox(jours.toArray());
		sl_contentPane.putConstraint(SpringLayout.NORTH, joursCombo, 300, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, joursCombo, 208, SpringLayout.WEST, contentPane);
		contentPane.add(joursCombo);
		joursCombo.setSelectedIndex(LocalDate.now().getDayOfMonth()-1);
		
		String[] moiss = {"Janvier", "Février","Mars","Avril","Mai","Juin","Juillet","Aout","Septembre","Octobre",
				"Novembre","Decembre"};
		
		JComboBox moisCombo = new JComboBox(moiss);
		sl_contentPane.putConstraint(SpringLayout.NORTH, moisCombo, 0, SpringLayout.NORTH, joursCombo);
		sl_contentPane.putConstraint(SpringLayout.WEST, moisCombo, 0, SpringLayout.EAST, joursCombo);
		contentPane.add(moisCombo);
		moisCombo.setSelectedIndex(LocalDate.now().getMonthValue()-1);
		
		ArrayList<String> annees = new ArrayList<>();
		for(int i = LocalDate.now().getYear() - 1; i <= LocalDate.now().getYear() + 1 ; i++) {
			annees.add(String.valueOf(i));
		}
		JComboBox anCombo = new JComboBox(annees.toArray());
		sl_contentPane.putConstraint(SpringLayout.NORTH, anCombo, 0, SpringLayout.NORTH, moisCombo);
		sl_contentPane.putConstraint(SpringLayout.WEST, anCombo, 0, SpringLayout.EAST, moisCombo);
		contentPane.add(anCombo);
		anCombo.setSelectedIndex(1);
		
		JLabel promoLabel = new JLabel("promotion");
		sl_contentPane.putConstraint(SpringLayout.NORTH, promoLabel, 100, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, promoLabel, 10, SpringLayout.WEST, contentPane);
		contentPane.add(promoLabel);
		
		JLabel staAltLabel = new JLabel("Apprenant");
		sl_contentPane.putConstraint(SpringLayout.NORTH, staAltLabel, 150, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, staAltLabel, 10, SpringLayout.WEST, contentPane);
		contentPane.add(staAltLabel);
		
		JLabel nomLabel = new JLabel("Nom");
		sl_contentPane.putConstraint(SpringLayout.NORTH, nomLabel, 200, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, nomLabel, 10, SpringLayout.WEST, contentPane);
		contentPane.add(nomLabel);
		
		JTextField nomTxtPanel = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, nomTxtPanel, 200, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, nomTxtPanel, 0, SpringLayout.WEST, joursCombo);
		sl_contentPane.putConstraint(SpringLayout.EAST, nomTxtPanel, 0, SpringLayout.EAST, anCombo);
		contentPane.add(nomTxtPanel);
		
		JLabel prenomLabel = new JLabel("Prénom");
		sl_contentPane.putConstraint(SpringLayout.NORTH, prenomLabel, 250, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, prenomLabel, 10, SpringLayout.WEST, contentPane);
		contentPane.add(prenomLabel);
		
		JTextField prenomTxtPanel = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, prenomTxtPanel, 250, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, prenomTxtPanel, 0, SpringLayout.WEST, joursCombo);
		sl_contentPane.putConstraint(SpringLayout.EAST, prenomTxtPanel, 0, SpringLayout.EAST, anCombo);
		contentPane.add(prenomTxtPanel);
		
		JLabel entrLabel = new JLabel("Entreprise");
		sl_contentPane.putConstraint(SpringLayout.NORTH, entrLabel, 350, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, entrLabel, 10, SpringLayout.WEST, contentPane);
		contentPane.add(entrLabel);
		
		JTextField entrTxtPanel = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, entrTxtPanel, 350, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, entrTxtPanel, 0, SpringLayout.WEST, joursCombo);
		sl_contentPane.putConstraint(SpringLayout.EAST, entrTxtPanel, 0, SpringLayout.EAST, anCombo);
		contentPane.add(entrTxtPanel);
		
		
		ArrayList<String> list = new ArrayList<>();
		for (Promo promo : promos) {
			list.add(promo.getNomPromo());
		}
		JComboBox promoCombo = new JComboBox(list.toArray());
		sl_contentPane.putConstraint(SpringLayout.NORTH, promoCombo, 100, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, promoCombo, 0, SpringLayout.WEST, joursCombo);
		sl_contentPane.putConstraint(SpringLayout.EAST, promoCombo, 0, SpringLayout.EAST, anCombo);
		contentPane.add(promoCombo);
		promoCombo.setSelectedIndex(-1);
		
		
		String[] staAlt = {"Stagiaire", "Alternant"};

		JComboBox staAltCombo = new JComboBox(staAlt);
		sl_contentPane.putConstraint(SpringLayout.NORTH, staAltCombo, 150, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, staAltCombo, 0, SpringLayout.WEST, joursCombo);
		sl_contentPane.putConstraint(SpringLayout.EAST, staAltCombo, 0, SpringLayout.EAST, anCombo);
		contentPane.add(staAltCombo);
		staAltCombo.setSelectedIndex(-1);
		
		
		
		
		JButton buttonValider = new JButton("Valider");
		sl_contentPane.putConstraint(SpringLayout.NORTH, buttonValider, 550, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.HORIZONTAL_CENTER, buttonValider, 0, SpringLayout.HORIZONTAL_CENTER, contentPane);
		contentPane.add(buttonValider);
		
		JLabel salaireLabel = new JLabel("Salaire");
		sl_contentPane.putConstraint(SpringLayout.NORTH, salaireLabel, 400, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, salaireLabel, 10, SpringLayout.WEST, contentPane);
		contentPane.add(salaireLabel);
		salaireLabel.setVisible(false);
		
		JLabel contact1Label = new JLabel("Contact1");
		sl_contentPane.putConstraint(SpringLayout.NORTH, contact1Label, 450, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, contact1Label, 10, SpringLayout.WEST, contentPane);
		contentPane.add(contact1Label);
		
		JLabel contact2Label = new JLabel("Contact2");
		sl_contentPane.putConstraint(SpringLayout.NORTH, contact2Label, 500, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, contact2Label, 10, SpringLayout.WEST, contentPane);
		contentPane.add(contact2Label);
		
		
		JTextField typeASPanel = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, typeASPanel, 400, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, typeASPanel, 0, SpringLayout.WEST, joursCombo);
		sl_contentPane.putConstraint(SpringLayout.EAST, typeASPanel, 0, SpringLayout.EAST, anCombo);
		contentPane.add(typeASPanel);
		
		String[] type = {"ARE","AREF","RSA","AUTRE"};
		JComboBox typeASBox = new JComboBox(type);
		sl_contentPane.putConstraint(SpringLayout.VERTICAL_CENTER, typeASBox, 0, SpringLayout.VERTICAL_CENTER, typeASPanel);
		sl_contentPane.putConstraint(SpringLayout.EAST, typeASBox, 0, SpringLayout.WEST, typeASPanel);
		contentPane.add(typeASBox);
		
		JTextField contact1Txt = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, contact1Txt, 450, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, contact1Txt, 0, SpringLayout.WEST, joursCombo);
		sl_contentPane.putConstraint(SpringLayout.EAST, contact1Txt, 0, SpringLayout.EAST, anCombo);
		contentPane.add(contact1Txt);
		
		JTextField contact2Txt = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, contact2Txt, 500, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, contact2Txt, 0, SpringLayout.WEST, joursCombo);
		sl_contentPane.putConstraint(SpringLayout.EAST, contact2Txt, 0, SpringLayout.EAST, anCombo);
		contentPane.add(contact2Txt);
		
		JLabel allocationLabel = new JLabel("Allocation");
		sl_contentPane.putConstraint(SpringLayout.NORTH, allocationLabel, 400, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, allocationLabel, 10, SpringLayout.WEST, contentPane);
		contentPane.add(allocationLabel);
		
		JLabel lblDateDinscription = new JLabel("Date d'inscription");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblDateDinscription, 300, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblDateDinscription, 10, SpringLayout.WEST, contentPane);
		contentPane.add(lblDateDinscription);
		
	
		
		JLabel labelNE = new JLabel("Nouvel élève");
		labelNE.setFont(new Font("Tahoma", Font.PLAIN, 24));
		sl_contentPane.putConstraint(SpringLayout.NORTH, labelNE, 16, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.HORIZONTAL_CENTER, labelNE, 0, SpringLayout.HORIZONTAL_CENTER, contentPane);
		contentPane.add(labelNE);
		labelNE.setHorizontalAlignment(SwingConstants.CENTER);
		
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
					
					promos.get(promoCombo.getSelectedIndex()).addEleve(new Stagiaire(nomTxtPanel.getText(),prenomTxtPanel.getText(), Integer.valueOf(anCombo.getSelectedItem().toString()), moisCombo.getSelectedIndex()+1, Integer.valueOf(joursCombo.getSelectedItem().toString()), contacts, entrTxtPanel.getText(), typeASBox.getSelectedItem().toString(), typeASPanel.getText()));
					PSort.sort(promos);
					Ser.save("promos", promos);
				}
				
				if(staAltCombo.getSelectedItem().equals("Alternant")) {
					promos.get(promoCombo.getSelectedIndex()).addEleve(new Alternant(nomTxtPanel.getText(),prenomTxtPanel.getText(), Integer.valueOf(anCombo.getSelectedItem().toString()), moisCombo.getSelectedIndex()+1, Integer.valueOf(joursCombo.getSelectedItem().toString()), contacts, entrTxtPanel.getText(),	typeASPanel.getText()));
					PSort.sort(promos);
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

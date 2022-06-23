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
import java.util.ArrayList;

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
		setBounds(100, 100, 450, 450);
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
		promoLabel.setBounds(10, 100, 125, 16);
		promoLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		contentPane.add(promoLabel);
		
		JLabel staAltLabel = new JLabel("Stagiaire/Alternant");
		staAltLabel.setBounds(10, 150, 125, 16);
		contentPane.add(staAltLabel);
		
		JLabel nomLabel = new JLabel("Nom");
		nomLabel.setBounds(10, 200, 125, 16);
		contentPane.add(nomLabel);
		
		JLabel prenomLabel = new JLabel("Prénom");
		prenomLabel.setBounds(10, 250, 125, 16);
		contentPane.add(prenomLabel);
		
		JLabel entrLabel = new JLabel("Entreprise");
		entrLabel.setBounds(10, 300, 125, 16);
		contentPane.add(entrLabel);
		
		JTextPane nomTxtPanel = new JTextPane();
		nomTxtPanel.setBounds(230, 200, 145, 16);
		contentPane.add(nomTxtPanel);
		
		JTextPane prenomTxtPanel = new JTextPane();
		prenomTxtPanel.setBounds(230, 250, 145, 16);
		contentPane.add(prenomTxtPanel);
		
		JTextPane entrTxtPanel = new JTextPane();
		entrTxtPanel.setBounds(230, 300, 145, 16);
		contentPane.add(entrTxtPanel);
		
		JComboBox promoCombo = new JComboBox(promos.toArray());
		promoCombo.setBounds(230, 100, 150, 16);
		contentPane.add(promoCombo);
		promoCombo.setSelectedIndex(-1);
		
		
		String[] staAlt = {"Stagiaire", "Alternant"};
		String[] staAlt1 = {"Stagia", "Altrnant"};

		JComboBox staAltCombo = new JComboBox(staAlt);
		staAltCombo.setBounds(230, 150, 150, 16);
		contentPane.add(staAltCombo);
		staAltCombo.setSelectedIndex(-1);
		
		staAltCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(staAltCombo.getSelectedIndex()== 0) {
				JComboBox staAltCombo1 = new JComboBox(staAlt1);
				staAltCombo1.setBounds(230, 250, 150, 16);
				contentPane.add(staAltCombo1);
				}

			}
		});
		
		
		
		JButton buttonValider = new JButton("Valider");
		buttonValider.setBounds(20, 370, 117, 29);
		contentPane.add(buttonValider);
		
		JPanel panelValider = new JPanel();
		panelValider.setBounds(24, 370, 110, 27);
		contentPane.add(panelValider);
	}
}

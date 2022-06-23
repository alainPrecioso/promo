package test;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;

import promo.Promo;

public class Fenetre2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomDePromotion;
	private JTextField txtDateDeDbut;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fenetre2 frame = new Fenetre2();
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
	public Fenetre2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 125, 600, 450);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		txtNomDePromotion = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtNomDePromotion, 156, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtNomDePromotion, 15, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtNomDePromotion, -304, SpringLayout.EAST, contentPane);
		txtNomDePromotion.setBackground(new Color(255, 255, 255));
		txtNomDePromotion.setText("  Promotion");
		contentPane.add(txtNomDePromotion);
		txtNomDePromotion.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("valider");
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_1, -95, SpringLayout.EAST, contentPane);
		contentPane.add(btnNewButton_1);
		
		ArrayList<String> annees = new ArrayList<String>();
		for(int i =1900;i <= LocalDate.now().getYear() +1;i++) {
		annees.add(String.valueOf(i));
		}
		JComboBox comboBox = new JComboBox(annees.toArray());
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1, 0, SpringLayout.NORTH, comboBox);
		comboBox.setToolTipText("ann\u00E9es");
		contentPane.add(comboBox);
		//ArrayList<String> annees = new ArrayList<String>();
			
				
		ArrayList<String> mois = new ArrayList<String>() ;
		for(int i =1;i <=12;i++) {
		mois.add(String.valueOf(i));
		}
		String [] tableauMois  = {"janvier","Fevrier","Mars","Avril","Mai","juin","Juillet","Août","Septembre","Octobre","Novembre","Decembre"};
		
		JComboBox comboBox_1 = new JComboBox(tableauMois);
		sl_contentPane.putConstraint(SpringLayout.NORTH, comboBox, -1, SpringLayout.NORTH, comboBox_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, comboBox, 6, SpringLayout.EAST, comboBox_1);
		comboBox_1.setToolTipText("mois");
		contentPane.add(comboBox_1);
		
		ArrayList<String> jours = new ArrayList<String>();
		for(int i =1;i <=31;i++) {
		jours.add(String.valueOf(i));
		}
		JComboBox comboBox_2 = new JComboBox(jours.toArray());
		sl_contentPane.putConstraint(SpringLayout.NORTH, comboBox_1, 1, SpringLayout.NORTH, comboBox_2);
		sl_contentPane.putConstraint(SpringLayout.WEST, comboBox_1, 17, SpringLayout.EAST, comboBox_2);
		comboBox_2.setToolTipText("jours");
		contentPane.add(comboBox_2);
		
		JTextPane txtpnCampusSudDes = new JTextPane();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtpnCampusSudDes, 25, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtpnCampusSudDes, 0, SpringLayout.WEST, comboBox_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtpnCampusSudDes, 96, SpringLayout.EAST, txtNomDePromotion);
		txtpnCampusSudDes.setBackground(new Color(211, 211, 211));
		txtpnCampusSudDes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnCampusSudDes.setText("Campus Sud des M\u00E9tiers");
		contentPane.add(txtpnCampusSudDes);
		
		JTextPane txtpnDureeDeLa = new JTextPane();
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtNomDePromotion, -41, SpringLayout.NORTH, txtpnDureeDeLa);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtpnDureeDeLa, -158, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtpnDureeDeLa, 220, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtpnDureeDeLa, 15, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtpnDureeDeLa, -304, SpringLayout.EAST, contentPane);
		txtpnDureeDeLa.setBackground(Color.WHITE);
		txtpnDureeDeLa.setText("Duree de la Formation");
		txtpnDureeDeLa.setToolTipText("");
		contentPane.add(txtpnDureeDeLa);
		
		txtDateDeDbut = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, comboBox_2, -1, SpringLayout.NORTH, txtDateDeDbut);
		sl_contentPane.putConstraint(SpringLayout.WEST, comboBox_2, 13, SpringLayout.EAST, txtDateDeDbut);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtDateDeDbut, 0, SpringLayout.WEST, txtNomDePromotion);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtDateDeDbut, -51, SpringLayout.SOUTH, contentPane);
		txtDateDeDbut.setText("date de d\u00E9but");
		contentPane.add(txtDateDeDbut);
		txtDateDeDbut.setColumns(10);
		
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Promo promo = new Promo(txtNomDePromotion.getText(), Integer.valueOf(comboBox.getSelectedItem().toString()) , Integer.valueOf(comboBox_1.getSelectedIndex()) +1 , Integer.valueOf(comboBox_2.getSelectedItem().toString()) , Integer.valueOf(txtpnDureeDeLa.getText()) );
				
				System.out.println(promo);
				
		
				
				
				
			}
		});
	}
}

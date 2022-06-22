import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import java.awt.Color;
import javax.swing.border.LineBorder;

import promo.Promo;
import utils.Ser;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import javax.swing.JTextPane;
import java.awt.Font;
import java.time.LocalDate;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class nFenetre extends JFrame {
	
	ArrayList<Promo> promos = (ArrayList<Promo>) Ser.load("promos.xml");
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

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
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(UIManager.getColor("Desktop.background"));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 20, 430, 50);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Promotion");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Promotion");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(20, 150, 150, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Date d'inscription");
		lblNewLabel_1_2.setBounds(20, 250, 150, 16);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Durée");
		lblNewLabel_1_3.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_1_3.setBounds(20, 200, 150, 16);
		contentPane.add(lblNewLabel_1_3);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(15, 325, 100, 30);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(190, 150, 230, 16);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(190, 200, 230, 16);
		contentPane.add(textField_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(20, 330, 88, 20);
		contentPane.add(panel_1);
		
		
		ArrayList<String> jours = new ArrayList<>();
		for(int i = 1; i <= 31; i++ ) {
			jours.add(String.valueOf(i));
		}
		JComboBox comboBox = new JComboBox(jours.toArray());
		comboBox.setBounds(180, 250, 95, 16);
		contentPane.add(comboBox);
		
		String[] moiss = {"Janvier", "Février","Mars","Avril","Mai","Juin","Juillet","Aout","Septembre","Octobre",
				"Novembre","Decembre"};
		
		JComboBox comboBox_1 = new JComboBox(moiss);
		comboBox_1.setBounds(265, 250, 95, 16);
		contentPane.add(comboBox_1);
		
		
		ArrayList<String> annees = new ArrayList<>();
		for(int i = 1950; i <= LocalDate.now().getYear() + 1 ; i++) {
			annees.add(String.valueOf(i));
		}
		JComboBox comboBox_2 = new JComboBox(annees.toArray());
		comboBox_2.setBounds(350, 250, 95, 16);
		contentPane.add(comboBox_2);
		
		
		}
		
	}

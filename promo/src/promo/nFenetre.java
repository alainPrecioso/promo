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
import java.awt.Color;
import java.awt.Component;

import javax.swing.border.LineBorder;

import promo.Promo;
import utils.PSort;
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
	private JTextField nameField;
	private JTextField dureeField;

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
		setResizable(false);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		if (System.getProperty("os.name").toLowerCase().contains("mac")) {
			setBounds(100, 100, 650, 450);
		} else {
			setBounds(100, 100, 450, 450);
		}
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel promotionLabel = new JLabel("Promotion");
		sl_contentPane.putConstraint(SpringLayout.NORTH, promotionLabel, 150, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, promotionLabel, 20, SpringLayout.WEST, contentPane);
		promotionLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		contentPane.add(promotionLabel);
		
		JLabel dateLabel = new JLabel("Date de début");
		sl_contentPane.putConstraint(SpringLayout.NORTH, dateLabel, 250, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, dateLabel, 20, SpringLayout.WEST, contentPane);
		dateLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		contentPane.add(dateLabel);
		
		JLabel dureeLabel = new JLabel("Durée");
		sl_contentPane.putConstraint(SpringLayout.NORTH, dureeLabel, 200, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, dureeLabel, 20, SpringLayout.WEST, contentPane);
		dureeLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		contentPane.add(dureeLabel);
		
		JButton save = new JButton("Valider");
		sl_contentPane.putConstraint(SpringLayout.NORTH, save, 325, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, save, 15, SpringLayout.WEST, contentPane);
		contentPane.add(save);
		
		
		
		
		JPanel panel_1 = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel_1, 330, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel_1, 20, SpringLayout.WEST, contentPane);
		contentPane.add(panel_1);
		
		
		ArrayList<String> jours = new ArrayList<>();
		for(int i = 1; i <= 31; i++ ) {
			jours.add(String.valueOf(i));
		}
		JComboBox joursCombo = new JComboBox(jours.toArray());
		sl_contentPane.putConstraint(SpringLayout.NORTH, joursCombo, 250, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, joursCombo, 180, SpringLayout.WEST, contentPane);
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
		sl_contentPane.putConstraint(SpringLayout.NORTH, anCombo, 0, SpringLayout.NORTH, joursCombo);
		sl_contentPane.putConstraint(SpringLayout.WEST, anCombo, 0, SpringLayout.EAST, moisCombo);
		contentPane.add(anCombo);
		anCombo.setSelectedIndex(1);
		

		nameField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, nameField, 150, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, nameField, 0, SpringLayout.WEST, joursCombo);
		sl_contentPane.putConstraint(SpringLayout.EAST, nameField, 0, SpringLayout.EAST, anCombo);
		contentPane.add(nameField);
		nameField.setColumns(10);
		
		dureeField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, dureeField, 200, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, dureeField, 0, SpringLayout.WEST, joursCombo);
		sl_contentPane.putConstraint(SpringLayout.EAST, dureeField, 0, SpringLayout.EAST, anCombo);
		dureeField.setColumns(10);
		contentPane.add(dureeField);
		
		JLabel lblNewLabel = new JLabel("Promotion");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 30, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 150, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel, 50, SpringLayout.EAST, contentPane);
		contentPane.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		
		
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				promos.add(new Promo(nameField.getText(), Integer.valueOf(anCombo.getSelectedItem().toString()), moisCombo.getSelectedIndex() +1, Integer.valueOf(joursCombo.getSelectedItem().toString()),Integer.parseInt(dureeField.getText())));
				PSort.sort(promos);
				Ser.save("promos", promos);
				((nFenetre) ((Component) e.getSource()).getParent().getParent().getParent().getParent()).dispose();
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
		
		}
		
	}
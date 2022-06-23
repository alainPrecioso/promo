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
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import java.awt.ComponentOrientation;
import java.awt.Component;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.DropMode;
import javax.swing.JButton;

public class eleveFenetre extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eleveFenetre frame = new eleveFenetre();
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
	public eleveFenetre() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 20, 430, 50);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Nouvelle élève");
		panel.add(lblNewLabel);
		
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		
		JLabel lblNewLabel_1 = new JLabel("promotion");
		lblNewLabel_1.setBounds(10, 100, 125, 16);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Stagiaire/Alternant");
		lblNewLabel_1_1.setBounds(10, 150, 125, 16);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Nom");
		lblNewLabel_1_2.setBounds(10, 200, 125, 16);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Prénom");
		lblNewLabel_1_3.setBounds(10, 250, 125, 16);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Entreprise");
		lblNewLabel_1_4.setBounds(10, 300, 125, 16);
		contentPane.add(lblNewLabel_1_4);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(230, 200, 145, 16);
		contentPane.add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setBounds(230, 250, 145, 16);
		contentPane.add(textPane_3);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setBounds(230, 300, 145, 16);
		contentPane.add(textPane_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(230, 100, 150, 16);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(230, 150, 150, 16);
		contentPane.add(comboBox_1);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.setBounds(20, 370, 117, 29);
		contentPane.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(24, 370, 110, 27);
		contentPane.add(panel_1);
	}
}

package promo;

import java.awt.Color;

import javax.swing.JFrame; // Importation du JFrame
import javax.swing.JPanel; // Importation du JPanel
//import color;
public class Fenetre extends JFrame {

	public Fenetre() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Création de mon interface graphique
		JFrame fenetre = new JFrame();

		fenetre.setTitle("ma premiere fenêtre java");
		fenetre.setSize(600,200);
		fenetre.setLocationRelativeTo(null);
		fenetre.setDefaultCloseOperation(EXIT_ON_CLOSE);
		fenetre.setVisible(true);
        // Intancie mon JPanel
		JPanel pan = new JPanel();
		pan.setBackground(Color.blue);
		// On previent notre JFrame que notre JPanel sera
		// Son content pane
		fenetre.setContentPane(pan);
		fenetre.setVisible(true);
	}
}

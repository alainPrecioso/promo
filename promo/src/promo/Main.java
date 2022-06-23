package promo;

import java.awt.EventQueue;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;

import utils.Ser;

public class Main {

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

}
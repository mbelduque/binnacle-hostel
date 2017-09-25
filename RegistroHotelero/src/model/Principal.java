package model;

import javax.swing.UIManager;
import de.javasoft.plaf.synthetica.SyntheticaOrangeMetallicLookAndFeel;

import view.VistaPrincipal;

public class Principal {

	public static void iniciarApp() {
		VistaPrincipal vistaPrincipal = new VistaPrincipal();
		vistaPrincipal.setLocationRelativeTo(null);
		vistaPrincipal.setVisible(true);
	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(new SyntheticaOrangeMetallicLookAndFeel());
		} catch (Exception e) {
			e.printStackTrace();
		}

		iniciarApp();
	}

}
package model;

import view.VistaPrincipal;

public class Principal {

	public static void iniciarApp() {
		VistaPrincipal vistaPrincipal = new VistaPrincipal();
		vistaPrincipal.setLocationRelativeTo(null);
		vistaPrincipal.setVisible(true);
	}

	public static void main(String[] args) {
		iniciarApp();
	}

}
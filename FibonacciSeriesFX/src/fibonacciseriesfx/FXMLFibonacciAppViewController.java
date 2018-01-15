package fibonacciseriesfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * Clase controladora que contiene los metodos para los eventos programados en
 * los botones de la interfaz grafica de usuario.
 * 
 * @author Mauricio Belduque 
 * @version 1.0 - 20.10.2017
 */
public class FXMLFibonacciAppViewController implements Initializable {

	// Components declaration ************************
	@FXML
	private RadioButton rdBtnIterative;

	@FXML
	private RadioButton rdBtnRecursive;

	@FXML
	private TextField txtSeries;

	@FXML
	private Button btnCalculate;

	@FXML
	private Button btnResetConsole;

	@FXML
	private TextArea txtAreaResults;

	@FXML
	private MenuItem menuItemClose;

	@FXML
	private MenuItem menuItemReset;

	@FXML
	private MenuItem menuItemAbout;

	@FXML
	private Alert alert;

	@FXML
	private Alert alert1;

	@FXML
	private Alert alert2;

	@FXML
	private Alert alert3;

	@FXML
	private ProgressBar progressBar;

	// Button Methods *******************************

	/**
	 * Metodo caculateFibo(ActionEvent event). inicialmente realiza sus respectivas
	 * validaciones garantizando el buen funcionamiento para el usuario.
	 * posteriormente realiza el llamado al metodo respectivo dentro de ciclos
	 * iterativos tipo for para realizar el caculo de la serie, segun el radio
	 * button elegido
	 * 
	 * @param event evento escuchador del boton
	 * @see FiboMethods clase contenedora de los metodos para realizar el calculo de
	 *      las series
	 */
	@FXML
	private void calculateFibo(ActionEvent event) {
		if (rdBtnIterative.isSelected() == false && rdBtnRecursive.isSelected() == false) {

			this.alert1 = new Alert(Alert.AlertType.WARNING);
			this.alert1.setTitle("Warning Dialog");
			this.alert1.setHeaderText("Warning Message");
			this.alert1.setContentText("You must select some method first");
			this.alert1.showAndWait();

		} else if (txtSeries.getText().isEmpty()) {

			this.alert2 = new Alert(Alert.AlertType.WARNING);
			this.alert2.setTitle("Warning Dialog");
			this.alert2.setHeaderText("Warning Message");
			this.alert2.setContentText("You must enter a value to calculate");
			this.alert2.showAndWait();

		} else if (rdBtnIterative.isSelected() == true) {

			int serie = Integer.parseInt(txtSeries.getText());
			if (serie >= 4500) {
				this.alert3 = new Alert(Alert.AlertType.WARNING);
				this.alert3.setTitle("Warning Dialog");
				this.alert3.setHeaderText("Warning Message");
				this.alert3.setContentText("The serial number to be queried exceeds the processing limit "
						+ "which will produce an memory overflow \n\n"
						+ "Please reset the application and enter a series less than 4500. ");
				this.alert3.showAndWait();
			} else {
				txtAreaResults.setText("\nIterative Method \n\n");

				for (int i = 0; i <= serie; i++) {
					txtAreaResults.appendText(
							"Fibonacci Serie " + "(" + i + ") = " + FiboMethods.serieFiboIterativa(i) + "\n");
				}
				progressBar.setProgress(serie);
			}

		} else if (rdBtnRecursive.isSelected() == true) {

			int serie = Integer.parseInt(txtSeries.getText());

			if (serie >= 40) {
				txtAreaResults.setText("With the recursive method you can't calculate series larger than 40. \n\n"
						+ "Recursive method \n\n" + "public static BigInteger serieFiboRecursiva(int n) {\n"
						+ "     switch (n) {\n" + "         case 0:\n" + "             return new BigInteger(\"0\");\n"
						+ "         case 1:\n" + "             return new BigInteger(\"1\");\n" + "         default:\n"
						+ "             return serieFiboRecursiva(n - 1).add(serieFiboRecursiva(n - 2));\n" + "     }\n"
						+ "}\n\n" + "The temporal complexity of this algorithm is logarithmic and exponential\n"
						+ "which causes memory to overflow and the application will block. \n\n"
						+ "Please reset the console and enter a series less than 40.");
			} else {
				txtAreaResults.setText("\nRecursive Method \n\n");
				for (int i = 0; i <= serie; i++) {
					txtAreaResults.appendText(
							"Fibonacci Serie " + "(" + i + ") = " + FiboMethods.serieFiboRecursiva(i) + "\n");
				}
				progressBar.setProgress(serie);
			}

		}
	}

	@FXML
	private void resetConsole(ActionEvent event) {
		txtAreaResults.setText("");
		progressBar.setProgress(0);
	}

	// MenuItem Methods *******************************

	/**
	 * Metodo closeApplication(ActionEvent event) 
	 * cierra la aplicación desde el menuItem en la barra de menú
	 * 
	 * @param event evento escuchador del menuItem
	 */
	@FXML
	private void closeApplication(ActionEvent event) {
		System.exit(0);
	}

	/**
	 * Metodo resetConsoleMenu(ActionEvent event) 
	 * setea el textArea, el campo textField y el progressBar en blanco cada vez que 
	 * se pulsa el item resetear aplicación.
	 * 
	 * @param event evento escuchador del menuItem
	 */
	@FXML
	private void resetConsoleMenu(ActionEvent event) {
		txtAreaResults.setText("");
		txtSeries.setText("");
		progressBar.setProgress(0);
	}

	/**
	 * Metodo showAbout(ActionEvent event) 
	 * muestra información relacionada con el proyecto y el programador
	 * 
	 * @param event evento escuchador del menuItem 
	 */
	@FXML
	private void showAbout(ActionEvent event) {
		alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("About");
		alert.setHeaderText("Fibonacci Series 1.0");
		alert.setContentText("About this application\n\n" + "Features:\n\n"
				+ "Fibonacci Series was created for educational purposes such as teaching the fibonacci series and "
				+ "to use two types of algorithms based on different temporal complexities, which demonstrate "
				+ "the performance differences between the typical iterative algorithm and the recursive algorithm, "
				+ "where recursion presents an exponential logarithmic slope that produces a memory overflow "
				+ " ends up blocking the application." + "\n\n" + "created by: Mauricio Belduque\n "
				+ "Software Engineering Student \n\n" + "Contact: m.belduque@hotmail.com \n\n"
				+ "you can find this project in my github repository https://github.com/mbelduque \n\n"
				+ "Armenia - Quindio / Colombia");
		alert.showAndWait();
	}

	// Implementation initializable *******************
	@Override
	public void initialize(URL url, ResourceBundle rb) {
	}

}

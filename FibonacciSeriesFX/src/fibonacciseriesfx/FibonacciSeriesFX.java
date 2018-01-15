package fibonacciseriesfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * Clase principal que contiene el metodo main(String[] args) junto con el
 * metodo estatico launch(args). metodos encargados de lanzar el programa
 * iniciando la interfaz grafica de usuario creada en javaFX.
 * 
 * @author Mauricio Belduque 
 * @version 1.0 - 20.10.2017
 */
public class FibonacciSeriesFX extends Application {
	
	/**
	 * Metodo start(Stage stage)
	 * Inicia el programa bajo el concepto de escena que maneja JavaFX
	 * 
	 * @param stage escena principal
	 * @exception Exception lanza una excepción si no se carga el nodo raiz en la escena
	 * */
	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("FXMLFibonacciAppView.fxml"));

		Scene scene = new Scene(root);

		stage.setTitle("Fibonacci Series");
		stage.getIcons().add(new Image("fibonacciseriesfx/resources/Typicons_e06b(0)_128.png"));
		stage.setResizable(false);
		stage.setScene(scene);
		stage.show();
	}

	/**
	 * Metodo main, lanza el programa iniciando la interfaz grafica de usuario.
	 * 
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}

}
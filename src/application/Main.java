package application;

import java.io.IOException;

import controller.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class Main extends Application {

	private Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Aplicacion");
		mostrarVentanaMain();
	}

	public static void main(String[] args) {
		launch(args);
	}

	private void mostrarVentanaMain() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/view/MainView.fxml"));
			AnchorPane rootLayout = (AnchorPane) loader.load();
			MainController mainController = loader.getController();
			mainController.setAplicacion(this);

			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Luego de esto copian el mismo metodo de mostrarVentanaMain pero con las nuevas ventanas que necesiten
	 */
}

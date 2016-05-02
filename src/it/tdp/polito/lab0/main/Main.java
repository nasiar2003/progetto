package it.tdp.polito.lab0.main;
	
import it.tdp.polito.lab0.controller.Lab0Controller;
import it.tdp.polito.lab0.model.Model;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader= new FXMLLoader(getClass().getResource("lab0.fxml"));
			BorderPane root = (BorderPane)loader.load();
			Scene scene = new Scene(root);
			Model model= new Model();
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			

			
			Lab0Controller controller=loader.getController();
			controller.set(model);
			
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

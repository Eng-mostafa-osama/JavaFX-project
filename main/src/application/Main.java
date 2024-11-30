package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene homeScreen = new Scene(root,1280,720,Color.RED); 
			primaryStage.setTitle("AL Ahly SC");// title of the application
			// set global css sheet 
			String CSS = this.getClass().getResource("application.css").toExternalForm();
			homeScreen.getStylesheets().add(CSS);
			
			primaryStage.setScene(homeScreen);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

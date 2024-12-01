package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/home_page.fxml"));
			Scene homeScreen = new Scene(root); 
			primaryStage.setTitle("AL Ahly SC");// title of the application
			// set global css sheet 
			String CSS = this.getClass().getResource("application.css").toExternalForm();
			homeScreen.getStylesheets().add(CSS);
			
			
			Image icon = new Image("file:ahly Logo.png");
			primaryStage.getIcons().add(icon);
			
			
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

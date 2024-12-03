package application;

import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Node;
import javafx.stage.Stage;



	
public  class SceneSwitch {
	@FXML
	private Stage stage;
	private Scene scene;
	private Parent root;
	@FXML
	public void SwitchToSignLog(ActionEvent e) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("/Sign_Login.fxml"));
		stage =(Stage)((Node)e.getSource()).getScene().getWindow();
		scene  = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
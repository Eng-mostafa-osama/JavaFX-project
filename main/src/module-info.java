module mainFX {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires java.desktop;
	requires javafx.web;
	
	opens application to javafx.graphics, javafx.fxml;
}

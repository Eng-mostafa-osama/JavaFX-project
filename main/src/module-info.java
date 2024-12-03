module mainFX {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires java.desktop;
	requires javafx.web;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
}

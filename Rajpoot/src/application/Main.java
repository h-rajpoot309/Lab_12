package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Label message = new Label("Welcone to FX");
			Button button1= new Button("Goodbye");
			Button button2= new Button("thank you");
			Button button3= new Button("Quit");
			HBox layout = new HBox(10);
			layout.getChildren().addAll(message,button1,button2,button3);
			Scene scene = new Scene(layout,400,400);
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

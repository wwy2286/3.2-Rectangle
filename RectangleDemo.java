//import all classes to be used
import java.util.Optional;
import java.awt.Toolkit;
import javax.swing.JDialog;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;
/**
William Yu <br>
3/5/2017 <br>
wwy2286@gmail.com <br>
purpose of program: To use JavaFX to find the area and perimeter of the rectangle
*/
public class RectangleDemo extends Application {
	public void start(Stage primaryStage){
		TextInputDialog input = new TextInputDialog();
		input.setTitle("Rectangle Application");
		input.setHeaderText("Input Width");
		input.showAndWait();
		double width = Double.parseDouble(input.getResult());

		input.setTitle("Rectangle Application");
		input.setHeaderText("Input Height");
		input.showAndWait();
		double height = Double.parseDouble(input.getResult());

		Alert output = new Alert(AlertType.INFORMATION);
		output.setTitle("Rectangle Application");
		output.setHeaderText("The perimeter of the rectangle is " + (2*height+2*width));
		output.showAndWait();
		
		output.setTitle("Rectangle Application");
		output.setHeaderText("The area of the rectangle is " + width*height);
		output.showAndWait();
}
public static void main(String[]args)
{
	launch(args);
}
 }

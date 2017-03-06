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
//creates class rectangledemo and let it have attributes of application
public class RectangleDemo extends Application {
	// set the canvass for javafx
	public void start(Stage primaryStage){
		// create new dialog box
		TextInputDialog input = new TextInputDialog();
		// set title
		input.setTitle("Rectangle Application");
		// set header
		input.setHeaderText("Input Width");
		// makes sure the dialog box is showing
		input.showAndWait();
		// ask for input for width
		double width = Double.parseDouble(input.getResult());
		// create new dialog box for height and set title
		input.setTitle("Rectangle Application");
		// set header
		input.setHeaderText("Input Height");
		// makes sure the dialog box is showing
		input.showAndWait();
		// set double height to user input
		double height = Double.parseDouble(input.getResult());
		// create new alert box to show on screen
		Alert output = new Alert(AlertType.INFORMATION);
		// set title for the alert box
		output.setTitle("Rectangle Application");
		// set header and calculates the perimiter
		output.setHeaderText("The perimeter of the rectangle is " + (2*height+2*width));
		output.showAndWait();
		output.setTitle("Rectangle Application");
		//set header and calculates the area
		output.setHeaderText("The area of the rectangle is " + width*height);
		output.showAndWait();
}
public static void main(String[]args)
{
	launch(args);
}
 }

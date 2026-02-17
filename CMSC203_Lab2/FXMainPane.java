
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed. Before
 * beginning to implement, design the structure of your GUI in order to
 * understand what panels go inside which ones, and what buttons or other
 * components go in which panels.
 * 
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	// student Task #2:
	// declare five buttons, a label, and a textfield
	Button helloButton;
	Button howdyButton;
	Button chineseButton;
	Button spanishButton;

	Button clearButton;
	Button exitButton;

	Label feedbackLabel;
	TextField textField;

	// declare two HBoxes
	HBox buttonBox;
	HBox formBox;

	// student Task #4:
	// declare an instance of DataManager
	DataManager manager;

	/**
	 * The MainPanel constructor sets up the entire GUI in this approach. Remember
	 * to wait to add a component to its containing component until the container
	 * has been created. This is the only constraint on the order in which the
	 * following statements appear.
	 */
	FXMainPane() {
		// student Task #2:
		// instantiate the buttons, label, and textfield
		helloButton = new Button("Hello");
		howdyButton = new Button("Howdy");
		chineseButton = new Button("Chinese");
		spanishButton = new Button("Spanish");

		clearButton = new Button("Clear");
		exitButton = new Button("Exit");

		feedbackLabel = new Label("Feedback: ");
		textField = new TextField();

		ButtonHandler buttonHandler = new ButtonHandler();

		helloButton.setOnAction(buttonHandler);
		howdyButton.setOnAction(buttonHandler);
		chineseButton.setOnAction(buttonHandler);
		spanishButton.setOnAction(buttonHandler);

		clearButton.setOnAction(buttonHandler);
		exitButton.setOnAction(buttonHandler);

		// instantiate the HBoxes
		buttonBox = new HBox();
		formBox = new HBox();

		// student Task #4:
		// instantiate the DataManager instance
		manager = new DataManager();

		// set margins and set alignment of the components
		Insets insets = new Insets(10);

		HBox.setMargin(helloButton, insets);
		HBox.setMargin(howdyButton, insets);
		HBox.setMargin(chineseButton, insets);
		HBox.setMargin(spanishButton, insets);

		HBox.setMargin(clearButton, insets);
		HBox.setMargin(exitButton, insets);

		buttonBox.setAlignment(Pos.CENTER);
		formBox.setAlignment(Pos.CENTER);

		// student Task #3:
		// add the label and textfield to one of the HBoxes
		formBox.getChildren().addAll(feedbackLabel, textField);

		// add the buttons to the other HBox
		buttonBox.getChildren().addAll(helloButton, howdyButton, chineseButton, spanishButton, clearButton, exitButton);

		// add the HBoxes to this FXMainPanel (a VBox)
		getChildren().addAll(formBox, buttonBox);
	}

	// Task #4:
	// create a private inner class to handle the button clicks
	class ButtonHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			if (event.getTarget().equals(helloButton)) {
				textField.setText(manager.getHello());
			} else if (event.getTarget().equals(howdyButton)) {
				textField.setText(manager.getHowdy());
			} else if (event.getTarget().equals(chineseButton)) {
				textField.setText(manager.getChinese());
			} else if (event.getTarget().equals(spanishButton)) {
				textField.setText(manager.getSpanish());
			} else if (event.getTarget().equals(clearButton)) {
				textField.setText("");
			} else {
				Platform.exit();
				System.exit(0);
			}
		}
	}
}

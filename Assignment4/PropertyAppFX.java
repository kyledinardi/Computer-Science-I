import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: A JavaFX program that can create and list properties and calculate their total rent.
 * Due: 03/31/2026
 * Platform/compiler: Eclipse, Java 26, Linux
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */

public class PropertyAppFX extends Application {
    /**
     * Main method for JavaFX implementation
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    /** Creates and shows the stage */
    public void start(Stage stage) throws Exception {
        FXMainPane root = new FXMainPane();
        stage.setScene(new Scene(root, 600, 425));
        stage.setTitle("Property Management");
        stage.show();
    }

    /** Main box for JavaFX stage */
    private class FXMainPane extends VBox {
        private Label propertyNameLabel;
        private Label cityLabel;
        private Label rentLabel;
        private Label ownerLabel;

        private TextField propertyNameTextField;
        private TextField cityTextField;
        private TextField rentTextField;
        private TextField ownerTextField;

        private TextArea displayTextField;
        private StringBuilder displaySb;

        private Button addPropertyButton;
        private Button showAllPropertiesButton;
        private Button showTotalRentButton;
        private ButtonHandler buttonHandler;

        private GridPane formPane;
        private HBox buttonBox;
        private ManagementCompany company;

        /**
         * Initializes all nodes and other objects, sets formatting, and adds all nodes to main pane
         */
        public FXMainPane() {
            this.propertyNameLabel = new Label("Property Name:");
            cityLabel = new Label("City:");
            rentLabel = new Label("Rent:");
            ownerLabel = new Label("Owner:");

            propertyNameTextField = new TextField();
            cityTextField = new TextField();
            rentTextField = new TextField();
            ownerTextField = new TextField();

            displayTextField = new TextArea();
            displaySb = new StringBuilder();
            displayTextField.setEditable(false);

            addPropertyButton = new Button("Add Property");
            showAllPropertiesButton = new Button("Show All Properties");
            showTotalRentButton = new Button("Show Total Rent");

            buttonHandler = new ButtonHandler();
            addPropertyButton.setOnAction(buttonHandler);
            showAllPropertiesButton.setOnAction(buttonHandler);
            showTotalRentButton.setOnAction(buttonHandler);

            formPane = new GridPane();
            company = new ManagementCompany("Campus Realty", "123-45-6789");

            formPane.setVgap(10);
            formPane.setHgap(10);
            setPadding(new Insets(10));
            setSpacing(10);

            formPane.add(propertyNameLabel, 0, 0);
            formPane.add(cityLabel, 0, 1);
            formPane.add(rentLabel, 0, 2);
            formPane.add(ownerLabel, 0, 3);

            formPane.add(propertyNameTextField, 1, 0);
            formPane.add(cityTextField, 1, 1);
            formPane.add(rentTextField, 1, 2);
            formPane.add(ownerTextField, 1, 3);

            buttonBox =
                    new HBox(10, addPropertyButton, showAllPropertiesButton, showTotalRentButton);

            this.getChildren().addAll(formPane, buttonBox, displayTextField);
        }

        /**
         * Updates the main display
         *
         * @param newText the text to add to the display
         */
        public void updateDisplay(String newText) {
            displaySb.append(newText + "\n");
            displayTextField.setText(displaySb.toString());
        }

        /** Event handler class */
        class ButtonHandler implements EventHandler<ActionEvent> {

            /** Event handler for the buttons */
            public void handle(ActionEvent event) {
                if (event.getTarget().equals(addPropertyButton)) {
                    String propertyName = propertyNameTextField.getText().trim();
                    String city = cityTextField.getText().trim();
                    String rentString = rentTextField.getText().trim();
                    String owner = ownerTextField.getText().trim();

                    if (propertyName.isEmpty() || city.isEmpty() || owner.isEmpty()) {
                        updateDisplay("Error: All fields must be filled in.");
                        return;
                    }

                    double rent = 0;

                    try {
                        rent = Double.parseDouble(rentString);
                    } catch (NumberFormatException e) {
                        updateDisplay("Error: Rent must be a number.");
                        return;
                    }

                    int index = company.addProperty(new Property(propertyName, city, rent, owner));

                    if (index == -1) {
                        updateDisplay(
                                String.format(
                                        "Error: %s already has the maximum number of properties: %d.",
                                        company.getName(), ManagementCompany.MAX_PROPERTIES));

                        return;
                    }

                    updateDisplay(String.format("Property added at index %d.", index));
                    propertyNameTextField.clear();
                    cityTextField.clear();
                    rentTextField.clear();
                    ownerTextField.clear();
                } else if (event.getTarget().equals(showAllPropertiesButton)) {
                    updateDisplay(company.toString());
                } else if (event.getTarget().equals(showTotalRentButton)) {
                    updateDisplay(String.format("Total Rent: $%.2f", company.totalRent()));
                }
            }
        }
    }
}

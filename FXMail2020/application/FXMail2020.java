/*
 * Nwafor Chimnadindu Kingsley 3017499 and Aswin Gunasekaran 3009902  * 
 */
package application;

// standard import
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.scene.Scene;

// file reader import
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// components import
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

// layouts import
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;


public class FXMail2020 extends Application {

	// declare label attributes
	Label lblFrom, lblSubject, lblTo, lblReady;
	// declare button attributes
	Button btnDots, btnOk, btnQuit, btnSend;
	// declare textfield attributes
	TextField txtfFrom, txtfTo, txtfSubject;
	// declare listview
	ListView list;
	// declare textarea
	TextArea txtArea;
	// declare stage
	Stage display;
	

	public void init() {
		// initialise labels
		lblFrom = new Label("From:");
		lblSubject = new Label("Subject:");
		lblTo = new Label("To:");
		lblReady = new Label("Ready");

		// initialise text fields
		txtfFrom = new TextField();
		txtfSubject = new TextField();
		txtfTo = new TextField();

		// initialise text areas
		txtArea = new TextArea();

		// initialise button
		btnQuit = new Button("Quit");
		btnSend = new Button("Send");
		btnDots = new Button("...");
		btnOk = new Button("OK");
		
		
		// initialise list
		list = new ListView();

		// function for button "ok"
		btnOk.setOnAction(ae -> {

			// Get the name that was clicked on.
			String name = list.getSelectionModel().getSelectedItem().toString();

			// Call the showEmailAndAddress method.
			showEmailAndAddress("contact.csv", name);
			display.close();

		});

		list.setOnMousePressed(ae -> {

			// Get the name that was clicked on.
			String name = list.getSelectionModel().getSelectedItem().toString();

			// Call the method to show the corresponding details.
			showEmailAndAddress("contact.csv", name);

		});

		// function for button "..."
		btnDots.setOnAction(e -> displayList());

		// function for button "send"
		btnSend.setOnAction(ae -> {
			
			Alert error = new Alert(Alert.AlertType.WARNING);
			error.setTitle("Error");
			error.setHeaderText("Invalid email format");
			error.setContentText("check and re-type email");
			
			Alert sent = new Alert(Alert.AlertType.CONFIRMATION);
			sent.setTitle("Sent");
			sent.setHeaderText("Message sent");
			
			// checks to validate the email format typed
			if ((checkValidation(txtfTo.getText()) == true) && (checkValidation(txtfFrom.getText()) == true)) {
				txtfTo.setText(txtfTo.getText());	
				txtfFrom.setText(txtfFrom.getText());				
				sent.show();
			} else {								
				error.setContentText("The email:" + "\n" + txtfFrom.getText() + "\n" + txtfTo.getText() + "\nis not recognised");
				error.show();
				txtfTo.setText("");	
				txtfFrom.setText("");
			}
		});

		// function for button "quit"
		btnQuit.setOnAction(ae -> {
			Platform.exit();
		});

	}

	@Override
	public void start(Stage primaryStage) {
		// set title
		primaryStage.setTitle("FXMail2020");

		// create layouts
		// create gridpane and set styling
		GridPane gp = new GridPane();
		gp.getStyleClass().add("gridpane");

		// create hbox and set styling
		HBox hb = new HBox();
		hb.getStyleClass().add("hbox");

		// create vbox and set styling
		VBox vb = new VBox();
		vb.getStyleClass().add("vbox");

		// add component to the hb
		hb.getChildren().addAll(btnQuit, btnSend);

		// add component to the gp
		gp.add(lblFrom, 0, 0);
		gp.add(txtfFrom, 1, 0);

		gp.add(lblSubject, 0, 1);
		gp.add(txtfSubject, 1, 1);

		gp.add(lblTo, 0, 2);
		gp.add(txtfTo, 1, 2);

		gp.add(btnDots, 2, 2);

		// add component to the vb
		vb.getChildren().addAll(gp, txtArea, hb, lblReady);

		// create scene with size
		Scene s = new Scene(vb, 400, 360);
		// set styling
		s.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		// set scene
		primaryStage.setScene(s);

		// show stage
		primaryStage.show();

	}

	// display list method
	public void displayList() {
		// creates new stage
		display = new Stage();

		// set the title
		display.setTitle("Contact list");

		// layout
		// create vbox
		VBox vb = new VBox();

		// create hbox and set styling
		HBox hb = new HBox();
		hb.getStyleClass().add("hbox");
		hb.getChildren().add(btnOk);

		readContactNames();
		vb.getChildren().addAll(list, hb);

		// create scene
		Scene s = new Scene(vb, 400, 150);
		// set styling
		s.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		// set scene
		display.setScene(s);
		// show stage
		display.show();
	}

	public void readContactNames() {

		try {
			// declare attributes
			String contact;

			// create a file reader to access contact
			FileReader fr = new FileReader("contact.csv");

			// create a buffer reader that takes in the file
			BufferedReader buf = new BufferedReader(fr);
			list.getItems().clear();

			// Loop through each line in the file
			while ((contact = buf.readLine()) != null) {

				// An array containing contacts
				String[] contactDataArray = new String[contact.length()];

				// Split the string on ":"
				contactDataArray = contact.split(":");

				// Add just the name to the listview.
				list.getItems().add(contactDataArray[0]);

			} // while()

			buf.close();

		} // try()
		catch (IOException ioe) {

			System.err.print(ioe.toString());

		} // catch()

	}// readContactNames()

	public void showEmailAndAddress(String contactsFile, String name) {

		try {
			// declare attributes
			String line;

			// create a file reader to access contact
			FileReader fr = new FileReader(contactsFile);
			// create a buffer reader that takes in the file
			BufferedReader buf = new BufferedReader(fr);

			// Loop through each line in the file
			while ((line = buf.readLine()) != null) {

				// Check to see if there is a match.
				if (line.startsWith(name)) {

					// A 4 item array to contain contact data components.
					String[] contactDataArray = new String[contactsFile.length()];

					// Split the string on ":"
					contactDataArray = line.split(":");

					// validation check
					if (checkValidation(contactDataArray[2])) {
						txtfTo.setText(contactDataArray[2]);
					} else {
						txtfTo.setText("wrong email format");
					}

				} // if()

			} // while()

			buf.close();

		} // try()
		catch (IOException ioe) {

			System.err.print(ioe.toString());

		} // catch()

	}// showEmailAndAddr()

	public boolean checkValidation(String email) {
		if (email.contains("@") && email.contains(".") && email.contains("")) {
			return true;
		} else {
			return false;
		}
	} // checkValidation()

	public static void main(String[] args) {
		// Launch the application
		launch(args);
	} // main()
}

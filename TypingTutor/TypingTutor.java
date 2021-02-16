//Standard javafx imports.
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;


//Imports for components in this application.
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

//Imports for layout.
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

//Geometry imports.
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.animation.Animation;
//Imports for timing (Measuring time).
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;




public class TypingTutor extends Application {
	
	//Declare components at class scope.
	//Labels.
	Label lblExample, lblType, lblErrors, lblShowErrors, lblTime, lblShowTime;
	
	
	//TextFields.
	TextField txtfExample, txtfType;
	
	//Buttons.
	Button btnStart, btnStop;
	
	
	int errors = 0;
	int elapsedTime = 0;	//Elapsed time in seconds.
	
	//String array to store sentences.
	String[] sentences = new String[5];
	int i = 0;				//Just an array index.
	
	
	Timeline tLine;
	
	
		
	
	public TypingTutor() {
		//Initialise the sentence array.
		sentences[0] = "Mary had a little lamb.";
		sentences[1] = "Whose fleece was white as snow.";
		sentences[2] = "And everywhere that Mary went.";
		sentences[3] = "The lamb was sure to go.";
		sentences[4] = "That's all folks!";
		
				
	}//constructor()
	
	
	@Override
	public void init() {
		
		//Instantiate components with 'new'.
		//Labels.
		lblExample = new Label("Example:");
		lblType = new Label("Type:");
		lblErrors = new Label("Errors:");
		lblShowErrors = new Label("0");
		
		//Labels to display test timing.
		lblTime = new Label("Time(s):");
		lblShowTime = new Label("0");
		
		
		//TextFields.
		txtfExample = new TextField();
		txtfType = new TextField();
		
		//Manage textfield sizes.
		txtfExample.setMinWidth(270);
		
		
		//Buttons.
		btnStart = new Button("Start");
		btnStop = new Button("Stop");
		
		//Manage button sizes.
		btnStart.setMinWidth(60);
		btnStop.setMinWidth(60);
		
		
		//Event handling.
		//The Start button.
		btnStart.setOnAction(ae -> {
			
			//Show the first sentence.
			txtfExample.setText(sentences[0].toString());
			
			//...and clear the lower text field.
			txtfType.clear();
			
			//Clear the error count.
			errors = 0;
			
			//Clear the elapsed time.
			elapsedTime = 0;
			
			
			//Reset the error count.
			lblShowErrors.setText(errors + "");
			
			//Reset the array index to 0.
			i = 0;
			
			//Set up a timer and handle its events.
			tLine = new Timeline(new KeyFrame(
					Duration.millis(1000),
					timertick ->  {
				elapsedTime++;
				lblShowTime.setText(elapsedTime + "");
				
			}));
			
			tLine.setCycleCount(Animation.INDEFINITE);
			tLine.play();
						
			
		});
		
		btnStop.setOnAction(ae -> {
			
			//Stop the timer.
			tLine.stop();
			
			//Show the elapsed time.
			lblShowTime.setText(elapsedTime + "");
						
		});
		
		
		//Respond to typing in the textfield.
		txtfType.setOnKeyReleased(ae -> {
			
			//Check what the user has typed.
			if(txtfExample.getText().startsWith(txtfType.getText())) {
				txtfType.setStyle("-fx-text-inner-color: black");
				
			}//if
			else {
				txtfType.setStyle("-fx-text-inner-color: red");
				
				//Inc the error count.
				errors ++;
				
				//Show the errors in the errors label.
				lblShowErrors.setText(errors + "");
			}//else
			
			
			if(txtfExample.getText().equals(txtfType.getText())){
				
				if(i < sentences.length - 1) {
				//Inc the example sentence array index.
				i = (int) (Math.random()*5);
				
				//Show the next example sentence.
				txtfExample.setText(sentences[i].toString());
				
				//Clear the lower textfield.
				txtfType.clear();
				}//if
				
				
			}//if complete.
			
			
		});
		
				
		
	}//init()

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Set the title.
		primaryStage.setTitle("TypingTutor V1.0.0");
		
		//Set the width and height.
		primaryStage.setWidth(450);
		primaryStage.setHeight(200);
		
		//Create a layout.
		VBox vbMain = new VBox();
		GridPane gp = new GridPane();
		HBox hbButtons = new HBox();
		
		//Add components to the layout.
		//Row 0:
		gp.add(lblExample, 0, 0);
		gp.add(txtfExample, 1, 0);
		gp.add(lblErrors, 2, 0);
		gp.add(lblShowErrors, 3, 0);
		
		//Row 1:
		gp.add(lblType, 0, 1);
		gp.add(txtfType, 1, 1);
		
		//Time display labels.
		gp.add(lblTime, 2, 1);
		gp.add(lblShowTime, 3, 1);
		
		gp.setHgap(10);
		gp.setVgap(10);
		
		
		
		//The buttons.
		hbButtons.getChildren().addAll(btnStop, btnStart);
		hbButtons.setSpacing(10);
		hbButtons.setAlignment(Pos.BASELINE_RIGHT);
		
			
		//Add all other containers to the main container.
		vbMain.getChildren().add(gp);
		vbMain.getChildren().add(hbButtons);
		vbMain.setSpacing(10);
		vbMain.setPadding(new Insets(10));
		
		//Create a scene.
		Scene s = new Scene(vbMain);
		
		
		//Set the scene.
		primaryStage.setScene(s);
		
		//Show the stage.
		primaryStage.show();
		
		
	}//start()


	public static void main(String[] args) {
		//Launch the application.
		launch();
		
	}//main()

}//class
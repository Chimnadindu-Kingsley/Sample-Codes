import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

//Components of this application
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;

//Layout, import containers
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
//Supports in quitting the applications
import javafx.application.Platform;


public class InterestCalculator extends Application {
	
	Button btnQuit, btnCalculate, btnCalender, btnDelete, btn1, btn2, btn3;
	
	TextField txtfCapAmount, txtfInterestRate, txtfInvTerm;
	
	//TextArea
	TextArea txtMain;
	
	//Labels
	Label lblCapAmount, lblInterestRate, lblInvTerm;
	
	//Checkbox
	CheckBox chkSimple, chkCompound;

	public InterestCalculator() {
		
	btnQuit = new Button("Quit");
	btnCalculate = new Button("Calculate");
	btnCalender = new Button("Calender");
	btnDelete = new Button("Delete");
	btn1 = new Button("<--");
	btn2 = new Button("<--");
	btn3 = new Button("<--");
	
	//Set button size
	btnQuit.setMinWidth(70);
	btnQuit.setMinHeight(25);
	btnCalculate.setMinWidth(70);
	btnCalculate.setMinHeight(25);
		
	txtfCapAmount = new TextField();
	txtfInterestRate = new TextField();
	txtfInvTerm = new TextField();
			
	txtMain = new TextArea();
		
	lblCapAmount = new Label("Capital Amount");
	lblInterestRate = new Label("Interest Rate");
	lblInvTerm = new Label("Investment Term");
	
	chkSimple = new CheckBox("Simple Interest");
	chkCompound = new CheckBox("Compound Interest");
	}//Constructor()
	@Override
	
	public void init() {
		
		btnQuit.setOnAction(ae -> Platform.exit());
		
		btnCalender.setOnAction(ae -> showTermDialog());
		
		btnDelete.setOnAction(ae -> txtMain.deleteText(txtMain.getSelection()));
			
//			//Deletes selected text
//			txtMain.deleteText(txtMain.getSelection());
//			
//			//Clears the CapAmount
//			txtfCapAmount.clear();
//			
//			//Clears the Interest rate
//			txtfInterestRate.clear();
//			
//			//Clears the Investment term
//			txtfInvTerm.clear(); 
//			});
		btn1.setOnAction(ae -> txtfCapAmount.clear());
		btn2.setOnAction(ae -> txtfInterestRate.clear());
		btn3.setOnAction(ae -> txtfInvTerm.clear());
		
		btnCalculate.setOnAction(ae -> showInterestAnalysis());
		
	}//init()	
	
	public void showTermDialog() {
		
		//Create a secondary stage
		Stage termDialogStage = new Stage();
		
		//To set the title for the stage
		termDialogStage.setTitle("Select starts and end dates");
		
		//Set the dimension
		termDialogStage.setHeight(250);
		termDialogStage.setWidth(300);
		
		//Create a label
		Label lblStartDate = new Label("Inverstment start date: ");
		Label lblEndDate = new Label("Investment end date: ");
		
		//Date picker controls support entry of dates
		DatePicker dpStartDate = new DatePicker();
		DatePicker dpEndDate = new DatePicker();
		//DatePicker NewDate = new DatePicker();
		dpStartDate.setValue(LocalDate.now());
		dpEndDate.setValue(LocalDate.now());
		
		//Set the date edit property, to prevent them from being cleared
		dpStartDate.setEditable(false);
		dpEndDate.setEditable(false);
		
//		if(startDate.isBefore(endDate)) {
//			
//		long years = ChronoUnit.YEARS.between(startDate, endDate);
//		}
		
		//Create button
		Button btnOk = new Button("Ok");
		Button btnCancel = new Button("Cancel");
		
		//Create a grid pane
		GridPane gpDialog = new GridPane();
		
		//Add component to the grid pane
		gpDialog.add(lblStartDate, 0, 0);
		gpDialog.add(dpStartDate, 1, 0);
		
		gpDialog.add(lblEndDate, 0, 1);
		gpDialog.add(dpEndDate, 1, 1);
		
		HBox hbBtn = new HBox();
		hbBtn.getChildren().addAll(btnCancel, btnOk);
		hbBtn.setAlignment(Pos.BASELINE_RIGHT);
		
		gpDialog.add(hbBtn, 1, 2);
		
		//Create a scene
		Scene s = new Scene(gpDialog);
		
		termDialogStage.setScene(s);
		
		
		//To show the stage
		termDialogStage.show();
		
		//Assign function to the Cancel button
		btnCancel.setOnAction(ae -> termDialogStage.close());
		
		//Assign function to the Ok button
		btnOk.setOnAction(ae -> {
			//Get the dates entered by the user
			LocalDate startDate = dpStartDate.getValue();
			//LocalDate NewDate = NewDate.getValue();
			LocalDate endDate = dpEndDate.getValue();
			
			
			//
			
			
			//Calculates the years between the dates
			long years = ChronoUnit.YEARS.between(startDate, endDate);
			
			
			//Put the years into the txtfInvTerm textfield
			txtfInvTerm.setText(years + "");
			
			//Close the dialog
			termDialogStage.close();
			
		});
		
	}//showTermDialog()
	
	public double getSimpleInterest(double amount, double iRate, double years) {
		
		double interest = 0;
		double increasedCapital;
		String analysisString = "";
		
		//The interest is the amount * iRate * years
		interest = amount * (iRate/100) * years;
		return interest;
		
	}//getSimpleInterest()
	
	
	public void showSimpleInterest(double amount, double iRate, double years) {
		
		double interest = 0;
		double increasedCapital;
		String analysisString = "";
		
		//The interest is the amount * iRate * years
		double interestAmount = getSimpleInterest(amount, iRate, years);
		increasedCapital = amount + interestAmount;
		
		//Currency formatting
		NumberFormat currFormat = NumberFormat.getCurrencyInstance(Locale.getDefault());
		NumberFormat euroFormat = NumberFormat.getCurrencyInstance(Locale.GERMANY);
		
		//Show the analysis
		analysisString += "Simple interest: \nYear " + years + ": Initial capital: " + euroFormat.format(amount) + "   Interest earned: " + euroFormat.format(interestAmount) + "   Final amount: " + euroFormat.format(increasedCapital); 
		txtMain.setText(analysisString);
	}//showSimpleInterest()
	
	
	public void showCompoundInterest(double amount, double iRate, double years) {		
	
		double interestAmt = 0;
		double increasedCapital = amount;
		double totalInterest = 0;
		
		String analysisString = "";
		
		//Currency formatting
		NumberFormat currFormat = NumberFormat.getCurrencyInstance(Locale.getDefault());
		NumberFormat euroFormat = NumberFormat.getCurrencyInstance(Locale.GERMANY);
		
		for(int i=1; i<= years; i++) {
		//The interest is amount * (iRate/100) * year
		interestAmt = getSimpleInterest(increasedCapital, iRate, 1);
		totalInterest = totalInterest + interestAmt;
		increasedCapital = increasedCapital + interestAmt;
		
		}//for()
		
		//Build the analysis string.
		analysisString += "\n\nCompound Interest:\nYear: " + years + " Initial Capital: " + euroFormat.format(amount) + " Interest earned " + euroFormat.format(totalInterest) + " Final amount: " + euroFormat.format(increasedCapital);
		
		//Show the analysis
		txtMain.setText(analysisString);
		
	}//showCompoundInterest()
	
	public void showInterestAnalysis() {
		
		double amount = 0;
		double iRate = 0;
		double years = 0;
		
		//Try to obtain the value from the input
		try {
			amount = Double.parseDouble(txtfCapAmount.getText());
			iRate = Double.parseDouble(txtfInterestRate.getText());
			years = Double.parseDouble(txtfInvTerm.getText());
		}//try()
		
		catch (NumberFormatException nfa) {
			System.err.print("Error: No data entered. " + nfa.toString());
		}//catch()
		
		if(chkSimple.isSelected()) {
			showSimpleInterest(amount, iRate, years);
		}
		
		if(chkCompound.isSelected()) {
			showCompoundInterest(amount, iRate, years);
		}
		
				
	}//showInterestAnalysis()
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//set the title
		primaryStage.setTitle("Interest Calculator");
		
		//set the width and height
		primaryStage.setWidth(430);
		primaryStage.setHeight(400);
		
		//Create the Layout(window)
		GridPane gp = new GridPane();
		
		//Set the horizonatal and vertical gap
		gp.setHgap(10);
		gp.setVgap(10);
		
		//Set padding around
		gp.setPadding(new Insets(10));
		
		//Create a VBox
		VBox vbMain = new VBox();
		
		//Add components to the layout (Window)
		//row0
		gp.add(lblCapAmount, 0, 0);
		gp.add(txtfCapAmount, 1, 0);
		txtfCapAmount.setMaxWidth(115);
		gp.add(btn1, 2, 0);
		
		//row1
		gp.add(lblInterestRate, 0, 1);
		gp.add(txtfInterestRate, 1, 1);
		txtfInterestRate.setMaxWidth(115);
		gp.add(btn2, 2, 1);
		
		//row2
		gp.add(lblInvTerm, 0, 2);
		gp.add(txtfInvTerm, 1, 2);
		txtfInvTerm.setMaxWidth(115);
		gp.add(btnCalender, 3, 2);
		gp.add(btn3, 2, 2);
		
		//row3 (CheckBox)
		gp.add(chkSimple, 0, 3);
		
		//row4 (CheckBox)
		gp.add(chkCompound, 0, 4);
		
		//Add gp to a vbox
		vbMain.getChildren().add(gp);
		
		//Add the main text area
		vbMain.getChildren().add(txtMain);
		
		//Create HBox for the buttons
		HBox hbButton = new HBox();
		hbButton.getChildren().addAll(btnDelete, btnCalculate, btnQuit);
		hbButton.setAlignment(Pos.BASELINE_RIGHT);
		hbButton.setSpacing(10);		
		
		//The button
		vbMain.getChildren().addAll(hbButton);	
		
		//Set the spacing for the vBOX
		vbMain.setSpacing(10);
		
		//Set the padding
		vbMain.setPadding(new Insets(10));
		
		
		//Create the scene
		Scene s = new Scene(vbMain);
		
		//Set the scene to the stage
		primaryStage.setScene(s);
		
		//Show the stage
		primaryStage.show();
	}//primaryStage()

	public static void main(String[] args) {
		
		launch();
	}//main method()

}

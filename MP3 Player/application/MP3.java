// Nwafor Chimnadindu Kingsley
package application;

// standard imports
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import javafx.scene.Scene;

// collections import
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

// control component import
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;

// text import
import javafx.scene.text.Text;

// layout import
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

// music player import
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaPlayer.Status;

// file and utility import
import java.io.File;
import java.io.FileFilter;
import java.util.Optional;
import java.util.function.Predicate;

// image import
import javafx.scene.image.Image;

//Declare components at class scope.
public class MP3 extends Application {

	// Labels.
	Label lblAvailable, lblVolume, lblSelected, lblStatus;

	// Button
	Button btnAdd, btnRemove, btnAll, btnPlay, btnPause, btnStop;

	// Button Type
	ButtonType button;

	// List-view
	ListView<String> lvAvailable, lvSelected;

	// Media Player
	MediaPlayer Player;

	// Music
	Media MP3;

	// Slider Bar
	Slider slVolumn, slLength;

	// Text
	Text txt, name;

	// Status
	Status status;

	File f;

	// Constructor
	public MP3() {

		// Initialize label
		lblAvailable = new Label("   Available Tracks: ");
		lblVolume = new Label("Volume: ");
		lblSelected = new Label("   Selected Tracks: ");
		lblStatus = new Label("   Status: ");

		// Initialize button and disable all
		btnAdd = new Button("Add >");
		btnAdd.setDisable(true);

		btnRemove = new Button("< Remove");
		btnRemove.setDisable(true);

		btnAll = new Button("<< Remove All");
		btnAll.setDisable(true);

		btnPlay = new Button("Play");
		btnPlay.setDisable(true);

		btnPause = new Button("Pause");
		btnPause.setDisable(true);

		btnStop = new Button("Stop");
		btnStop.setDisable(true);

		// Initialize listview
		lvAvailable = new <String>ListView();
		lvSelected = new <String>ListView();

		// Initialize slider bar
		slVolumn = new Slider(0, 1, 0.1);
		slVolumn.getStyleClass().add("slVolumn");
		slVolumn.setValue(0.3);

		slLength = new Slider(0, 1, 0);
		slLength.getStyleClass().add("slLength");

		// Initialize text
		txt = new Text();
		name = new Text();
		name.getStyleClass().add("name");
		
	}// Constructor()

	@Override
	// Event handler method
	public void init() {

		// Add button action using List view handler
		btnAdd.setOnAction(ae -> {
			// get the selected item on the Available track and converts to string
			String list1 = lvAvailable.getSelectionModel().getSelectedItem().toString();
			
			if (list1 != null && !lvSelected.getItems().contains(list1)) {
				// add the selected item to the Selected track list-view
				lvSelected.getItems().add(list1);
				// deactivates the (btnAdd) button
				btnAdd.setDisable(true);
			} else {
				// deactivates the (btnAdd) button
				btnAdd.setDisable(true);
			}
		});// btnAdd()

		// Remove button action using list view handler
		btnRemove.setOnAction(ae -> {
			// get the selected item and converts to string
			String list = lvSelected.getSelectionModel().getSelectedItem().toString();
			// Remove the selected item to the Selected track list-view
			lvSelected.getItems().remove(list);
			// gets the current media file path and playing track name
			String path = Player.getMedia().getSource().toString();
			/*
			 * condition if the selected track to remove is a substring of the file path and
			 * playing track name
			 */
			if (path.contains(list)) {
				// stops the playing track
				Player.stop();
			}
		});// btnRemove()

		// Remove All button action using set on action
		btnAll.setOnAction(ae -> {
			// create the trackList using the observable list
			ObservableList<String> trackList2 = FXCollections.<String>observableArrayList();
			// Add the tracks to the ListView.
			lvSelected.setItems(trackList2);
			// clear the entire list-view
			trackList2.clear();
			// condition if there is a songs playing or paused
			if (status == Status.PLAYING || status == Status.PAUSED) {
				// stops the song
				Player.stop();
			}
			// deactivates the all button except (btnAdd)
			btnPause.setDisable(true);
			btnStop.setDisable(true);
			btnRemove.setDisable(true);
			btnAll.setDisable(true);
			btnPlay.setDisable(true);
		});// btnAll()

		// Play button action
		btnPlay.setOnMouseClicked(ae -> {
			// condition if a song is paused
			if (status == Status.PAUSED) {
				// this method resumes the paused song
				paused();
				// condition if there is no paused song
			} else {
				// this method stops all songs from playing
				playing();
				// this method plays the selected song from (lvSelected)
				playSong();
				// this method binds the volume to the slider (slVolumn)
				volumn();
				// this method displays the current time as text in (txt) and binds to the
				displayTime();
			}
			// activates the (btnPause, btnStop) button
			btnPause.setDisable(false);
			btnStop.setDisable(false);
		});// btnPlay

		// Pause button action
		btnPause.setOnAction(ae -> {
			// this method pauses the song
			pauseSong();
			// activates the (btnPlay) button
			btnPlay.setDisable(false);
			// call the display pause method
			displayPaused();
		});// btnPause()

		// Stop button action
		btnStop.setOnAction(ae -> {
			// this method stops the song
			stopSong();
			// activates the (btnPlay) button
			btnPlay.setDisable(false);
			// deactivates the (btnPause) button
			btnPause.setDisable(true);
		});// btnStop()

		// Set the display event for the Available track list view when clicked
		lvAvailable.setOnMouseClicked(ae -> {
			// activates the (btnAdd) button
			btnAdd.setDisable(false);
			// deactivates the (btnPlay, btnPause, btnStop, btnRemove) button
			btnPause.setDisable(true);
			btnStop.setDisable(true);
			btnPlay.setDisable(true);
			btnRemove.setDisable(true);
		});// lvAvailable()

		// Set the display event for the Selected track list view when clicked
		lvSelected.setOnMouseClicked(ae -> {
			// activates the (btnPlay, btnRemove, btnAll) button
			btnPlay.setDisable(false);
			btnRemove.setDisable(false);
			btnAll.setDisable(false);
			btnAdd.setDisable(true);
			// condition if there is a song playing
			if (status == Status.PLAYING) {
				// activates the (btnPause, btnStop) button
				btnPause.setDisable(false);
				btnStop.setDisable(false);
			} else {
				// deactivates the (btnPause, btnStop) button
				btnPause.setDisable(true);
				btnStop.setDisable(true);
			}
		});// lvSelected()

		// sets the slider seek function when dragged
		slLength.setOnMousePressed(ae -> {
			// allow change in slider to alter current song time (fast forward || rewind
			// song)
			Player.seek(Player.getMedia().getDuration().multiply(slLength.valueProperty().getValue()));
		});// slLength()

	}// init()

	// the volume bind method
	public void volumn() {
		// binds the MediaPlayer to the slider (slVolumn)
		Player.volumeProperty().bind(slVolumn.valueProperty());
	}// volumn()

	// the get song method
	public void getSong() {
		String path = f.getPath();
		// get the selected item and converts to string
		String name = lvSelected.getSelectionModel().getSelectedItem().toString();
		// creates a new Media and controls the file path with the name of the song
		MP3 = new Media(new File(path + "\\" + name).toURI().toString());
		// adds the Media file to the MediaPlayer
		Player = new MediaPlayer(MP3);
	}// getSong()

	// the Media playSong method
	public void playSong() {
		// this method gets the MediaPlayer song
		getSong();
		// gets the status of the song
		status = Player.getStatus();
		// condition if the status is UNKNOWN, HALTED or READY
		if (status == Status.UNKNOWN || status == Status.HALTED || status == Status.READY) {
			// plays the song in the MediaPlayer
			Player.play();
			// sets the MediaPlayer status to PLAYING
			status = Status.PLAYING;
			// sets the event when a song plays to the end
			Player.setOnEndOfMedia(new Runnable() {
				@Override
				// the (sub-thread) run method
				public void run() {
					// repeats the previous song in the MediaPlayer
					repeat();
				}
			});
		}
	}// playSong()

	// the Media playing method
	public void playing() {
		// condition if the status is current PLAYING
		if (status == Status.PLAYING) {
			// stops the song in the MediaPlayer
			Player.stop();
		}
	}// playing()

	// the Media check if paused method
	public void paused() {
		// condition if the status is PAUSED
		if (status == Status.PAUSED) {
			// plays the song in the MediaPlayer
			Player.play();
			// sets the MediaPlayer status to PLAYING
			status = Status.PLAYING;
		}
	}// paused()

	// the Media pauseSong method
	public void pauseSong() {
		// gets the status of the song
		status = Player.getStatus();
		// condition if the status is PLAYING
		if (status == Status.PLAYING) {
			// pause the song in the MediaPlayer
			Player.pause();
			// sets the MediaPlayer status to PAUSED
			status = Status.PAUSED;
		}
	}// pauseSong()

	// the Media stopSong method
	public void stopSong() {
		// gets the status of the song
		status = Player.getStatus();
		// condition if the status is PLAYING
		if (status == Status.PLAYING || status == Status.PAUSED) {
			// stops the song in the MediaPlayer
			Player.stop();
			// sets the status to STOPPED
			status = Status.STOPPED;
		}
	}// stopSong()

	// the repeat loop method
	public void repeat() {
		// stops the song in the MediaPlayer
		stopSong();
		txt.setText("Repeat");
		// re-plays the current song in the MediaPlayer
		Player.play();
		// deactivates the (btnPlay) button
		btnPlay.setDisable(true);
		// creates an Alert Information type
		Alert repeat = new Alert(AlertType.INFORMATION);
		// sets the header
		repeat.setHeaderText("REPEAT ACTIVATED");
		// set the content
		repeat.setContentText("Pressing OK will deactivate repeat and stop the song");
		// creates an optional button type || show the alert
		Optional<ButtonType> result = repeat.showAndWait();
		// assign the optional button type to a button type
		button = result.orElse(ButtonType.CANCEL);
		// condition if the button type is equal to the Alert button OK
		if (button == ButtonType.OK) {
			// this method stops the song
			stopSong();
		}
	}// repeat()

	public void playAll() {

	}

	// to display the duration of track time on txt and slLength method
	public void displayTime() {
		// gets the current time property and use listener
		Player.currentTimeProperty().addListener((observable, oldTime, newTime) -> {
			// set the song duration to the min and max value of the slider (slLength)
			slLength.valueProperty().setValue(newTime.toMinutes() / Player.getTotalDuration().toMinutes());
			// format for the minute counter
			String formatM = String.format("%d", (int) Player.getCurrentTime().toMinutes());
			// format for the seconds counter
			String formatS = String.format("%d", (int) Player.getCurrentTime().toSeconds() % 60);
			// condition if the song is currently playing
			if (status == Status.PLAYING) {
				// assign the 2 string values to a string value
				String formattedTime = "Playing:  " + formatM + ":" + formatS;
				// set text (txt) to display the formatted time
				txt.setText(formattedTime);
				String get = lvSelected.getSelectionModel().getSelectedItem().toString();
				if (get.length() >= 40) {
				String subName = get.substring(0, 40);
				name.setText(subName);
				} else {
					name.setText(get);
				}
			} else if (status == Status.STOPPED) {
				// set text (txt) to display that the song have stopped
				txt.setText("Stopped");
				
			}
		});
	}// displayTime()

	// condition if the song is paused
	public void displayPaused() {
		// format for the minute counter
		String formatM = String.format("%d", (int) Player.getCurrentTime().toMinutes());
		// format for the seconds counter
		String formatS = String.format("%d", (int) Player.getCurrentTime().toSeconds() % 60);
		// assign the 2 string values to a string value
		String formattedTime = "Paused:  " + formatM + ":" + formatS;
		// set text (txt) to display the formatted time
		txt.setText(formattedTime);
		//name.setText("");
	}

	@Override
	// primaryStage method
	public void start(Stage primaryStage) {
		// try
		try {

			// set the title
			primaryStage.setTitle("MP3 BlastBox");

			// create the layout and add style sheet
			VBox V1 = new VBox();
			V1.getStyleClass().add("vbox");
			VBox V2 = new VBox();
			V2.getStyleClass().add("vbox");
			VBox V3 = new VBox();
			V3.getStyleClass().add("vbox");
			HBox H = new HBox();
			H.getStyleClass().add("hbox");

			GridPane gp = new GridPane();
			gp.getStyleClass().add("gridpane");

			// add component to the layout
			// to implement the full vbox styling, (lvAvalable) is added to it
			V1.getChildren().add(lvAvailable);
			V2.getChildren().addAll(btnAdd, btnRemove, btnAll, btnPlay, btnPause, btnStop, lblVolume, slVolumn);
			// to implement the full vbox styling, (lvSelected) is added to it
			V3.getChildren().add(lvSelected);
			H.getChildren().addAll(lblStatus, txt);

			/*
			 * Here the list view are added to the vbox first before being added to the
			 * gridpane to get the required styling from the css (application.css) file
			 */
			gp.add(lblAvailable, 1, 0);
			gp.add(lblSelected, 3, 0);
			gp.add(V1, 1, 1);
			gp.add(V2, 2, 1);
			gp.add(V3, 3, 1);
			gp.add(H, 3, 2);
			gp.add(name, 1, 3);
			gp.add(slLength, 3, 3);

			// create a new directory
			DirectoryChooser dc = new DirectoryChooser();
			// set the title
			dc.setTitle("Select your music folder");			
			// call up the directory and display on primaryStage
			f = dc.showDialog(primaryStage);
			// call the get music file method
			getMusicFiles();
			

			// create the scene
			Scene scene = new Scene(gp, 550, 420);
			// add the style sheet
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			// add the icon
			primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("song.jpg")));
			// set the scene
			primaryStage.setScene(scene);
			// show the stage
			primaryStage.show();

		} // try()

		// catch exception for error
		catch (Exception e) {
			e.printStackTrace();
		} // catch()

	}// primaryStage()

	// main method
	public static void main(String[] args) {
		launch(args);
	}// main method()

	// the get music file method
	public void getMusicFiles() {
		// ObservableList for the music files.
		ObservableList<String> musicFiles = FXCollections.observableArrayList();
		// Array for the files.
		String[] fileList;
		// Call list() to get a directory listing into the string array.
		fileList = f.list();
		// Add the array of files to the musicFiles ObservableList.
		musicFiles.addAll(fileList);		
		// Return the ObservableList. Done.
		lvAvailable.setItems(musicFiles);
		
	}// getMusicFiles()
}

package assignment2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

//===================================================  
// Name       :  Nicole Ortiz   
// SID        :  31404203
// Course     :  IT 114
// Section    :  451
// Instructor :  Deek
// T.A        :  ---
//===================================================  
//===================================================  
// Assignment # :   2
// Date         :  10/19/18
//===================================================  
//===================================================  
// Description : Design and implement a Java program 
// that creates a GUI that will let a user design 
// the perfect car for them at a local car dealer.
//===================================================  
public class Assignment2 extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        // Group Make
        ToggleGroup make = new ToggleGroup();
        RadioButton honda = new RadioButton("Honda");
            honda.setToggleGroup(make);
            honda.setSelected(true);
        RadioButton button2 = new RadioButton("Female");
            button2.setToggleGroup(make);
        
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

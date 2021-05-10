/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class sceneController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;

    //Login
    @FXML
    void login_button_isClicked(ActionEvent event) {
        switchScreen(event, "/Scenes/Schrankauswahl.fxml", "Schrankauswahl");
    }
    
    //Scrankauswahl
    @FXML
    void confirm_button_isClicked(ActionEvent event) {
        switchScreen(event, "/Scenes/Menu_admin.fxml", "Menu");
    }
    
     //Testbetrieb ausgewählt
    @FXML
    void testbetrieb_button_isClicked(ActionEvent event) {
        switchScreen(event, "/Scenes/Initialisierung_Start.fxml", "Initialisierung Starten");
    }

    //Handbetrieb ausgewählt
    @FXML
    void handbetrieb_button_isClicked(ActionEvent event) {

    }
    
    //Einstellungen ausgewählt
    @FXML
    void settings_button_isClicked(ActionEvent event) {

    }
    
    //Programm beenden
    @FXML
    void exit_button_isClicked(ActionEvent event) {
        System.exit(0);
    }


    //Abbrechen führt immer zurück zum Hauptmenü
    @FXML
    void abbrechen_button_isClicked(ActionEvent event) {
        switchScreen(event, "/Scenes/Menu_admin.fxml", "Menu");
    }
    
    //Initialisierung starten
    @FXML
    void initialisierungStart_button_isClicked(ActionEvent event) {
        switchScreen(event, "/Scenes/Initialisierung.fxml" , "Initialisierung");
    }

    //Weiter button zum Testprodukt Check-In Starten
    @FXML
    void weiterZumTestProduktCheckIn_button_isClicked(ActionEvent event) {
        switchScreen(event, "/Scenes/TestproduktCheckIn_Start.fxml", "Testprodukt Check-In Starten");
    }
    //Testprodukt Check-In Starten
    @FXML
    void testProduktCheckStart_button_isClicked(ActionEvent event){
        switchScreen(event, "/Scenes/TestproduktCheckIn.fxml", "Testprodukt Check-In");
    }

    public void switchScreen(ActionEvent event, String sceneName, String title) {
        try {
            root = FXMLLoader.load(getClass().getResource(sceneName));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle(title);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(sceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}

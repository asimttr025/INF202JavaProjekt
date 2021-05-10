/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ertas
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Ertas
 */
public class kuehlschrankProjekt extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/Scenes/Login.fxml"));
        stage.setMinWidth(928);
        stage.setMinHeight(603);
        stage.setMaxWidth(928);
        stage.setMaxHeight(603);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Login Seite");
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

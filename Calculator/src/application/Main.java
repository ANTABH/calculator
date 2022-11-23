package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
    	Parent rootFXML = FXMLLoader.load(getClass().getResource("Calculator.fxml"));
        Scene sceneFXML = new Scene(rootFXML);
        
        //titre de l'app
        primaryStage.setTitle("Calculatrice");
        
        //Attribut la composition de ma fenêtre à ma fenêtre principale
        primaryStage.setScene(sceneFXML);
        
        //Affiche la fenêtre principale
        primaryStage.show();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }

    public static void main(String[] args) {
        launch(args);
    }
}
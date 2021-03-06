package com.projetopoo.applicationFX;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application{
	
	@Override
    public void start(Stage primaryStage) {
        
		primaryStage.setTitle("Teste!");
        
        Button btn = new Button();
        
        btn.setText("Clique aqui...");
        
        btn.setOnAction(event -> System.out.println("Você clicou no botão..."));
                    
        StackPane root = new StackPane();
        
        root.getChildren().add(btn);
        
        primaryStage.setScene(new Scene(root, 300, 250));
        
        primaryStage.show();
    }
	
	public static void main(String[] args) {
        launch(args);
    }
}
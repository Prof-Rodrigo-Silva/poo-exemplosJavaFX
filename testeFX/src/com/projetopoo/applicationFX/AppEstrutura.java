package com.projetopoo.applicationFX;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class AppEstrutura extends Application{
	
	@Override
    public void start(Stage primaryStage) {
		
		//Formato da minha cena(layout)
		FlowPane layout = new FlowPane();
		
		//Cenário
		Scene cena = new Scene(layout, 500, 250);
        
		// Nós (Elementos gráficos que compões a cena)
		Label rotulo = new Label();
		rotulo.setText("Testando o label...");
		
		//Vincular o nó a cena através do layout
		layout.getChildren().add(rotulo);
		
		//Subir a cena para o palco
        primaryStage.setScene(cena);
        
        // Exibir o palco com a cena
        primaryStage.show();
    }
	
	public static void main(String[] args) {
        launch(args);
    }
}

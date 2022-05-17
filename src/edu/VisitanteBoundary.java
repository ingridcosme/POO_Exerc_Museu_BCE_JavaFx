package edu;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class VisitanteBoundary extends Application {

	private TextField txtId = new TextField();
	private TextField txtNomeVisitante = new TextField();
	private TextField txtNomeEscola = new TextField();
	private TextField txtData = new TextField();
	
	private Button botaoAdicionar = new Button("Adicionar");
	private Button botaoPesquisar = new Button("Pesquisar");
	
	private VisitanteControl control = new VisitanteControl();
	
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Museu de História Natural - Cadastro de Visitantes");
		
		Label labelId = new Label("Id");
		Label labelNomeVisitante = new Label("Nome do Visitante");
		Label labelNomeEscola = new Label("Nome da Escola");
		Label labelData = new Label("Data da Visita");
		
		GridPane gridPane = new GridPane();
		gridPane.setPadding(new Insets (10, 10, 10, 10));
		
		gridPane.add(labelId, 0, 0);
		gridPane.add(txtId, 1, 0);
		gridPane.add(labelNomeVisitante, 0, 1);
		gridPane.add(txtNomeVisitante, 1, 1);
		gridPane.add(labelNomeEscola, 0, 2);
		gridPane.add(txtNomeEscola, 1, 2);
		gridPane.add(labelData, 0, 3);
		gridPane.add(txtData, 1, 3);
		gridPane.add(botaoAdicionar, 0, 4);
		gridPane.add(botaoPesquisar, 1, 4);
		gridPane.setVgap(10);
		gridPane.setHgap(20);
		
		Bindings.bindBidirectional(txtId.textProperty(), control.idProperty());
		Bindings.bindBidirectional(txtNomeVisitante.textProperty(), control.nomeVisitanteProperty());
		Bindings.bindBidirectional(txtNomeEscola.textProperty(), control.nomeEscolaProperty());
		Bindings.bindBidirectional(txtData.textProperty(), control.dataProperty());

        botaoAdicionar.setOnAction((e) -> {
        	StringBuffer buffer = new StringBuffer();
    		buffer.append("Visitante adicionado com sucesso!");
    		buffer.append("\n" + control.getId());
    		buffer.append("\n" + control.getNomeVisitante());
    		buffer.append("\n" + control.getNomeEscola());
    		buffer.append("\n" + control.getData());
            control.adicionar();
            new Alert(Alert.AlertType.INFORMATION, buffer.toString()).show();
            txtId.setText("");
            txtNomeVisitante.setText("");
            txtNomeEscola.setText("");
            txtData.setText("");
        });

        botaoPesquisar.setOnAction((e) -> {
            control.pesquisar();
        });
		
		Scene scene = new Scene(gridPane, 400, 200);
		stage.setScene(scene);
		stage.show();
		
	}
	
	public static void main(String[] args) {
		Application.launch(VisitanteBoundary.class, args);
	}

}

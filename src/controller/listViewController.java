package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

public class listViewController implements Initializable{

    @FXML
    private ListView<String> myListView;
    @FXML
    private Button btAdicionar;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String[] food = {"pizza","banana","maçã"};

        myListView.getItems().addAll(food);
        adicionar("Banana");
    }

    public void adicionar(String nome){
        btAdicionar.setOnMouseClicked((MouseEvent e)->{
            btAdicionar.setVisible(true);
            myListView.getItems().add(nome);
            myListView.refresh();
        });
    }

    public void remover(){
        
    }
    
}

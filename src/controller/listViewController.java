package controller;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class listViewController implements Initializable{

    @FXML
    private ListView<String> myListView;
    @FXML
    private Button btAdicionar;
    @FXML
    private Button btRemover;
    @FXML
    private Button btEditar;
    @FXML
    private TextField textField;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }


    //Create
    @FXML
    public void adicionar(ActionEvent event){
        if (!textField.getText().isEmpty())
        {
            myListView.getItems().add(textField.getText());
            myListView.refresh();
            textField.clear();
        }
        else{System.out.println("Vazio");}
    }


    //Delete
    @FXML
    public void remover(ActionEvent event){
        
            int index = myListView.getSelectionModel().getSelectedIndex();
            myListView.getItems().remove(index);
            myListView.refresh();
    }
}

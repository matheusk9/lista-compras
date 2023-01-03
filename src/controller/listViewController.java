package controller;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

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
    private Button btConfirmar;
    @FXML
    private TextField textField;
    @FXML
    private TextField editField;
    @FXML
    private AnchorPane telaEditar;
    @FXML
    private AnchorPane telaPrincipal;
    @FXML
    private Pane gpBotoes;

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
        else{System.out.println("Insira algum texto!");}
    }


    //Delete
    @FXML
    public void remover(ActionEvent event){
        if (myListView.getItems().size() > 0) {
            int index = myListView.getSelectionModel().getSelectedIndex();
            myListView.getItems().remove(index);
            myListView.refresh();
        } else {
            System.out.println("Lista vazia!!");
        }
    }


    //Update
    @FXML
    public void editar(ActionEvent event){
        if (myListView.getItems().size() > 0 ) {
            
            int index = myListView.getSelectionModel().getSelectedIndex();
            gpBotoes.setVisible(false);
            telaEditar.setVisible(true);
            editField.setText(myListView.getItems().get(index));
            
            btConfirmar.setOnMouseClicked(e -> {
                myListView.getItems().set(index, editField.getText());
                telaEditar.setVisible(false);
                gpBotoes.setVisible(true);
                editField.clear();
            });
            myListView.refresh();
        } else {
            System.out.println("Lista Vazia!!");
        }

    }
}

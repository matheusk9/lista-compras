package controller;
<<<<<<< HEAD
import java.net.URL;
import java.util.ResourceBundle;
=======

import java.net.URL;
import java.util.ResourceBundle;

>>>>>>> d91d551120c3b6407a6133b6f46287cad675914b
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

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
<<<<<<< HEAD

=======
        String[] food = {"pizza","banana","maçã"};
        myListView.getItems().addAll(food);
>>>>>>> d91d551120c3b6407a6133b6f46287cad675914b
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
<<<<<<< HEAD
        else{System.out.println("pppp");}
=======
>>>>>>> d91d551120c3b6407a6133b6f46287cad675914b

    }


    //Delete
    @FXML
    public void remover(ActionEvent event){
        int index = myListView.getSelectionModel().getSelectedIndex();
        myListView.getItems().remove(index);
        myListView.refresh();
    }
}

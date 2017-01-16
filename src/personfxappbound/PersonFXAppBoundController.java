/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personfxappbound;

import com.asgteach.familytree.model.Person;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Developer
 */
public class PersonFXAppBoundController implements Initializable {
    
    @FXML
    private Label malabaLabel;
    
    final Person malaba=new Person("Malaba","Mashauri",Person.Gender.MALE);
    
    @FXML
    private void changeButtonAction(ActionEvent event) {
        
        malaba.setMiddlename("Eric");
    }
    @FXML
    private void resetButtonAction(ActionEvent envent){
        malaba.setMiddlename("");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        malabaLabel.textProperty().bind(malaba.fullnameProperty());
    }    
    
}

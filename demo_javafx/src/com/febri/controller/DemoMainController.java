package com.febri.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DemoMainController {
    @FXML
    private TextField textInput;
    @FXML
    private Label lblOutput;
    
    @FXML   
    private void SendQueryAction(ActionEvent ActionEvent){
        if( !textInput.getText().trim().isEmpty()){
            lblOutput.setText(textInput.getText().trim());

        } else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(" Please Fill Input");
            alert.showAndWait();
        }
        
    }



}

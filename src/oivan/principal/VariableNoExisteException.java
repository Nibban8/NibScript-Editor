package oivan.principal;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.io.FileWriter;
import java.io.IOException;

public class VariableNoExisteException extends RuntimeException{

    @FXML
    private TextArea res;


    public VariableNoExisteException(){
        //System.out.println("Una variable no existe");
        res.setText("Una variable no existe");
    }
}

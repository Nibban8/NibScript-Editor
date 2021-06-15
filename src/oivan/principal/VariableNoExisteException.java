package oivan.principal;


import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class VariableNoExisteException extends Exception{

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public VariableNoExisteException(String errorMessage){

        TextFlow result = Controller.staticRes;
        Text texto = new Text(errorMessage + "\n");
        texto.setFill(Color.RED);
        result.getChildren().add(texto);

        //super(errorMessage);
        System.out.println(ANSI_RED + errorMessage + ANSI_RESET);


    }



}

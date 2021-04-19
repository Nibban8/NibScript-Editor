package oivan.principal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.*;

import oivan.parser.OperacionesLexer;
import oivan.parser.OperacionesParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Controller {

    @FXML
    private TextArea exp;
    @FXML
    private TextArea res;

    public void onEvaluar(MouseEvent mouseEvent) throws IOException {

        try {
            FileWriter writer = new FileWriter("res.txt");
            writer.write("");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        CharStream input = CharStreams.fromString(exp.getText());
        OperacionesLexer lexico ;
        CommonTokenStream tokens ;
        OperacionesParser sintactico ;

        ParseTree arbol ;

        MyVisitor visitas = new MyVisitor();


        String[] lines = input.toString().split("\n|\r\n");


        for(String i:lines){
            i = i+"\r\n";
            lexico = new OperacionesLexer(CharStreams.fromString(i));
            tokens = new CommonTokenStream(lexico);
            sintactico = new OperacionesParser(tokens);
            arbol = sintactico.inicio();
            visitas.visit(arbol);
        }

        try {
            FileReader reader = new FileReader("res.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                res.appendText(line + "\n");
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void onLimpiar(ActionEvent actionEvent) {
        exp.setText("");
        res.setText("");

        try {
            FileWriter writer = new FileWriter("res.txt");
            writer.write("");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

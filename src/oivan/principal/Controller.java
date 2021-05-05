package oivan.principal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javafx.scene.input.ScrollEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import oivan.parser.OperacionesLexer;
import oivan.parser.OperacionesParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Controller {

    private static final KeyCode ENTER = KeyCode.ENTER;


    private int lines = 0;

    @FXML
    private TextArea exp;
    @FXML
    private TextFlow res;
    @FXML
    private TextArea lineCount;





    public void onEvaluar(MouseEvent mouseEvent) throws IOException {


        try {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            //System.out.println(dtf.format(now));

            FileWriter writer = new FileWriter("res.txt");
            writer.write("[" + dtf.format(now) + "]" + " Ejecutando programa... \n");
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

            lexico = new OperacionesLexer(CharStreams.fromString(input.toString()));
            tokens = new CommonTokenStream(lexico);
            sintactico = new OperacionesParser(tokens);
            arbol = sintactico.inicio();
            visitas.visit(arbol);

        try {
            FileReader reader = new FileReader("res.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                //res.appendText(line + "\n");
                Text texto = new Text(line + "\n");
                if(line.charAt(0) == '*'){
                    texto.setFill(Color.RED);
                }
                res.getChildren().add(texto) ;
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void onLimpiar(MouseEvent mouseEvent) {
        res.getChildren().clear();

        try {
            FileWriter writer = new FileWriter("res.txt");
            writer.write("");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void onKeyTyped(KeyEvent keyEvent) {
        // Linea para sincronizar los dos scrolls
        exp.scrollTopProperty().bindBidirectional(lineCount.scrollTopProperty());

        //Ocultar las barras del textArea con numeros. Se ven feas
        ScrollBar VscrollBar = (ScrollBar) lineCount.lookup(".scroll-bar:vertical");
        VscrollBar.setOpacity(0);
        ScrollBar HscrollBar = (ScrollBar) lineCount.lookup(".scroll-bar:horizontal");
        HscrollBar.setOpacity(0);
        Text texto;

        // Si hay un enter, contar las lineas del texto e imprimir esa cantidad en el textarea de los numeros.
            if(keyEvent.getCode().equals(ENTER)){
                lineCount.setText("");
                for(int i = 0; i < exp.getText().lines().count()+1; i++){
                    lineCount.appendText(i+1 + "\n");
                }
            }
    }


}

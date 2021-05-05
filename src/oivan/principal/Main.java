package oivan.principal;

import javafx.scene.image.Image;
import oivan.parser.OperacionesLexer;
import oivan.parser.OperacionesParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        primaryStage.setTitle("Calculadora de expresiones");
        primaryStage.setScene(new Scene(root));
        BufferedImage img = null;

       primaryStage.getIcons().add(new Image("https://winaero.com/blog/wp-content/uploads/2019/09/Photos-app-icon-256-colorful.png"));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

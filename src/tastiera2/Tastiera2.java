/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tastiera2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author russo.salvatore
 */
public class Tastiera2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        VBox root=new VBox();
        TilePane tp=new TilePane();
        Label l=new Label("tasto Tastiera");
        Label l1=new Label();
        l.setStyle("-fx-font-size:30; -fx-font-family:verdana; -fx-text-fill:#4682b4");
        l1.setStyle("-fx-font-size:30; -fx-font-family:verdana; -fx-text-fill: ff0000");
        tp.getChildren().addAll(l, l1);
        tp.setAlignment(Pos.CENTER);
        Button btn=new Button("CLICCA");
        btn.setOnAction(evento->{
            l1.setText("evento setOnAction");
        });
        btn.setOnMouseEntered(evento->{
            l1.setText("evento setOnMouseEntered");
        });
          btn.setOnMouseExited(evento->{
            l1.setText("evento setOnMouseExited");
        });
           btn.setOnKeyPressed(evento->{
           switch(evento.getCode()){
               case SPACE:
                   l1.setText("SPACE");
                   break;
               case ENTER:
                   l1.setText("Enter");
                   break;
           }
        });
          root.getChildren().addAll(tp,btn);
          root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 500, 500);
        scene.setOnKeyPressed(evento->{
            l1.setText(evento.getCode().toString());
        });
        primaryStage.setTitle("lettura eventi tastiera");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

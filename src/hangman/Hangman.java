/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import javafx.application.Application;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author gansc
 */
public class Hangman extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        //hanging post
        Line vPost = new Line (60,20,60,300);
        Line hPost = new Line (60, 20, 160, 20);
        Line vPost2 = new Line (160, 20, 160, 50); 
        Arc arc = new Arc(60, 330, 50, 30, 0, 180);
        arc.setFill(Color.WHITE);
        arc.setStroke(Color.BLACK);
        
        //Hanging dude
        Circle head = new Circle(160,75,25);
        head.setFill(Color.WHITE);
        head.setStroke(Color.BLACK);
        Line body = new Line(160,100,160,190);
        Line leftLeg = new Line(160, 190, 120, 250);
        Line rightLeg = new Line(160, 190, 200, 250);
        Line leftArm = new Line(145, 96, 120, 160);
        Line rightArm = new Line(175, 96, 200, 160);
        
        pane.getChildren().addAll(vPost, hPost, vPost2, head, body,
        leftLeg, rightLeg, leftArm, rightArm, arc);

        //place stage on screen
        Scene scene = new Scene(pane, 250, 350);
        primaryStage.setTitle("Hangman");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}

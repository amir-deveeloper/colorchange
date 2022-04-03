package com.example.alpha;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

import java.util.Random;

import static javafx.scene.paint.Color.RED;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField name;
    @FXML
    private TextField name1;
    @FXML
    private TextField name2;

    @FXML
    private ToggleButton colorchange;

    @FXML
    private VBox box;

    @FXML
    protected void doColor(){

        Random random = new Random();
        int a = random.nextInt(6);

        if (a == 0){
            box.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        if (a == 1){
            box.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        if (a == 2){
            box.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        if (a == 3){
            box.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        if (a == 4){
            box.setBackground(new Background(new BackgroundFill(Color.PURPLE, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        if (a == 5){
            box.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        }

    }

    @FXML
    protected void onHelloButtonClick() {

        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void doSmth(){
        String str = name.getText(); //a
        String str1 = name1.getText(); // b
        String str2 = name2.getText(); // c

        Integer intb = Integer.parseInt(str1)*Integer.parseInt(str1);
        Integer dis = intb - 4*Integer.parseInt(str)*Integer.parseInt(str2);

        if (dis < 0){
            welcomeText.setText("This equation doesn't have any roots!");
        }

        else{
            if(dis == 0){
                double answer0 = (-Integer.parseInt(str1) + Math.sqrt(dis))/(2*Integer.parseInt(str));
                String output0 = String.valueOf(answer0);
                welcomeText.setText("The root is " + output0);
            }
            else {
                double answer1 = (-Integer.parseInt(str1) + Math.sqrt(dis))/(2*Integer.parseInt(str));
                double answer2 = (-Integer.parseInt(str1) - Math.sqrt(dis))/(2*Integer.parseInt(str));

                String output1 = String.valueOf(answer1);
                String output2 = String.valueOf(answer2);

                welcomeText.setText("The first root is " + output1 + "; " + "The second root is "+output2 );
            }

        }



    }


}
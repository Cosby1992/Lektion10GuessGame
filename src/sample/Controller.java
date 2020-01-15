package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class Controller {

    @FXML TextField tf_number_input;
    @FXML Label lb_game_info;
    @FXML AnchorPane anchorpane;

    private int randomNumber;
    private int guess;


    @FXML
    public void initialize(){

        // center info text
        lb_game_info.setMaxWidth(Double.MAX_VALUE);
        AnchorPane.setLeftAnchor(lb_game_info, 0.0);
        AnchorPane.setRightAnchor(lb_game_info, 0.0);
        lb_game_info.setAlignment(Pos.CENTER);

        // initialize game
        initNewGame();
    }

    // method for initializing game
    public void initNewGame(){

        randomNumber = (int) (Math.random() * 100) + 1;

        System.out.println(randomNumber);

        lb_game_info.setText("Et nyt spil er startet, gæt på et tal mellem 1 og 100");


    }

    // evaluates user guess on guess button click
    public void evaluateGuess(ActionEvent actionEvent) {

        String input;

        input = tf_number_input.getText();

        System.out.println(input);

    }
}

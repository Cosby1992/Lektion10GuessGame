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

    private EvaluateHelper evaluateHelper;


    @FXML
    public void initialize(){

        // center info text
//        lb_game_info.setMaxWidth(Double.MAX_VALUE);
//        AnchorPane.setLeftAnchor(lb_game_info, 0.0);
//        AnchorPane.setRightAnchor(lb_game_info, 0.0);
//        lb_game_info.setAlignment(Pos.CENTER);

        // initialize game
        initNewGame();
    }

    // method for initializing game
    public void initNewGame(){

        evaluateHelper = new EvaluateHelper();

        randomNumber = (int) (Math.random() * 100) + 1;

        System.out.println(randomNumber);

        lb_game_info.setText("Et nyt spil er startet, gæt på et tal mellem 1 og 100");


    }

    // evaluates user guess on guess button click
    public void evaluateGuess(ActionEvent actionEvent) {

        try {
            guess = Integer.valueOf(tf_number_input.getText());

            int resultat = evaluateHelper.evaluate(guess, randomNumber);


            if (resultat == -3) {
                lb_game_info.setText("Du gættede for lavt, prøv igen.");
            } else if (resultat == -2) {
                lb_game_info.setText("Du gættede for højt, prøv igen.");
            } else if (resultat == -1) {
                lb_game_info.setText("Tallet du gættede var ikke imellem 1 og 100, prøv igen.");
            } else {
                lb_game_info.setText("Tilykke du gættede det magiske tal, som var " + randomNumber);

            }
        } catch (NumberFormatException e){

            lb_game_info.setText("Du skrev ikke et tal, prøv igen");

        }


    }


}

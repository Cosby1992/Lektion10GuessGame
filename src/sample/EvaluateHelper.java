package sample;

public class EvaluateHelper {


    // evaluates guess and returns and int describing what's right or wrong
    public int evaluate(int guess, int magicNumber){

        // checks if guess is valid
        if(guess > 0 && guess <= 100){


            if(guess == magicNumber){

                return 1;

            } else if(guess > magicNumber){

                return -2;

            } else {

                return -3;

            }


        } else {
            // if guess is not valid
            return -1;

        }

    }



}

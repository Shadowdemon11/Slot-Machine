package com.example.shadow.slotmechinesuper;

/**
 * Created by Shadow on 12/14/2016.
 */

public class Scoreboard {
    int number1;
    int number2;
    int number3;

    int score = 0;
    int twoofkind = 10;
    int threekind = 20;
    public Scoreboard(int button1, int button2, int button3){
        number1 = button1;
        number2 = button2;
        number3 = button3;
    }

    public void checkScore(){
        score = checkTwoOfAKind() + checkThreeOfAKind();

    }

    public int getScore(){
        //String numberString = Integer.toString(score);
        return score;
    }

    public int checkTwoOfAKind()
    {
        if(number1 == number2){
            return twoofkind;
        }
        if(number3 == number2){
            return twoofkind;
        }
        if(number1 == number3){
            return twoofkind;
        }
        return 0;
    }

    public int checkThreeOfAKind()
    {
        if(number1 == number2){
            if(number2 == number3){
                return threekind;
            }
        }
        return 0;
    }


}

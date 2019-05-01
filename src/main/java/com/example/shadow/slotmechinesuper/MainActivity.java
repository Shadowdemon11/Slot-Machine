package com.example.shadow.slotmechinesuper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random rand = new Random();
    Button numberButton1;
    Button numberButton2;
    Button numberButton3;
    Button rollButton;
    Button closeButton;
    EditText scoreText;
    int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slot);
        numberButton1 = (Button) findViewById(R.id.number1);
        numberButton2 = (Button) findViewById(R.id.number2);
        numberButton3 = (Button) findViewById(R.id.number3);
        rollButton = (Button) findViewById(R.id.roll);
        scoreText = (EditText)findViewById(R.id.scoresText);
        closeButton = (Button) findViewById(R.id.closeapp);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollNumber();
                setScore();
            }
        });

        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.slot,
                container, false);





        return view;
    }

    public void setScore(){
        CharSequence store = numberButton1.getText();
        int button1 = Integer.parseInt(store.toString());
        CharSequence store2 = numberButton2.getText();
        int button2 = Integer.parseInt(store2.toString());
        CharSequence store3 = numberButton3.getText();
        int button3 = Integer.parseInt(store3.toString());
        Scoreboard board = new Scoreboard(button1,button2,button3);
        board.checkScore();
        score += board.getScore();
        String scoreString = "Score: "+ Integer.toString(score);
        scoreText.setText(scoreString);

    }

    public void rollNumber() {
        try {
            runOnUiThread (new Runnable() {
                @Override

                public void run() {
                    int n = rand.nextInt(3) + 1;
                    ;
                    try {
                        // First, create a delay of 10000 ms
                        //  (mDelay was declared above in the Activity class)
                        Thread.sleep(n * 100);
                        //n = rand.nextInt(3) + 1;

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    if (n == 1) {
                        numberButton1.setText("1");
                    } else if (n == 2) {
                        numberButton1.setText("2");
                    } else if (n == 3) {
                        numberButton1.setText("3");
                    }
                }
            });

            runOnUiThread(new Runnable() {
                @Override

                public void run() {
                    int n = rand.nextInt(3) + 1;
                    ;
                    try {
                        // First, create a delay of 10000 ms
                        //  (mDelay was declared above in the Activity class)
                        Thread.sleep(n * 100);
                        //n = rand.nextInt(3) + 1;

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    if (n == 1) {
                        numberButton2.setText("1");
                    } else if (n == 2) {
                        numberButton2.setText("2");
                    } else if (n == 3) {
                        numberButton2.setText("3");
                    }
                }
            });

            runOnUiThread(new Runnable() {
                @Override

                public void run() {
                    int n = rand.nextInt(3) + 1;
                    ;
                    try {
                        // First, create a delay of 10000 ms
                        //  (mDelay was declared above in the Activity class)
                        Thread.sleep(n * 100);
                        //n = rand.nextInt(3) + 1;

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    if (n == 1) {
                        numberButton3.setText("1");
                    } else if (n == 2) {
                        numberButton3.setText("2");
                    } else if (n == 3) {
                        numberButton3.setText("3");
                    }
                }
            });
        } catch(Exception e){
            e.printStackTrace();
        }

    }


}

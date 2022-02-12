package com.example.victorina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int question_index=0;
    int count =0;
    private TextView text;
    private Button button_yes, button_no, button_continue;
    private Qustion[] qustion = new Qustion[]{
            new Qustion(true,R.string.question_1),
            new Qustion(true,R.string.question_2),
            new Qustion(true,R.string.question_3),
            new Qustion(true,R.string.question_4),
            new Qustion(true,R.string.question_5),
            new Qustion(true,R.string.question_6),
            new Qustion(true,R.string.question_7),
            new Qustion(true,R.string.question_8),
            new Qustion(true,R.string.question_9),
            new Qustion(true,R.string.question_10),
            new Qustion(true,R.string.question_11),
            new Qustion(true,R.string.question_12),
            new Qustion(true,R.string.question_13),
            new Qustion(true,R.string.question_14)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text=findViewById(R.id.text);
        button_continue=findViewById(R.id.button_continue);
        button_no=findViewById(R.id.button_no);
        button_yes=findViewById(R.id.button_yes);
        text.setText(qustion[question_index].getQustion());



        button_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(false);
            }
        });
        button_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(true);


            }
        });
        button_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_continue.setVisibility(View.INVISIBLE);
                button_no.setVisibility(View.VISIBLE);
                button_yes.setVisibility(View.VISIBLE);
                question_index++;
                if (question_index!=13) {
                    text.setText(qustion[question_index].getQustion());
                }else{
                    button_continue.setVisibility(View.INVISIBLE);
                    button_no.setVisibility(View.INVISIBLE);
                    button_yes.setVisibility(View.INVISIBLE);
                    switch (count){
                        case 0:
                            text.setText("Вы экстраверт");
                            break;

                        case 1:
                            text.setText("Вы экстраверт");
                            break;
                        case 2:
                            text.setText("Вы экстраверт");
                            break;
                        case 3:
                            text.setText("Вы экстраверт");
                            break;
                        case 4:
                            text.setText("Вы экстраверт");
                            break;
                        case 5:
                            text.setText("Вы амбиверт");
                            break;
                        case 6:
                            text.setText("Вы амбиверт");
                            break;
                        case 7:
                            text.setText("вы Амбиверт");
                            break;
                        case 8:
                            text.setText("вы интроверт");
                            break;
                        case 9:
                            text.setText("вы интроверт");
                            break;
                        case 10:
                            text.setText("вы интроверт");
                            break;
                        case 11:
                            text.setText("вы интроверт");
                            break;
                        case 12:
                            text.setText("вы интроверт");
                            break;
                        case 13:
                            text.setText("вы интроверт");
                            break;
                    }
                }
            }
        });
    }

    private void checkAnswer(boolean answer) {
        if(answer==qustion[question_index].isCorrect()){
            count++;
        }else{
            count+=0;

        }
        button_continue.setVisibility(View.VISIBLE);
        button_no.setVisibility(View.INVISIBLE);
        button_yes.setVisibility(View.INVISIBLE);
    }

}
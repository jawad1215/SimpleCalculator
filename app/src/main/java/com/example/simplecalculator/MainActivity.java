package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText1;
    EditText editText2;
    Button clear;
    TextView operatorTextView;
    TextView answerTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1= findViewById(R.id.editText1);
        editText2= findViewById(R.id.editText2);
        operatorTextView= findViewById(R.id.operatorTextView);
        answerTextView= findViewById(R.id.answerTextView);
        clear= findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText("");
                editText2.setText("");
                operatorTextView.setText("");
                answerTextView.setText("");
            }
        });

    }
    public void onButtonClick(View view)
    {
        double number1=Double.parseDouble(editText1.getText().toString());
        double number2=Double.parseDouble(editText2.getText().toString());
        String operator="";
        double result;
        switch (view.getId())
        {
            case R.id.plusButton:
                operator="+";
                result=number1+number2;
                break;
            case R.id.minusButton:
                operator="-";
                result=number1-number2;
                break;
            case R.id.productButton:
                operator="x";
                result=number1*number2;
                break;
            case R.id.divideButton:
                operator="/";
                result=number1/number2;
                break;
            default:
                operator="?";
                result=0;
        }
        operatorTextView.setText(operator);
        answerTextView.setText(Double.toString(result));

    }
}

package com.candelatech.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public EditText number1, number2;
    public Button add, sub, mul, div, clr;
    public TextView result_tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = findViewById(R.id.Number1);
        number2 = findViewById(R.id.Number2);
        result_tv = findViewById(R.id.result);
        add = findViewById(R.id.operation_add);
        sub = findViewById(R.id.operation_sub);
        mul = findViewById(R.id.operation_mul);
        div = findViewById(R.id.operation_div);
        clr = findViewById(R.id.clear);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = number1.getText().toString();
                String num2 = number2.getText().toString();
                if (num1.length() > 0 && num2.length() > 0){
                    result_tv.setText(String.valueOf(Integer.parseInt(num1) + Integer.parseInt(num2)));
                }else{
                    result_tv.setText("Invalid Input");
                }
            }
        });

    sub.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String num1 = number1.getText().toString();
            String num2 = number2.getText().toString();
            if (num1.length() > 0 && num2.length() > 0){
                result_tv.setText(String.valueOf(Integer.parseInt(num1) - Integer.parseInt(num2)));
            }else{
                result_tv.setText("Invalid Input");
            }
        }
    });

    mul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String num1 = number1.getText().toString();
            String num2 = number2.getText().toString();
            if (num1.length() > 0 && num2.length() > 0){
                result_tv.setText(String.valueOf(Integer.parseInt(num1) * Integer.parseInt(num2)));
            }else{
                result_tv.setText("Invalid Input");
            }
        }
    });

    div.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String num1 = number1.getText().toString();
            String num2 = number2.getText().toString();
            if (num1.length() > 0 && num2.length() > 0){
                result_tv.setText(String.valueOf(Integer.parseInt(num1) / Double.parseDouble(num2)));
            }else{
                result_tv.setText("Invalid Input");
            }
        }
    });

    clr.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            result_tv.setText("");

        }
    });
    }
}
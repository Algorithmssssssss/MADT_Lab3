package com.example.madt_lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import java.lang.Math;

public class MainActivity extends AppCompatActivity {

    Button mc_Button, mr_Button, mp_Button, mm_Button, back_Button, ce_Button, c_Button, pm_Button, sqrt_Button, seven_Button, eight_Button, nine_Button, divide_Button, percentage_Button, four_Button, five_Button, six_Button, multiply_Button,
            overX_Button, one_Button, two_Button, three_Button, minus_Button, zero_Button, dot_Button, plus_Button, equal_Button;
    EditText screenPrint;

    float Value1, Value2;
    boolean mAdding, mMinus, mDivide, mMMultiply, mSqrt, mOneOverX, mPercentage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mc_Button = (Button) findViewById(R.id.mc_Button);
        mr_Button = (Button) findViewById(R.id.mr_Button);
        mp_Button = (Button) findViewById(R.id.mp_Button);
        mm_Button = (Button) findViewById(R.id.mm_Button);
        back_Button = (Button) findViewById(R.id.back_Button);
        ce_Button = (Button) findViewById(R.id.ce_Button);
        c_Button = (Button) findViewById(R.id.c_Button);
        pm_Button = (Button) findViewById(R.id.pm_Button);
        sqrt_Button = (Button) findViewById(R.id.sqrt_Button);
        seven_Button = (Button) findViewById(R.id.seven_Button);
        eight_Button = (Button) findViewById(R.id.eight_Button);
        nine_Button = (Button) findViewById(R.id.nine_Button);
        divide_Button = (Button) findViewById(R.id.divide_Button);
        percentage_Button = (Button) findViewById(R.id.percentage_Button);
        four_Button = (Button) findViewById(R.id.four_Button);
        five_Button = (Button) findViewById(R.id.five_Button);
        six_Button = (Button) findViewById(R.id.six_Button);
        multiply_Button = (Button) findViewById(R.id.multiply_Button);
        overX_Button = (Button) findViewById(R.id.overX_Button);
        one_Button = (Button) findViewById(R.id.one_Button);
        two_Button = (Button) findViewById(R.id.two_Button);
        three_Button = (Button) findViewById(R.id.three_Button);
        minus_Button = (Button) findViewById(R.id.minus_Button);
        zero_Button = (Button) findViewById(R.id.zero_Button);
        dot_Button = (Button) findViewById(R.id.dot_Button);
        plus_Button = (Button) findViewById(R.id.plus_Button);
        equal_Button = (Button) findViewById(R.id.equal_Button);
        screenPrint = (EditText) findViewById(R.id.screenPrint);



        zero_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenPrint.setText(screenPrint.getText()+"0");
            }
        });

        one_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenPrint.setText(screenPrint.getText()+"1");
            }
        });

        two_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenPrint.setText(screenPrint.getText()+"2");
            }
        });

        three_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenPrint.setText(screenPrint.getText()+"3");
            }
        });

        four_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenPrint.setText(screenPrint.getText()+"4");
            }
        });

        five_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenPrint.setText(screenPrint.getText()+"5");
            }
        });

        six_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenPrint.setText(screenPrint.getText()+"6");
            }
        });

        seven_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenPrint.setText(screenPrint.getText()+"7");
            }
        });

        eight_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenPrint.setText(screenPrint.getText()+"8");
            }
        });

        nine_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenPrint.setText(screenPrint.getText()+"9");
            }
        });

        dot_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenPrint.setText(screenPrint.getText()+".");
            }
        });


        plus_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (screenPrint == null){
                    screenPrint.setText("");
                }else {
                    Value1 = Float.parseFloat(screenPrint.getText() + "");
                    mAdding = true;
                    screenPrint.setText(null);
                }
            }
        });

        minus_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (screenPrint == null){
                    screenPrint.setText("");
                }else {
                    Value1 = Float.parseFloat(screenPrint.getText() + "");
                    mMinus = true;
                    screenPrint.setText(null);
                }
            }
        });

        multiply_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (screenPrint == null){
                    screenPrint.setText("");
                }else {
                    Value1 = Float.parseFloat(screenPrint.getText() + "");
                    mMMultiply = true;
                    screenPrint.setText(null);
                }
            }
        });

        divide_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (screenPrint == null){
                    screenPrint.setText("");
                }else {
                    Value1 = Float.parseFloat(screenPrint.getText() + "");
                    mDivide = true;
                    screenPrint.setText(null);
                }
            }
        });

        percentage_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (screenPrint == null){
                    screenPrint.setText("");
                }else {
                    Value1 = Float.parseFloat(screenPrint.getText() + "");
                    mPercentage = true;
                    screenPrint.setText(null);
                }
            }
        });

        overX_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (screenPrint == null){
                    screenPrint.setText("");
                }else {
                    Value1 = Float.parseFloat(screenPrint.getText() + "");
                    mOneOverX = true;
                    screenPrint.setText(null);
                }
            }
        });

        c_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screenPrint.setText(null);

            }
        });

        ce_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screenPrint.setText(null);

            }
        });

        back_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String backspace=null;

                if(screenPrint.getText().length() > 0) {
                    StringBuilder strB = new StringBuilder(screenPrint.getText());
                    strB.deleteCharAt(screenPrint.getText().length() - 1);
                    backspace = strB.toString();
                    screenPrint.setText(backspace);

                }
            }
        });

        overX_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (screenPrint == null) {
                    screenPrint.setText("");
                } else {
                    Value1 = Float.parseFloat(screenPrint.getText() + "");
                    mSqrt = true;
                    screenPrint.setText(1 / Value1 + "");
                }
            }
        });

        sqrt_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (screenPrint == null){
                    screenPrint.setText("");
                }else {
                    Value1 = Float.parseFloat(screenPrint.getText() + "");
                    mSqrt = true;
                    screenPrint.setText(Math.sqrt(Value1) +"");
                }
            }
        });

        equal_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value2 = Float.parseFloat(screenPrint.getText() + "");

                if (mAdding == true){

                    screenPrint.setText(Value1 + Value2 +"");
                    mAdding=false;
                }


                if (mMinus == true){
                    screenPrint.setText(Value1 - Value2 +"");
                    mMinus=false;
                }

                if (mMMultiply == true){
                    screenPrint.setText(Value1 * Value2 + "");
                    mMMultiply=false;
                }

                if (mDivide == true){
                    screenPrint.setText(Value1 / Value2+"");
                    mDivide=false;
                }

                if (mSqrt == true){
                    screenPrint.setText(Math.sqrt(Value1) +"");
                    mSqrt=false;
                }
            }
        });
    }
}
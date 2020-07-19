package com.example.playpiano;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    private HorizontalScrollView scrollView;
    private Button buttonC3, buttonC3black, buttonD3, buttonD3black, buttonE3, buttonF3, buttonF3black, buttonG3, buttonG3black, buttonA3, buttonA3black, buttonB3;
    private Button buttonC4, buttonC4black, buttonD4, buttonD4black, buttonE4, buttonF4, buttonF4black, buttonG4, buttonG4black, buttonA4, buttonA4black, buttonB4;
    private Button buttonC5, buttonC5black, buttonD5, buttonD5black, buttonE5, buttonF5, buttonF5black, buttonG5, buttonG5black, buttonA5, buttonA5black, buttonB5;
    private Button buttonC6, buttonC6black, buttonD6, buttonD6black, buttonE6, buttonF6, buttonF6black, buttonG6, buttonG6black, buttonA6, buttonA6black, buttonB6;
    private Button buttonC7, buttonC7black, buttonD7, buttonD7black, buttonE7, buttonF7, buttonF7black, buttonG7, buttonG7black, buttonA7, buttonA7black, buttonB7;
    private TextView tc3, td3, te3, tf3, tg3, ta3, tb3, tc4, td4, te4, tf4, tg4, ta4, tb4, tc5, td5, te5, tf5, tg5, ta5, tb5, tc6, td6, te6, tf6, tg6, ta6, tb6, tc7, td7, te7, tf7, tg7, ta7, tb7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scrollView = (HorizontalScrollView) findViewById(R.id.scrollView);
        IntializeAllPianoKeys();
        InitializeTextViewLabelsOnPiano();
    }


    void InitializeTextViewLabelsOnPiano() {
        tc3 = (TextView) findViewById(R.id.tc3);
        tc3.setOnClickListener(this);
        td3 = (TextView) findViewById(R.id.td3);
        td3.setOnClickListener(this);
        te3 = (TextView) findViewById(R.id.te3);
        te3.setOnClickListener(this);
        tf3 = (TextView) findViewById(R.id.tf3);
        tf3.setOnClickListener(this);
        tg3 = (TextView) findViewById(R.id.tg3);
        tg3.setOnClickListener(this);
        ta3 = (TextView) findViewById(R.id.ta3);
        ta3.setOnClickListener(this);
        tb3 = (TextView) findViewById(R.id.tb3);
        tb3.setOnClickListener(this);

        tc4 = (TextView) findViewById(R.id.tc4);
        tc4.setOnClickListener(this);
        td4 = (TextView) findViewById(R.id.td4);
        td4.setOnClickListener(this);
        te4 = (TextView) findViewById(R.id.te4);
        te4.setOnClickListener(this);
        tf4 = (TextView) findViewById(R.id.tf4);
        tf4.setOnClickListener(this);
        tg4 = (TextView) findViewById(R.id.tg4);
        tg4.setOnClickListener(this);
        ta4 = (TextView) findViewById(R.id.ta4);
        ta4.setOnClickListener(this);
        tb4 = (TextView) findViewById(R.id.tb4);
        tb4.setOnClickListener(this);

        tc5 = (TextView) findViewById(R.id.tc5);
        tc5.setOnClickListener(this);
        td5 = (TextView) findViewById(R.id.td5);
        td5.setOnClickListener(this);
        te5 = (TextView) findViewById(R.id.te5);
        te5.setOnClickListener(this);
        tf5 = (TextView) findViewById(R.id.tf5);
        tf5.setOnClickListener(this);
        tg5 = (TextView) findViewById(R.id.tg5);
        tg5.setOnClickListener(this);
        ta5 = (TextView) findViewById(R.id.ta5);
        ta5.setOnClickListener(this);
        tb5 = (TextView) findViewById(R.id.tb5);
        tb5.setOnClickListener(this);

        tc6 = (TextView) findViewById(R.id.tc6);
        tc6.setOnClickListener(this);
        td6 = (TextView) findViewById(R.id.td6);
        td6.setOnClickListener(this);
        te6 = (TextView) findViewById(R.id.te6);
        te6.setOnClickListener(this);
        tf6 = (TextView) findViewById(R.id.tf6);
        tf6.setOnClickListener(this);
        tg6 = (TextView) findViewById(R.id.tg6);
        tg6.setOnClickListener(this);
        ta6 = (TextView) findViewById(R.id.ta6);
        ta6.setOnClickListener(this);
        tb6 = (TextView) findViewById(R.id.tb6);
        tb6.setOnClickListener(this);

        tc7 = (TextView) findViewById(R.id.tc7);
        tc7.setOnClickListener(this);
        td7 = (TextView) findViewById(R.id.td7);
        td7.setOnClickListener(this);
        te7 = (TextView) findViewById(R.id.te7);
        te7.setOnClickListener(this);
        tf7 = (TextView) findViewById(R.id.tf7);
        tf7.setOnClickListener(this);
        tg7 = (TextView) findViewById(R.id.tg7);
        tg7.setOnClickListener(this);
        ta7 = (TextView) findViewById(R.id.ta7);
        ta7.setOnClickListener(this);
        tb7 = (TextView) findViewById(R.id.tb7);
        tb7.setOnClickListener(this);

    }

    void IntializeAllPianoKeys() {

        buttonC3 = (Button) findViewById(R.id.p1);
        buttonC3.setOnClickListener(this);
        buttonC3black = (Button) findViewById(R.id.b1);
        buttonC3black.setOnClickListener(this);
        buttonD3 = (Button) findViewById(R.id.p2);
        buttonD3.setOnClickListener(this);
        buttonD3black = (Button) findViewById(R.id.b2);
        buttonD3black.setOnClickListener(this);
        buttonE3 = (Button) findViewById(R.id.p3);
        buttonE3.setOnClickListener(this);
        buttonF3 = (Button) findViewById(R.id.p4);
        buttonF3.setOnClickListener(this);
        buttonF3black = (Button) findViewById(R.id.b3);
        buttonF3black.setOnClickListener(this);
        buttonG3 = (Button) findViewById(R.id.p5);
        buttonG3.setOnClickListener(this);
        buttonG3black = (Button) findViewById(R.id.b4);
        buttonG3black.setOnClickListener(this);
        buttonA3 = (Button) findViewById(R.id.p6);
        buttonA3.setOnClickListener(this);
        buttonA3black = (Button) findViewById(R.id.b5);
        buttonA3black.setOnClickListener(this);
        buttonB3 = (Button) findViewById(R.id.p7);
        buttonB3.setOnClickListener(this);

        buttonC4 = (Button) findViewById(R.id.p8);
        buttonC4.setOnClickListener(this);
        buttonC4black = (Button) findViewById(R.id.b6);
        buttonC4black.setOnClickListener(this);
        buttonD4 = (Button) findViewById(R.id.p9);
        buttonD4.setOnClickListener(this);
        buttonD4black = (Button) findViewById(R.id.b7);
        buttonD4black.setOnClickListener(this);
        buttonE4 = (Button) findViewById(R.id.p10);
        buttonE4.setOnClickListener(this);
        buttonF4 = (Button) findViewById(R.id.p11);
        buttonF4.setOnClickListener(this);
        buttonF4black = (Button) findViewById(R.id.b8);
        buttonF4black.setOnClickListener(this);
        buttonG4 = (Button) findViewById(R.id.p12);
        buttonG4.setOnClickListener(this);
        buttonG4black = (Button) findViewById(R.id.b9);
        buttonG4black.setOnClickListener(this);
        buttonA4 = (Button) findViewById(R.id.p13);
        buttonA4.setOnClickListener(this);
        buttonA4black = (Button) findViewById(R.id.b10);
        buttonA4black.setOnClickListener(this);
        buttonB4 = (Button) findViewById(R.id.p14);
        buttonB4.setOnClickListener(this);

        buttonC5 = (Button) findViewById(R.id.p15);
        buttonC5.setOnClickListener(this);
        buttonC5black = (Button) findViewById(R.id.b11);
        buttonC5black.setOnClickListener(this);
        buttonD5 = (Button) findViewById(R.id.p16);
        buttonD5.setOnClickListener(this);
        buttonD5black = (Button) findViewById(R.id.b12);
        buttonD5black.setOnClickListener(this);
        buttonE5 = (Button) findViewById(R.id.p17);
        buttonE5.setOnClickListener(this);
        buttonF5 = (Button) findViewById(R.id.p18);
        buttonF5.setOnClickListener(this);
        buttonF5black = (Button) findViewById(R.id.b13);
        buttonF5black.setOnClickListener(this);
        buttonG5 = (Button) findViewById(R.id.p19);
        buttonG5.setOnClickListener(this);
        buttonG5black = (Button) findViewById(R.id.b14);
        buttonG5black.setOnClickListener(this);
        buttonA5 = (Button) findViewById(R.id.p20);
        buttonA5.setOnClickListener(this);
        buttonA5black = (Button) findViewById(R.id.b15);
        buttonA5black.setOnClickListener(this);
        buttonB5 = (Button) findViewById(R.id.p21);
        buttonB5.setOnClickListener(this);

        buttonC6 = (Button) findViewById(R.id.p22);
        buttonC6.setOnClickListener(this);
        buttonC6black = (Button) findViewById(R.id.b16);
        buttonC6black.setOnClickListener(this);
        buttonD6 = (Button) findViewById(R.id.p23);
        buttonD6.setOnClickListener(this);
        buttonD6black = (Button) findViewById(R.id.b17);
        buttonD6black.setOnClickListener(this);
        buttonE6 = (Button) findViewById(R.id.p24);
        buttonE6.setOnClickListener(this);
        buttonF6 = (Button) findViewById(R.id.p25);
        buttonF6.setOnClickListener(this);
        buttonF6black = (Button) findViewById(R.id.b18);
        buttonF6black.setOnClickListener(this);
        buttonG6 = (Button) findViewById(R.id.p26);
        buttonG6.setOnClickListener(this);
        buttonG6black = (Button) findViewById(R.id.b19);
        buttonG6black.setOnClickListener(this);
        buttonA6 = (Button) findViewById(R.id.p27);
        buttonA6.setOnClickListener(this);
        buttonA6black = (Button) findViewById(R.id.b20);
        buttonA6black.setOnClickListener(this);
        buttonB6 = (Button) findViewById(R.id.p28);
        buttonB6.setOnClickListener(this);

        buttonC7 = (Button) findViewById(R.id.p29);
        buttonC7.setOnClickListener(this);
        buttonC7black = (Button) findViewById(R.id.b21);
        buttonC7black.setOnClickListener(this);
        buttonD7 = (Button) findViewById(R.id.p30);
        buttonD7.setOnClickListener(this);
        buttonD7black = (Button) findViewById(R.id.b22);
        buttonD7black.setOnClickListener(this);
        buttonE7 = (Button) findViewById(R.id.p31);
        buttonE7.setOnClickListener(this);
        buttonF7 = (Button) findViewById(R.id.p32);
        buttonF7.setOnClickListener(this);
        buttonF7black = (Button) findViewById(R.id.b23);
        buttonF7black.setOnClickListener(this);
        buttonG7 = (Button) findViewById(R.id.p33);
        buttonG7.setOnClickListener(this);
        buttonG7black = (Button) findViewById(R.id.b24);
        buttonG7black.setOnClickListener(this);
        buttonA7 = (Button) findViewById(R.id.p34);
        buttonA7.setOnClickListener(this);
        buttonA7black = (Button) findViewById(R.id.b25);
        buttonA7black.setOnClickListener(this);
        buttonB7 = (Button) findViewById(R.id.p35);
        buttonB7.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}

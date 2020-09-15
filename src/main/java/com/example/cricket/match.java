package com.example.cricket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class match extends AppCompatActivity {

    TextView runs;
    TextView wickets;
    TextView overs;
    Button button1;
    Button button2;
    Button button3;
    Button button6;
    Button button4;
    Button buttonwide;
    Button buttonno;

    public match() {
        button2 = new Button();
        button1 = new Button();
        button3 = new Button();
        button6 = new Button();
        button4 = new Button();
        buttonwide = new Button();
        buttonno = new Button();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);
    }

}

package com.shreya.randomnumbergenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView textView,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Welcome!",Toast.LENGTH_SHORT).show();
    }


    public void generateRandom(View view)
    {
        textView = findViewById(R.id.textView1);
        String cntstr = textView.getText().toString();
        Integer cnt = Integer.parseInt(cntstr);
        Random r = new Random();
        Integer randnum = r.nextInt(cnt);
        c=findViewById(R.id.textView4);
        c.setText("Random : "+randnum.toString());
    }

    public void countNumber(View view)
    {
        textView = findViewById(R.id.textView1);
        String cntstr = textView.getText().toString();
        Integer cnt = Integer.parseInt(cntstr);
        cnt++;
        textView.setText(cnt.toString());
    }

    public void resetRand(View view)
    {
        textView = findViewById(R.id.textView1);
        c = findViewById(R.id.textView4);
        Integer num = 0;
        textView.setText(num.toString());
        c.setText("");
    }
}
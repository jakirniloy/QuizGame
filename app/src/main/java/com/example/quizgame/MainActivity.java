package com.example.quizgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.i6);
        Button button1=(Button)findViewById(R.id.i4);
        Button button2=(Button)findViewById(R.id.i15);
        Button button3=(Button)findViewById(R.id.i9);

        button1.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v)
            {
                finish();
                System.exit(0);

            }
        });

        button3.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v)
            {
                startActivity(new Intent(getApplicationContext(),about.class));

            }
        });
        button2.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v)
            {
                startActivity(new Intent(getApplicationContext(),scoreboard.class));

            }
        });
        button.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v)
            {
                startActivity(new Intent(getApplicationContext(),GameActivty.class));

            }
        });
    }
}

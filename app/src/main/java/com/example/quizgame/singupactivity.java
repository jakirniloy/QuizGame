package com.example.quizgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class singupactivity extends AppCompatActivity {
    String nam,pas,email1,Age;
    EditText name;
    EditText pass;
    EditText email;
    EditText age;
    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singupactivity);
        Button b2= (Button)findViewById(R.id.button2);
        Button b1= (Button)findViewById(R.id.button1);
        name = (EditText)findViewById(R.id.name);
        pass = (EditText)findViewById(R.id.pass);
        email = (EditText)findViewById(R.id.email);
        age = (EditText)findViewById(R.id.age);


        b1.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v)
            {

             nam=name.getText().toString();
                pas=name.getText().toString();
                email1=name.getText().toString();
                Age=name.getText().toString();

                file.saveToFile( nam);
                file.saveToFile( pas);
                file.saveToFile( email1);
                file.saveToFile( Age);

                Toast.makeText(singupactivity.this,"Saved to file",Toast.LENGTH_SHORT).show();

            }
        });


        b2.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v)
            {
                startActivity(new Intent(getApplicationContext(),LoginActivity.class));

            }
        });
    }
}

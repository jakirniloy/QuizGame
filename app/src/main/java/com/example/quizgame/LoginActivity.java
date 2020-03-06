package com.example.quizgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.StringReader;

public class LoginActivity extends AppCompatActivity {
    EditText editext;
    EditText passwordtext;
    Button singup1;
    Button singup2;
    Button singup3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);
        editext = findViewById(R.id.editext);
        passwordtext = findViewById(R.id.passwordtext);
        singup1 = findViewById(R.id.singup1);
        singup2 = findViewById(R.id.singup2);



                singup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                String name1=editext.getText().toString();
                String password=passwordtext.getText().toString();
                EditText nam = (EditText) findViewById(R.id.name);

                    if (name1.equals("Niloy") && password.equals("214364")) {

                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    }
                else {

                        Toast.makeText(getBaseContext(), "Incorrect Password",
                                Toast.LENGTH_SHORT).show();
                    }

            }


        });
        singup3=findViewById(R.id.singup3);
        singup3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String name=editext.getText().toString();
                String password=passwordtext.getText().toString();
                if(name.equals("Jakir")&&password.equals("1234") ){

                    startActivity(new Intent(getApplicationContext(), Admin.class));}

                else

                {
                    Toast.makeText(getBaseContext(), "Incorrect Admin Panel Password",

                            Toast.LENGTH_SHORT).show();
                }
            }
        });


        singup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), singupactivity.class));
            }
        });

    }


}


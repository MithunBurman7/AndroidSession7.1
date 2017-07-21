package com.example.mithunburman.searchingdemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Taking or Declaring variables by Mithun Burman on 21/07/2017.

    TextView EditText;
    Button GoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText  = (TextView) findViewById(R.id.EditText);
        GoButton = (Button) findViewById(R.id.GoButton);
        GoButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                final String searchTerms = EditText.getText().toString();
                Intent i = new Intent (Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.google.co.in/search?q="+searchTerms));
                startActivity(i);
            }
        });


            }
        }


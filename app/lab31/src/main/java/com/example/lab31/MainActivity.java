package com.example.lab31;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.MenuItem;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
    Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempText = button2.getText().toString();
                button2.setText(button3.getText());
                button3.setText(tempText);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempText = button1.getText().toString();
                button1.setText(button3.getText());
                button3.setText(tempText);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempText = button1.getText().toString();
                button1.setText(button2.getText());
                button2.setText(tempText);
            }
        });





    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item){

        if(item.getItemId() == R.id.about){
            Intent intent = new Intent(this, AboutApp.class);
            startActivity(intent);
        }
        if(item.getItemId() == R.id.author){
            Intent intent = new Intent(this, AboutAuthor.class);
            startActivity(intent);
        }
        if(item.getItemId() == R.id.exit){
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
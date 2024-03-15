package com.example.lab31;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.Menu;
import android.content.Intent;

public class AboutApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_app);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        menu.add(0,1,1,"Вернуться");
        menu.add(0,2,2,"Выйти");

        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item){

        if(item.getItemId() == 1)
        {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        if(item.getItemId() == 2){
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
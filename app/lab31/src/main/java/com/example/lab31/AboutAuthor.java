package com.example.lab31;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;


public class AboutAuthor extends AppCompatActivity {
    CheckBox check;
    TextView hidden;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_author);
        check = (CheckBox) findViewById(R.id.check);
        hidden = (TextView) findViewById(R.id.hiddenText);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        menu.add(0,1,1,"Вернуться");
        menu.add(0,2,2,"Выйти");
        menu.add(1,3,3,"Показать скрытый текст");

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
        if(item.getItemId() == 3){
            hidden.setVisibility(View.VISIBLE);
        }


        return super.onOptionsItemSelected(item);
    }

    public boolean onPrepareOptionsMenu(Menu menu){
        menu.setGroupVisible(1,check.isChecked());

        return super.onPrepareOptionsMenu(menu);
    }

}
package com.example.tugas_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class IsertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isert);
    }
    public boolean onCreateOptionsMenu (Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.insert) {
            startActivity(new Intent(this, IsertActivity.class));
        } else if (item.getItemId() == R.id.edit) {
            startActivity(new Intent(this, EditActivity.class));
        } else if (item.getItemId() == R.id.baru) {
            startActivity(new Intent(this, NewActivity.class));

        }
        return true;
    }
}

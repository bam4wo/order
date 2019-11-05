package com.example.order;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText flower;
    private EditText vage;
    private EditText lobo;
    int money = 500;
    private TextView moneyyy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        flower = findViewById(R.id.flowerN);
        vage = findViewById(R.id.vageN);
        lobo = findViewById(R.id.loboN);
        moneyyy = findViewById(R.id.moneyyy);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void order(View view){
        int f = Integer.parseInt(flower.getText().toString());
        int v = Integer.parseInt(vage.getText().toString());
        int l = Integer.parseInt(lobo.getText().toString());
        int remain = money-(50*f)+(30*v)+(l*100);
        moneyyy.setText(String.valueOf(remain));
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("訂購完成")
                .setMessage("感謝購買")
                .setPositiveButton("ok", null)
                .show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

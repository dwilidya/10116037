package com.example.asusa455l.a10116037;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuoption, menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.profil) {
            startActivity(new Intent(this, ProfilActivity.class));
        } else if (item.getItemId() == R.id.kontak) {
            startActivity(new Intent(this, KontakActivity.class));
        } else if (item.getItemId() == R.id.daftarteman) {
            startActivity(new Intent(this, Daftar_temanActivity.class));
        }

        return true;

    }
}


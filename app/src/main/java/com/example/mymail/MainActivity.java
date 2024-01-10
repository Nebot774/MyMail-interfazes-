package com.example.mymail;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.graphics.Canvas;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configuración de la Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Configuración del DrawerLayout
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        // Configuración del NavigationView y el Spinner en la cabecera
        NavigationView navigationView = findViewById(R.id.nav_view);

        // Configurar el Spinner en la cabecera del NavigationView
        View headerView = navigationView.getHeaderView(0);
        Spinner spinner = headerView.findViewById(R.id.spinnerOptions);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.email_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        // Configuración de la navegación del menú
        navigationView.setNavigationItemSelectedListener(item -> {
            Fragment selectedFragment = null;
            String fragmentTitle = "";
            int id = item.getItemId();

            if (id == R.id.nav_inbox) {
                selectedFragment = new InboxFragment();
                fragmentTitle = getString(R.string.fragment_inbox);
            } else if (id == R.id.nav_outbox) {
                selectedFragment = new OutboxFragment();
                fragmentTitle = getString(R.string.fragment_outbox);
            } else if (id == R.id.nav_trash) {
                selectedFragment = new trashFragment();
                fragmentTitle = getString(R.string.fragment_trash);
            } else if (id == R.id.nav_spam) {
                selectedFragment = new SpamFragment();
                fragmentTitle = getString(R.string.fragment_spam);
            }

            if (selectedFragment != null) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, selectedFragment)
                        .commit();
                if (getSupportActionBar() != null) {
                    getSupportActionBar().setTitle(fragmentTitle);
                }
            }

            drawer.closeDrawer(GravityCompat.START);
            return true;
        });
    }
}




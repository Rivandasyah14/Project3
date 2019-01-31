package com.example.rivandamahdiansyaakhwatklsx.kisahislami;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity

        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_perkenalan) {
            ViewPager vv = new ViewPager();
            getSupportFragmentManager().beginTransaction().add(R.id.fl, vv).commit();
            getSupportFragmentManager().popBackStack();

            // Handle the camera action
        } else if (id == R.id.nav_cerita0) {
            Cerita0 c0 = new Cerita0();
            getSupportFragmentManager().beginTransaction().add(R.id.fl, c0).commit();
            getSupportFragmentManager().popBackStack();

        } else if (id == R.id.nav_cerita1) {
            KisahIslami ki = new KisahIslami();
            getSupportFragmentManager().beginTransaction().add(R.id.fl, ki).commit();
            getSupportFragmentManager().popBackStack();

        } else if (id == R.id.nav_cerita2) {
            Cerita3 c3 = new Cerita3();
            getSupportFragmentManager().beginTransaction().add(R.id.fl, c3).commit();
            getSupportFragmentManager().popBackStack();

        } else if (id == R.id.nav_cerita3) {
            Cerita4 c4 = new Cerita4();
            getSupportFragmentManager().beginTransaction().add(R.id.fl, c4).commit();
            getSupportFragmentManager().popBackStack();

        } else if (id == R.id.nav_cerita4) {
            Cerita5 c5 = new Cerita5();
            getSupportFragmentManager().beginTransaction().add(R.id.fl, c5).commit();
            getSupportFragmentManager().popBackStack();

        } else if (id == R.id.nav_cerita5) {
            Cerita6 c6 = new Cerita6();
            getSupportFragmentManager().beginTransaction().add(R.id.fl, c6).commit();
            getSupportFragmentManager().popBackStack();

        } else if (id == R.id.nav_tentang) {
            TentangFragment tf = new TentangFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fl, tf).commit();
            getSupportFragmentManager().popBackStack();
        }




        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

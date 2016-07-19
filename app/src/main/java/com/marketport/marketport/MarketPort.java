package com.marketport.marketport;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;

public class MarketPort extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    public final static String PRODUCT_ID = "default";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market_port);

        //Listeners for the product buttons
        //This needs to be changed to dynamic way of getting buttons
        initializeMainProductButtons();
        ImageButton b1 = (ImageButton) findViewById(R.id.product1);
        ImageButton b2 = (ImageButton) findViewById(R.id.product2);
        ImageButton b3 = (ImageButton) findViewById(R.id.product3);
        ImageButton b4 = (ImageButton) findViewById(R.id.product4);
        ImageButton b5 = (ImageButton) findViewById(R.id.product5);
        ImageButton b6 = (ImageButton) findViewById(R.id.product6);
        ImageButton b7 = (ImageButton) findViewById(R.id.product7);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.myapp_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        toolbar.setLogo(R.mipmap.basketicon);

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        drawer.setDrawerListener(toggle);
        toggle.syncState();


        //NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        //navigationView.setNavigationItemSelectedListener(this);

    }

    public void initializeMainProductButtons() {
        //This is the place where the product details object be created and assigned to buttons
    }

    @Override
    public void onClick(View v) {
        Intent intentDisplayProductDtls = new Intent(this, DisplayProductDtlsActivity.class);

        String productId = "default";
        boolean ignoreProdDtls = false;

        // To send information regarding the product Id Selected
        switch (v.getId()) {
            case R.id.product1:
                productId = "product1";
                break;
            case R.id.product2:
                productId = "product2";
                break;
            case R.id.product3:
                productId = "product3";
                break;
            case R.id.product4:
                productId = "product4";
                break;
            case R.id.product5:
                productId = "product5";
                break;
            case R.id.product6:
                productId = "product6";
                break;
            case R.id.product7:
                productId = "product7";
                break;
            case R.id.signIn:
                ignoreProdDtls = true;
                Intent intentSignIn = new Intent(this, SignInActivity.class);
                startActivity(intentSignIn);
                break;
            default:
                Log.i("MarketPort", "No Buttons selected in the onClick");
                return;
        }
        if (!ignoreProdDtls) {
            intentDisplayProductDtls.putExtra(PRODUCT_ID, productId);
            startActivity(intentDisplayProductDtls);
        }
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
        getMenuInflater().inflate(R.menu.market_port, menu);
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

        if (id == R.id.action_chat) {
            return true;
        }

        if (id == R.id.action_user) {
            return true;
        }

        if (id == R.id.action_shop) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_gallery) {
            // Handle the camera action
        } else if (id == R.id.nav_myhome) {

        } else if (id == R.id.nav_settings) {

        } else if (id == R.id.nav_mybasket) {

        } else if (id == R.id.nav_sellproduct) {

        } else if (id == R.id.nav_mylink) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_website) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

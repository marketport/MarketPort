package com.marketport.marketport;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DisplayProductDtlsActivity extends MarketPort {
    List<ImageView> myImageView = new ArrayList<ImageView>();
    List<Integer> myImages = new ArrayList<Integer>();
    String message = "default";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_product_dtls);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        //toolbar.setLogo(R.mipmap.basketicon);


        Intent intent = getIntent();
        message = intent.getStringExtra(MarketPort.PRODUCT_ID);

        configureImagebtn(message);

        //NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        //navigationView.setNavigationItemSelectedListener(this);
        //DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        //ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
        //        this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        //drawer.setDrawerListener(toggle);
        //toggle.syncState();
    }

    public void configureImagebtn(String message) {
        //List<ImageButton> myImageButton=new ArrayList<ImageButton>();
        //List<Integer> myImages=new ArrayList<Integer>();

        myImageView.add((ImageView) findViewById(R.id.productPic1));
        myImageView.add((ImageView) findViewById(R.id.productPic2));
        myImageView.add((ImageView) findViewById(R.id.productPic3));

        int countImageList = 0;

        switch (message) {
            case "product1":
                myImages.add(R.mipmap.mp3player);
                myImages.add(R.mipmap.mp3player2);
                myImages.add(R.mipmap.mp3player3);
                while (countImageList < myImageView.size()) {
                    myImageView.get(countImageList).setOnClickListener(this);
                    myImageView.get(countImageList).setImageResource(myImages.get(countImageList));
                    countImageList++;
                }
                break;
            case "product2":
                myImages.add(R.mipmap.smartwatch);
                myImages.add(R.mipmap.smartwatch2);
                myImages.add(R.mipmap.smartwatch3);
                while (countImageList < myImageView.size()) {
                    myImageView.get(countImageList).setOnClickListener(this);
                    myImageView.get(countImageList).setImageResource(myImages.get(countImageList));
                    countImageList++;
                }
                break;
            case "product3":
                myImages.add(R.mipmap.iphone);
                myImages.add(R.mipmap.iphone2);
                myImages.add(R.mipmap.iphone3);
                while (countImageList < myImageView.size()) {
                    myImageView.get(countImageList).setOnClickListener(this);
                    myImageView.get(countImageList).setImageResource(myImages.get(countImageList));
                    countImageList++;
                }
                break;
            case "product4":
                myImages.add(R.mipmap.nutellaspray);
                myImages.add(R.mipmap.nutellaspray2);
                myImages.add(R.mipmap.nutellaspray3);
                while (countImageList < myImageView.size()) {
                    myImageView.get(countImageList).setOnClickListener(this);
                    myImageView.get(countImageList).setImageResource(myImages.get(countImageList));
                    countImageList++;
                }
                break;
            case "product5":
                myImages.add(R.mipmap.mixer);
                myImages.add(R.mipmap.mixer2);
                myImages.add(R.mipmap.mixer3);
                while (countImageList < myImageView.size()) {
                    myImageView.get(countImageList).setOnClickListener(this);
                    myImageView.get(countImageList).setImageResource(myImages.get(countImageList));
                    countImageList++;
                }
                break;
            case "product6":
                myImages.add(R.mipmap.kitkat);
                myImages.add(R.mipmap.kitkat2);
                myImages.add(R.mipmap.kikat3);
                while (countImageList < myImageView.size()) {
                    myImageView.get(countImageList).setOnClickListener(this);
                    myImageView.get(countImageList).setImageResource(myImages.get(countImageList));
                    countImageList++;
                }
                break;
            case "product7":
                myImages.add(R.mipmap.parkerpen);
                myImages.add(R.mipmap.parker2);
                myImages.add(R.mipmap.parker3);
                while (countImageList < myImageView.size()) {
                    myImageView.get(countImageList).setOnClickListener(this);
                    myImageView.get(countImageList).setImageResource(myImages.get(countImageList));
                    countImageList++;
                }
                break;
            default:
                Log.i("DisplayProductDtls", "No Buttons selected in the onClick");
                return;
        }
    }


    @Override
    public void onClick(View v) {
        //Needs Change: Logic to load the pics dynamicaly and also to set their sizes
 /* Not required now to expand the photo
    Dialog imageDialog = new Dialog(this);
    imageDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
    imageDialog.setContentView(getLayoutInflater().inflate(R.layout.custom_show_image_dialog
            , null));

    TextView text = (TextView) imageDialog.findViewById(R.id.text);
    text.setText("Rs500/pcs");
    ImageView image1;
    ImageView image2;
    ImageView image3;

    switch(v.getId())
    {
        case R.id.productPic1 :
            image1 = (ImageView) imageDialog.findViewById(R.id.productImageFull1);
            image1.setImageResource(R.mipmap.parkerpen);
            image2 = (ImageView) imageDialog.findViewById(R.id.productImageFull2);
            image2.setImageResource(R.mipmap.parker2);
            image3 = (ImageView) imageDialog.findViewById(R.id.productImageFull3);
            image3.setImageResource(R.mipmap.parker3);
            break;
        case R.id.productPic2 :
            image1 = (ImageView) imageDialog.findViewById(R.id.productImageFull1);
            image1.setImageResource(R.mipmap.ic_launcher);
            image2 = (ImageView) imageDialog.findViewById(R.id.productImageFull2);
            image2.setImageResource(R.mipmap.ic_launcher);
            image3 = (ImageView) imageDialog.findViewById(R.id.productImageFull3);
            image3.setImageResource(R.mipmap.ic_launcher);
            break;
        case R.id.productPic3 :
            image1 = (ImageView) imageDialog.findViewById(R.id.productImageFull1);
            image1.setImageResource(R.mipmap.ic_launcher);
            image2 = (ImageView) imageDialog.findViewById(R.id.productImageFull2);
            image2.setImageResource(R.mipmap.ic_launcher);
            image3 = (ImageView) imageDialog.findViewById(R.id.productImageFull3);
            image3.setImageResource(R.mipmap.ic_launcher);
            break;
        default:
            Log.i("MarketPort","No Buttons selected in the onClick");
            return;
    }
    //image1.getLayoutParams().width = 1300;
    //image1.getLayoutParams().height = 1300;
    //image1.setAdjustViewBounds(true);

    //image2.getLayoutParams().width = ;
    //image2.getLayoutParams().height = 250;
    //image2.setAdjustViewBounds(true);

    //image3.getLayoutParams().width = 250;
    //image3.getLayoutParams().height = 250;
    //image3.setAdjustViewBounds(true);
    imageDialog.show();
    //Toast.makeText(this, "this is my Toast message!!! =)"+ v.getNextFocusDownId(),Toast.LENGTH_LONG).show();
    */
    }

    @Override
    public void onBackPressed() {
        // do something on back.
        finish();
    }

}


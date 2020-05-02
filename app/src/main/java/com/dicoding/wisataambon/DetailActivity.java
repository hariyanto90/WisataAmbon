package com.dicoding.wisataambon;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    TextView tvName, tvDetail, tvLocation;
    ImageView imgPhoto, imgIcon;


    public static final int EXTRA_ITEM_PHOTO = 1;
    // public static final int EXTRA_ITEM_ICON = 1;
    public static final String EXTRA_ITEM_NAME = "extra_item_name";
    public static final String EXTRA_ITEM_LOCATION = "extra_item_location";
    public static final String EXTRA_ITEM_DETAIL = "extra_item_detail";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        setContentView(R.layout.activity_detail);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("");

        }


        imgPhoto = findViewById(R.id.img_item_photo);
        //   imgIcon = findViewById(R.id.img_icon);
        tvName = findViewById(R.id.tv_item_name);
        tvLocation = findViewById(R.id.tv_location);
        tvDetail = findViewById(R.id.tv_item_detail);


        String itemName = getIntent().getStringExtra(EXTRA_ITEM_NAME);
        String itemLocation = getIntent().getStringExtra(EXTRA_ITEM_LOCATION);
        String itemDetail = getIntent().getStringExtra(EXTRA_ITEM_DETAIL);
        int Photo = getIntent().getIntExtra(String.valueOf(EXTRA_ITEM_PHOTO), 1);
        // int Icon = getIntent().getIntExtra(String.valueOf(EXTRA_ITEM_ICON), 1);


        tvName.setText(itemName);
        tvLocation.setText(itemLocation);
        tvDetail.setText(itemDetail);
        imgPhoto.setImageResource(Photo);
        // imgIcon.setImageResource(Icon);
    }
}



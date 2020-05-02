package com.dicoding.wisataambon;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {



    TextView mNama, mEmail;
    ImageView mImage, mIcon;

    public static final String EXTRA_NAMA = "extra_nama";
    public static final String EXTRA_EMAIL = "extra_email";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("About");


            ImageView btnIconEmail = findViewById(R.id.icon_email);
            btnIconEmail.setOnClickListener(new View.OnClickListener() {
                // membuat onClick intent implisit pada icon email

                                                public void onClick(View v) {
                                                    switch (v.getId()) {
                                                        case R.id.icon_email:
                                                            Intent iconIntent = new Intent(Intent.ACTION_SEND);
                                                            iconIntent.setData(Uri.parse("mailto:"));
                                                            String[] to = {"hariyanto.ambon1990@gmail.com", ""};
                                                            iconIntent.putExtra(Intent.EXTRA_EMAIL, to);
                                                            iconIntent.setType("message/rfc822");
                                                            Intent chooser = Intent.createChooser(iconIntent, "Send email");
                                                            startActivity(chooser);
                                                            break;
                                                    }
                                                }
                                            });



            mImage = findViewById(R.id.image);
            mNama = findViewById(R.id.nama);
            mEmail = findViewById(R.id.nama_email);


            String nama = getIntent().getStringExtra(EXTRA_NAMA);
            String email = getIntent().getStringExtra(EXTRA_EMAIL);


            mNama.setText(nama);
            mEmail.setText(email);


        }

    }


}

package com.bintang.pedulilinduingiver2;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    private ImageView btn_back ,img;
    private TextView title, desc;

    private String getTitle, getDesc;
    private int getImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_detail);

        // untuk inisialisasi widget l
        btn_back = (ImageView) findViewById(R.id.btn_back);
        img = (ImageView) findViewById(R.id.img);
        title = (TextView) findViewById(R.id.title);
        desc = (TextView) findViewById(R.id.desc);

        //berfungsi untuk mengambil data yang dikrm dari halaman selanjutnya
        getTitle = getIntent().getStringExtra("title");
        getDesc = getIntent(). getStringExtra("desc");
        getImg = getIntent(). getIntExtra("img",R.mipmap.ic_launcher);

        //Buttonback
        btn_back.setOnClickListener(view -> {
            onBackPressed();
            finish();
        });

        //set data ke tampilan
        title.setText(getTitle);
        desc.setText(getDesc);
        Glide.with(this)
                .load(getImg)
                .into(img);
    }
}
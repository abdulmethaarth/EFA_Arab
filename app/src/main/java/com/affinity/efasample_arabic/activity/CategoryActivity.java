package com.affinity.efasample_arabic.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.affinity.efasample_arabic.adapter.First_listCustomAdapter;
import com.affinity.efasample_arabic.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class CategoryActivity extends AppCompatActivity {


    //First_list
    int[] first_list_images = {R.drawable.accessories_box_img, R.drawable.perfume_box_img, R.drawable.soap_box_img, R.drawable.gardening_box_img,R.drawable.accessories_box_img,R.drawable.accessories_box_img,};
    String [] arabtname = {"إكسسوارات","العطور والبخور","صنع الصابون","مسار البستنة","إكسسوارات","إكسسوارات"};
    String [] catname = {"مكملات","العطور والبخور","صنع الصابون","مسار البستنة","مكملات","مكملات"};
    RecyclerView first_listlView;
    First_listCustomAdapter first_listlAdapter;
    CircleImageView filter;
    ImageView cart,loc,btm_home,btm_save,btm_notify,btm_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);


        filter = (CircleImageView)findViewById(R.id.filter);
        first_listlView = (RecyclerView) findViewById(R.id.first_list);
        first_listlAdapter = new First_listCustomAdapter(CategoryActivity.this, first_list_images,arabtname,catname);
        LinearLayoutManager filayoutManager= new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false);
        first_listlView.setAdapter(first_listlAdapter);
        first_listlView.setLayoutManager(filayoutManager);


        btm_home = (ImageView)findViewById(R.id.btm_home);
        btm_save = (ImageView)findViewById(R.id.btm_save);
        btm_notify = (ImageView)findViewById(R.id.btm_notify);
        btm_account = (ImageView)findViewById(R.id.btm_account);



        btm_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CategoryActivity.this, MainActivity.class));
                finish();
            }
        });

        btm_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CategoryActivity.this, ProductListActivity.class));
                finish();
            }
        });

        btm_notify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CategoryActivity.this, NotificationActivity.class));
                finish();
            }
        });

        btm_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CategoryActivity.this, ProfileActivity.class));
                finish();
            }
        });
    }
}
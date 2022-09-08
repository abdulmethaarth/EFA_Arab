package com.affinity.efasample_arabic.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.affinity.efasample_arabic.adapter.InnerSubCatAdapter;
import com.affinity.efasample_arabic.R;

public class InnerSubCategoryActivity extends AppCompatActivity {

    ImageView back;
    int[] images = {R.drawable.accessories_box_img, R.drawable.banner3, R.drawable.banner2, R.drawable.banner,R.drawable.accessories_box_img, R.drawable.banner3, R.drawable.banner2, R.drawable.banner};
    String [] rate = {"SAR 32.00","SAR 29.00","SAR 34.00","SAR 31.00","SAR 32.00","SAR 29.00","SAR 34.00","SAR 31.00"};
    String [] name = {"بولو بلو باي رالف","لاكوست أو دي بلانك","بولغري مان إن بلاك","مونت بلانك ليجند نايت","مغر هوم أوو","جاغوار مين كلاسيك","دولتشي غابانا","آحرون"};
    RecyclerView lView;
    String [] count = {"متوفرة : 15","متوفرة : 10","متوفرة : 5","متوفرة : 27","متوفرة : 45","متوفرة : 50","متوفرة : 30","متوفرة : 23" };
    InnerSubCatAdapter lAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inner_sub_category);

        lView = (RecyclerView) findViewById(R.id.first_listcat);
        back = (ImageView) findViewById(R.id.back);
        lAdapter = new InnerSubCatAdapter(InnerSubCategoryActivity.this, images,rate,name,count);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);
        gridLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        lView.setAdapter(lAdapter);
        lView.setLayoutManager(gridLayoutManager);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InnerSubCategoryActivity.this, SubCategoryActivity.class));
            }
        });

    }
}
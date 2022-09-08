package com.affinity.efasample_arabic.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.affinity.efasample_arabic.adapter.MyOrderAdapter;
import com.affinity.efasample_arabic.R;

public class YourOrdersActivity extends AppCompatActivity {

    RelativeLayout layout_back_arrow,layout_continue;
    int[] images = {R.drawable.featured6, R.drawable.featured1, R.drawable.featured3, R.drawable.featured4, R.drawable.featured2, R.drawable.featured5, R.drawable.cat2, R.drawable.cat1, R.drawable.best_sell3,R.drawable.best_sell2,R.drawable.best_sell1};
    String [] rate = {"SAR 32","SAR 29","SAR 35","19","SAR 25","SAR 29","SAR 34","31","SAR 32","SAR 40","SAR 35"};
    String [] name = {"قميص للرجال","تي شيرت نسائي","تي شيرت نسائي","بليزر","تي شيرت نسائي","قميص رجل","قميص للرجال","بليزر","تي شيرت نسائي","بليزر","تي شيرت نسائي"};
    String [] brand = {"أوتو","Parx","بارك افينيو","الأبراج الفلكية","جون بلايرز","لويس فيليب","Parx","بليزر","بيتر انجلترا","بليزر","الأبراج الفلكية"};
    RecyclerView lView;
    MyOrderAdapter lAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_orders);


        layout_back_arrow = (RelativeLayout)findViewById(R.id.layout_back_arrow);
        layout_continue = (RelativeLayout)findViewById(R.id.layout_continue);

        lView = (RecyclerView) findViewById(R.id.ordertLists);
        lAdapter = new MyOrderAdapter(YourOrdersActivity.this, images,rate,name,brand);
        LinearLayoutManager layoutManager= new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false);
        layoutManager.setReverseLayout(true);
        lView.setAdapter(lAdapter);
        lView.setLayoutManager(layoutManager);


        layout_back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(YourOrdersActivity.this,MainActivity.class));
            }
        });
    }

}
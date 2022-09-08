package com.affinity.efasample_arabic.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.affinity.efasample_arabic.adapter.CartAdapter;
import com.affinity.efasample_arabic.R;

public class BuyNowActivity extends AppCompatActivity {

    RelativeLayout layout_back_arrow,layout_continue;
    int[] images = { R.drawable.best_sell3,R.drawable.best_sell1};
    String [] rate = {"SAR 40","SAR 35"};
    String [] name = {"تي شيرت نسائي","بليزر"};
    String [] brand = {"أوتو","أوتو"};
    RecyclerView lView;
    CartAdapter lAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_now);

        layout_back_arrow = (RelativeLayout)findViewById(R.id.layout_back_arrow);
        layout_continue = (RelativeLayout)findViewById(R.id.layout_buy);

        lView = (RecyclerView) findViewById(R.id.checkoutLists);
        lAdapter = new CartAdapter(BuyNowActivity.this, images,rate,name,brand);
        LinearLayoutManager layoutManager= new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false);
        layoutManager.setReverseLayout(true);
        lView.setAdapter(lAdapter);
        lView.setLayoutManager(layoutManager);

        layout_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // startActivity(new Intent(BuyNowActivity.this,GatewayActivity.class));
                startActivity(new Intent(BuyNowActivity.this, CompleteActivity.class));
            }
        });

        layout_back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BuyNowActivity.this, PaymentActivity.class));
            }
        });
    }
}
package com.affinity.efasample_arabic.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.affinity.efasample_arabic.R;

public class CompleteActivity extends AppCompatActivity {

    RelativeLayout layout_backHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete);

        layout_backHome = (RelativeLayout)findViewById(R.id.layout_backHome);
        layout_backHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CompleteActivity.this, MainActivity.class));
            }
        });
    }

    @Override
    public void onBackPressed() {

        new AlertDialog.Builder(this)
                .setTitle("خروج ?")
                .setMessage("هل أنت متأكد أنك تريد الخروج?")
                .setNegativeButton("لا", null)
                .setPositiveButton("نعم", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {
                        finish();
                        System.exit(0);
                    }
                }).create().show();
    }
}
package com.affinity.efasample_arabic.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.affinity.efasample_arabic.R;

public class LoginMobileActivity extends AppCompatActivity {

    TextView click_here,next,terms_condition;
    ImageView cancel_button;
    EditText edt_mobile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_mobile);

        edt_mobile = (EditText) findViewById(R.id.edt_mobile);
        cancel_button = (ImageView) findViewById(R.id.cancel_button);
        click_here = (TextView) findViewById(R.id.click_here);
        terms_condition = (TextView) findViewById(R.id.terms_condition);
        next = (TextView) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginMobileActivity.this, AddressActivity.class));
                finish();
            }
        });

        click_here.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginMobileActivity.this,LoginActivity.class));
                finish();
            }
        });

        terms_condition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginMobileActivity.this, "terms & conditions", Toast.LENGTH_SHORT).show();
                /*startActivity(new Intent(LoginMobileActivity.this,LoginActivity.class));
                finish();*/
            }
        });

        cancel_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt_mobile.setText("");
                edt_mobile.setFocusable(true);

            }
        });

    }
}
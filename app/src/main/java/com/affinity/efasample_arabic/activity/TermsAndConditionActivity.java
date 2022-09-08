package com.affinity.efasample_arabic.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;
import android.widget.Toast;

import com.affinity.efasample_arabic.R;
import com.affinity.efasample_arabic.RetrofitClient;
import com.affinity.efasample_arabic.models.TermsAndConditions;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TermsAndConditionActivity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_and_condition);

        text = (TextView)findViewById(R.id.text);

        Call<TermsAndConditions> call = RetrofitClient.getApiService().getTerms("ar");

        call.enqueue(new Callback<TermsAndConditions>() {
            @Override
            public void onResponse(Call<TermsAndConditions> call, Response<TermsAndConditions> response) {
                TermsAndConditions data = response.body();

                if (data.status.equalsIgnoreCase("true")) {
                    text.setText(Html.fromHtml(Html.fromHtml(data.getTermsAndConditionContents().get(0).getContent()).toString()));
                }else{
                    Toast.makeText(TermsAndConditionActivity.this, "Fetching failed", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<TermsAndConditions> call, Throwable t) {
                Toast.makeText(TermsAndConditionActivity.this, "Check your internet", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
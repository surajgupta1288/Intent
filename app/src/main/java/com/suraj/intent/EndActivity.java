package com.suraj.intent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class EndActivity extends AppCompatActivity {
    private TextView mTvFirstName, mTvName,mTvClg,mTvRegd,mTvMail;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        mTvFirstName = findViewById(R.id.tv_first_name);
        mTvName = findViewById(R.id.tv_name);
        mTvClg = findViewById(R.id.tv_clg);
        mTvRegd = findViewById(R.id.tv_regd);
        mTvMail = findViewById(R.id.tv_mail);

        Intent i = getIntent();
        String name = i.getStringExtra("name");
        String clg = i.getStringExtra("clg");
        String regd = i.getStringExtra("regd");
        String mail= i.getStringExtra("mail");


        mTvFirstName.setText(name);
        mTvName.setText(name);
        mTvClg.setText(clg);
        mTvRegd.setText(regd);
        mTvMail.setText(mail);

    }
    @Override
    public void onBackPressed() {
        Toast.makeText(this,"U CAN'T GO BACKWORD",Toast.LENGTH_LONG).show();
    }
}

package com.suraj.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StartActivity extends AppCompatActivity {

    private EditText mEtName,mEtClg,mEtRegd,mEtMail;
    private Button mBtnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        mEtName = findViewById(R.id.et_name);
        mEtClg = findViewById(R.id.et_clg);
        mEtRegd = findViewById(R.id.et_regd);
        mEtMail = findViewById(R.id.et_mail);
        mBtnSubmit = findViewById(R.id.btn_submit);

        mBtnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = mEtName.getText().toString();
                String clg = mEtClg.getText().toString();
                String regd = mEtRegd.getText().toString();
                String mail = mEtMail.getText().toString();
                Intent intent = new Intent(StartActivity.this,EndActivity.class);
                intent.putExtra("name",name);
                intent.putExtra("clg",clg);
                intent.putExtra("regd",regd);
                intent.putExtra("mail",mail);
                startActivity(intent);

            }
        });
    }
}
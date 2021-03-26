package com.example.cadastropessoas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class resultPage extends AppCompatActivity {

    private String resultName, resultAddress, resultPhone, resultEmail;
    private TextView textViewName, textViewAddress, textViewPhone, textViewEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_page);

        textViewName = (TextView) findViewById(R.id.resultName);
        textViewAddress = (TextView) findViewById(R.id.resultAddress);
        textViewPhone = (TextView) findViewById(R.id.resultPhone);
        textViewEmail = (TextView) findViewById(R.id.resultEmail);

        Intent it = getIntent();

        resultName = it.getStringExtra("name");
        resultAddress = it.getStringExtra("address");
        resultPhone = it.getStringExtra("phone");
        resultEmail = it.getStringExtra("email");

        textViewName.setText(resultName);
        textViewAddress.setText(resultAddress);
        textViewPhone.setText(resultPhone);
        textViewEmail.setText(resultEmail);
    }
}
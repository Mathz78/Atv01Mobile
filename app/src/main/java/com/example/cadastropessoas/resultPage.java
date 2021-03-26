package com.example.cadastropessoas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class resultPage extends AppCompatActivity {

    private String result;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_page);

        textView = (TextView) findViewById(R.id.resultName);
        Intent it = getIntent();
        result = it.getStringExtra("RESULT");

        textView.setText(result);
    }
}
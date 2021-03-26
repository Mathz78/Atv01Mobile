package com.example.cadastropessoas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button saveButton;
    private EditText inputName, inputAddress, inputPhone, inputEmail;

    public static final String sendName = "name";
    public static final String sendAddress = "address";
    public static final String sendPhone = "phone";
    public static final String sendEmail = "email";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saveButton = (Button)findViewById(R.id.saveButton);
        inputName = (EditText)findViewById(R.id.inputName);
        inputAddress = (EditText)findViewById(R.id.inputAddress);
        inputPhone = (EditText)findViewById(R.id.inputPhone);
        inputEmail = (EditText)findViewById(R.id.inputEmail);

        createListener(inputName, inputAddress, inputPhone, inputEmail);
    }

    private void createListener(EditText name, EditText address, EditText phone, EditText email) {
        saveButton.setOnClickListener(event -> save(name, address, phone, email));
    }

    private void save(EditText name, EditText address, EditText phone, EditText email) {
        Intent it = new Intent(this, resultPage.class);

        String resultName = name.getText().toString();
        String resultAddress = address.getText().toString();
        String resultPhone = phone.getText().toString();
        String resultEmail = email.getText().toString();

        it.putExtra(sendName, resultName);
        it.putExtra(sendAddress, resultAddress);
        it.putExtra(sendPhone, resultPhone);
        it.putExtra(sendName, resultEmail);

        startActivity(it);
    }
}
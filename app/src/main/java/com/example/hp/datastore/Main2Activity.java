package com.example.hp.datastore;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView name,email,password,age;
    String userNmae,userEmail,userPassword,userAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        get the refern
        name = findViewById(R.id.nameID);
        email = findViewById(R.id.emailID);
        password = findViewById(R.id.paswrdID);
        age = findViewById(R.id.paswrdID);

        SharedPreferences sp = getSharedPreferences("details",MODE_PRIVATE);

        userNmae = sp.getString("name","none");
        userEmail = sp.getString("email","none");
        userPassword = sp.getString("password","none");
        userAge = sp.getString("agr","none");

        name.setText(userNmae);
        email.setText(userEmail);
        password.setText(userPassword);
        age.setText(userAge);



    }
}

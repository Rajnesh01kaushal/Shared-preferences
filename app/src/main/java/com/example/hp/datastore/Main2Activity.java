package com.example.hp.datastore;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView name,age,cls;
    String userNmae,userAge,userClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        get the refern
        name = findViewById(R.id.text1);
        age = findViewById(R.id.text2);
        cls = findViewById(R.id.text3);

        SharedPreferences sp = getSharedPreferences("details",MODE_PRIVATE);

        userNmae = sp.getString("name","none");
        userAge = sp.getString("agr","none");
        userClass = sp.getString("Class","none");

        name.setText(userNmae);
        age.setText(userAge);
        cls.setText(userClass);


    }
}

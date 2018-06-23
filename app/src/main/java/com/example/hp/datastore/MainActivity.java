package com.example.hp.datastore;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name,age,email,password;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get the reference
        name = findViewById(R.id.nametxt);
        age = findViewById(R.id.ages);
        email = findViewById(R.id.clss);
        password = findViewById(R.id.passwd);
        btn = findViewById(R.id.share);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(TextUtils.isEmpty(name.getText().toString())){
                    name.setError("Required Filed");
                    return;
                }

                if(TextUtils.isEmpty(age.getText().toString())){
                    age.setError("Required Filed");
                    return;
                }

                if (TextUtils.isEmpty(email.getText().toString())){
                    email.setError("Required Filed");
                    return;
                }

                if(TextUtils.isEmpty(password.getText().toString())){
                    password.setError("Required Filed");
                }

                String userName, userage, useremail, userpassword = null;

                userName = name.getText().toString();
                userage = name.getText().toString();
                useremail = name.getText().toString();
                userpassword = name.getText().toString();

                SharedPreferences sp = getSharedPreferences("details", MODE_PRIVATE);

                SharedPreferences.Editor editor = sp.edit();

                editor.putString("name", userName);
                editor.putString("age", userage);
                editor.putString("email", useremail);
                editor.putString("password", userpassword);

                editor.commit();


//                        Intent myActivity = new Intent(MainActivity.this,Main2Activity.class);
//                        startActivity(myActivity);



                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("submit continue");
                builder.setMessage("Are you sure to continue");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                        startActivity(intent);
                    }
                });
                builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        finish();
                    }
                });

            }
        });


    }
}

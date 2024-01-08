package com.example.androidhelp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity2 extends AppCompatActivity {
    EditText t1;
    EditText t2;

    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1 = (EditText) findViewById(R.id.em1);
        t2 = (EditText) findViewById(R.id.pwd2);

    }
    public void Signup(View view){
        String email = t1.getText().toString();
        String password = t2.getText().toString();
        mAuth = FirebaseAuth.getInstance();
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(MainActivity2.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            t1.setText("");
                            t2.setText("");
                            startActivity(new Intent(MainActivity2.this , MainActivity.class));
                            Toast.makeText(MainActivity2.this, "Registered Successfully", Toast.LENGTH_SHORT).show();

                        } else {
                            t1.setText("");
                            t2.setText("");
                            Toast.makeText(MainActivity2.this, "Error registering", Toast.LENGTH_SHORT).show();

                        }
                    }
                });


    }

}
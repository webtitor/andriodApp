package com.bowler_scruitinizer_1.bowler_scruitinizer_1;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  private  Button register;
  private EditText email , password;
  private TextView already;
  private ProgressDialog progress;
  private FirebaseAuth firebase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        firebase = FirebaseAuth.getInstance();
        progress = new ProgressDialog(this);
    }

    private void init() {

        register = (Button)findViewById(R.id.Register);
        email = (EditText)findViewById(R.id.email);
        password = (EditText)findViewById(R.id.password);
        already = (TextView)findViewById(R.id.already);

        register.setOnClickListener(this);
        already.setOnClickListener(this);

    }

    private void registerUser(){
        String em = email.getText().toString().trim();
        String pas = password.getText().toString().trim();

        if(TextUtils.isEmpty(em)){
            //email is empty

            Toast.makeText(this ,"Please enter email" , Toast.LENGTH_SHORT).show();
            //stop the further execution of program
            return;
        }

        if(TextUtils.isEmpty(pas)){
            //password is not entered
            Toast.makeText(this , "Please enter password" , Toast.LENGTH_SHORT).show();
            //stop the further execution of program
            return;
        }
//if regiteration is ok , we would show a progress dialog
     // progress.setMessage("Registering please wait...");
       // progress.show();


        firebase.createUserWithEmailAndPassword(em,pas).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    //user is sucessfully registered and login
                    //we will start a profile message here
                    //right now only a toast is represented
                    Toast.makeText(MainActivity.this , "Sucessfully registered" ,Toast.LENGTH_SHORT ).show();
                }

                else{
                    Toast.makeText(MainActivity.this, "Not registered. Please try again" , Toast.LENGTH_SHORT).show();

                }
            }
        });
    }


    @Override
    public void onClick(View view) {

        if(view == register){
         registerUser();}

        if(view == already){
            //will open login activity
            Intent i = new Intent(MainActivity.this , Sign_in.class);
            startActivity(i);
        }

    }
}

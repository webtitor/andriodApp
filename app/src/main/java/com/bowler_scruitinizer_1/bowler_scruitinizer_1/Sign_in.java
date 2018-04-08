package com.bowler_scruitinizer_1.bowler_scruitinizer_1;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Sign_in extends AppCompatActivity {

 //   private FirebaseAuth firebaseAuth;
    EditText email , password;
    Button login ;
  private  TextView Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        init();
      //  firebaseAuth = FirebaseAuth.getInstance();

        //if(firebaseAuth.getCurrentUser() != null){
            //profile activity comes here
          //  finish();
            // startActivity(new Intent(Sign_in.this , profile.class));
        //}


    }


  public void  init(){
   //     email = (EditText)findViewById(R.id.emailU) ;
     //   password = (EditText)findViewById(R.id.passwordU);
       // login = (Button)findViewById(R.id.Login) ;

        //login.setOnClickListener(new View.OnClickListener() {
          //  @Override
            // public void onClick(View view) {
               // signin();
         //   }
       // });

      Register = (TextView)findViewById(R.id.register);

      Register.setOnClickListener(new View.OnClickListener()
                                    {


                                        @Override
                                        public void onClick(View view) {
                                            Intent in = new Intent(Sign_in.this , MainActivity.class);
                                            startActivity(in);
                                        }
                                    }



        );


  }

    // private void signin() {
// String e = email.getText().toString().trim();
// String p = password.getText().toString().trim();

        // if(TextUtils.isEmpty(e)){
            //email is empty

           //  Toast.makeText(this ,"Please enter email" , Toast.LENGTH_SHORT).show();
            //stop the further execution of program
          //  return;
        //  }

        // if(TextUtils.isEmpty(p)){
            //password is not entered
           // Toast.makeText(this , "Please enter password" , Toast.LENGTH_SHORT).show();
            //stop the further execution of program
         //   return;
       //  }

      //  firebaseAuth.signInWithEmailAndPassword(e , p).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
    //        @Override
  //          public void onComplete(@NonNull Task<AuthResult> task) {
//  if(task.isSuccessful()){

    //start profile activity
    // finish();
  //  startActivity(new Intent(Sign_in.this , profile.class));
//  } else{
    //display some message
   // Toast.makeText(Sign_in.this, "Not registered. Please try again" , Toast.LENGTH_SHORT).show();

 // }
     //      }



   //    });





 //  }
}

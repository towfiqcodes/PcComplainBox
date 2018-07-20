package com.backerror.rit.pccomplainbox.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.backerror.rit.pccomplainbox.R;

public class loginButton extends AppCompatActivity {
 private Button loginButton;
 private Button signupButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_login__button );

        loginButton=findViewById( R.id.loginButton );
        signupButton=findViewById( R.id.signButton );

        loginButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( com.backerror.rit.pccomplainbox.Activity.loginButton.this, LogIn.class);
                startActivity(intent);


            }
        } );

        signupButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent( loginButton.this,SignUp.class );
                startActivity( intent );
            }
        } );
    }
}

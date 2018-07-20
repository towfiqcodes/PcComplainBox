package com.backerror.rit.pccomplainbox.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.backerror.rit.pccomplainbox.R;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_sign_up );

        Toast.makeText( getApplicationContext(),"This is a SignUp  page for new register  people",Toast.LENGTH_SHORT ).show();
    }
}

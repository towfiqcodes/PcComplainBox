package com.backerror.rit.pccomplainbox.Activity;

import android.content.DialogInterface;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.backerror.rit.pccomplainbox.R;

public class SignUp extends AppCompatActivity  {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_sign_up );
         button=findViewById( R.id.button );
         button.setOnClickListener( new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 AlertDialog.Builder builder = new AlertDialog.Builder(
                         SignUp.this);
                 builder.setTitle("Signup page");
                 builder.setMessage("Page is not applicabel at this moment");
                 builder.setPositiveButton("OK",
                                           new DialogInterface.OnClickListener() {
                                               public void onClick(DialogInterface dialog,
                                                                   int which) {
                                                   Toast.makeText(getApplicationContext(),"Sorry page is under construction",Toast.LENGTH_LONG).show();
                                               }
                                           });
                 builder.show();
             }
         });
    }
}

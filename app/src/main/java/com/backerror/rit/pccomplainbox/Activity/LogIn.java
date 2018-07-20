package com.backerror.rit.pccomplainbox.Activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import com.backerror.rit.pccomplainbox.MainActivity;
import com.backerror.rit.pccomplainbox.R;

import static android.Manifest.permission.READ_CONTACTS;

/**
 * A login screen that offers login via email/password.
 */
public class LogIn extends AppCompatActivity  {

    EditText firstNameEt;
    EditText middleNameEt;
    EditText lastNameEt;
    Button submitBtn;
    TextView fullNameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_sign__in );
        firstNameEt=findViewById(R.id.firstNameEditText);
        middleNameEt=findViewById(R.id.middleNameEditText);
        lastNameEt=findViewById(R.id.lastNameEditText);
        submitBtn=findViewById(R.id.submitBtn);
        fullNameText=findViewById(R.id.fullNameText);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstName=firstNameEt.getText().toString();
                String middleName=middleNameEt.getText().toString();
                String lastName=lastNameEt.getText().toString();
                Intent intent=new Intent( LogIn.this, MainActivity.class );
                startActivity( intent );
            }
        });


         }
}


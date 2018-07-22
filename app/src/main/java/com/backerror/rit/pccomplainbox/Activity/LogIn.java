package com.backerror.rit.pccomplainbox.Activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
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
import android.widget.Toast;

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
                        LogIn.this);
                builder.setTitle("Signup page");
                builder.setMessage("Page is not applicable at this moment");
                builder.setPositiveButton("OK",
                                          new DialogInterface.OnClickListener() {
                                              public void onClick(DialogInterface dialog,
                                                                  int which) {
                                                  Toast.makeText( getApplicationContext(), "Sorry page is under construction", Toast.LENGTH_LONG).show();
                                              }
                                          });
                builder.show();
            }
        });
    }
}


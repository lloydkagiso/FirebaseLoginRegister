package com.example.lloyd.firebaseloginregister;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth auth;
    private FirebaseUser deleteUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        toolbar.setTitle(getString(R.string.app_name));
//        setSupportActionBar(toolbar);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        auth = FirebaseAuth.getInstance();


        // Handle item selection
        switch (item.getItemId()) {
            case R.id.sign_out:
                auth.signOut();
                finish();
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
                break;

            case R.id.change_password:
                finish();
                startActivity(new Intent(MainActivity.this, ResetPasswordActivity.class));

                 default:
                return super.onOptionsItemSelected(item);


        }
        return true;
    }
}
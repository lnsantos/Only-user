package com.lucas.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.lucas.R;
import com.lucas.component.DaggerMainActivityComponent;
import com.lucas.contract.MainActivityContract;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View, View.OnClickListener {

    private EditText name,password;
    private Button login,register;

    @Inject
    MainActivityContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Started dagger
        DaggerMainActivityComponent.create().inject(this);
        presenter.setView(this);

        setFids();
        setOnListener();

    }

    private void setOnListener() {
        login.setOnClickListener(this);
    }

    @Override
    public void setErrorUsername(String error) {
        name.setError(error);
    }

    @Override
    public void setErrorPassword(String error) {
        password.setError(error);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_login:
                presenter.loginClicked();
                break;
        }
    }

    private void setFids() {
        name = findViewById(R.id.edt_username);
        password = findViewById(R.id.edt_password);
        login = findViewById(R.id.btn_login);
    }


    @Override
    public void showMessage(String message) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }

    @Override
    public void nextActivity(Intent next) {
        startActivity(next);
    }

    @Override
    public String getUsername() {
        return name.getText().toString();
    }

    @Override
    public String getPassword() {
        return password.getText().toString();
    }

    @Override
    public void setUsername() {

    }

    @Override
    public void setPassword() {

    }
}

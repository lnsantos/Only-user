package com.lucas.presenter;

import android.content.Intent;

import com.lucas.R;
import com.lucas.contract.MainActivityContract;
import com.lucas.model.domain.User;

public class MainActivityPresenter implements MainActivityContract.Presenter, MainActivityContract.Model.Callback {

    private MainActivityContract.Model model;
    private MainActivityContract.View view;

    public MainActivityPresenter(MainActivityContract.Model model) {
        this.model = model;

    }

    @Override
    public void loginClicked() {
        Integer error = 0;
        if(view.getUsername().equals("")){
            error++;
            view.setErrorUsername("USERNAME VAZIO!!");
        }

        if(view.getPassword().equals("")){
            error++;
            view.setErrorPassword("PASSWORD VAZIO!!");
        }

        if(error < 1){
            model.attachCallback(this);
            model.handlerLogin();
        }

    }

    @Override
    public void setView(MainActivityContract.View view) {
        this.view = view;
    }

    @Override
    public void onResultLogin(User user) {
        view.showMessage("Wellcome ");
    }

    @Override
    public void onErrroResultLogin(String message) {
        view.showMessage(message);
    }
}

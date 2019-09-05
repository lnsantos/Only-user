package com.lucas.model;

import com.lucas.contract.MainActivityContract;
import com.lucas.model.domain.User;

public class MainModel implements MainActivityContract.Model {


    private Callback callback;

    @Override
    public void handlerLogin() {
        User u = new User(0,"Username", "email@email.com","showflow",2);
        callback.onResultLogin(u);
    }

    @Override
    public void attachCallback(Callback callback) {
        this.callback = callback;
    }

}

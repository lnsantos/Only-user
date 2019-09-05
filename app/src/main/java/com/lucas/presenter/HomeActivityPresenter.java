package com.lucas.presenter;

import com.lucas.contract.HomeActivityContract;
import com.lucas.contract.MainActivityContract;
import com.lucas.model.HomeModel;

public class HomeActivityPresenter implements HomeActivityContract.Presenter {

     MainActivityContract.Model model;

    public HomeActivityPresenter(MainActivityContract.Model model) {
        this.model = model;
    }
}

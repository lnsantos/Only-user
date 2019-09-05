package com.lucas.modules;

import com.lucas.contract.MainActivityContract;
import com.lucas.model.MainModel;
import com.lucas.model.domain.User;
import com.lucas.presenter.MainActivityPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {

    @Provides
    public MainActivityContract.Model provideModel(){
        return new MainModel();
    }


    @Provides
    public MainActivityContract.Presenter providePresenter(MainActivityContract.Model model){
        return new MainActivityPresenter(model);
    }


    @Provides
    public User provideUser(){
        return new User();
    }

}

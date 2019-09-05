package com.lucas.modules;

import com.lucas.contract.HomeActivityContract;
import com.lucas.contract.MainActivityContract;
import com.lucas.model.HomeModel;
import com.lucas.model.domain.Group;
import com.lucas.model.domain.User;
import com.lucas.presenter.HomeActivityPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class HomeActivityModule {

    @Provides
    public User provideGetUser(){
        return new User();
    }

    @Provides
    public Group provideGetGroup(){
        return new Group();
    }

    @Provides
    public HomeActivityContract.Model provideModel(){
        return new HomeModel();
    }

    @Provides
    public HomeActivityContract.Presenter providePresenter(MainActivityContract.Model model){
        return new HomeActivityPresenter(model);
    }

}

package com.lucas.component;

import com.lucas.modules.HomeActivityModule;
import com.lucas.modules.MainActivityModule;
import com.lucas.ui.HomeActivity;
import com.lucas.ui.MainActivity;

import dagger.Component;

@Component( modules = {MainActivityModule.class, HomeActivityModule.class})
public interface MainActivityComponent {

    void inject(MainActivity mainActivity);
    void inject(HomeActivity homeActivity);
}

package com.lucas.contract;

import android.content.Intent;

import com.lucas.model.domain.User;

public interface MainActivityContract {

    interface View{

        void showMessage(String message);
        void nextActivity(Intent next);
        
        String getUsername();
        String getPassword();

        void setUsername();
        void setPassword();
        
        void setErrorUsername(String error);
        void setErrorPassword(String error);

        void goHomeActivity();
    }

    interface Presenter{
        void loginClicked();
        void setView(MainActivityContract.View view);

    }

    interface Model{
        void handlerLogin();
        void attachCallback(Callback callback);

        interface Callback{
            void onResultLogin(User user);
            void onErrroResultLogin(String message);
        }
    }
}

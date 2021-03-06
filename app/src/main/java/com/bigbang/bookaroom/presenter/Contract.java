package com.bigbang.bookaroom.presenter;

import com.bigbang.bookaroom.database.UserEntity;

public interface Contract {

    public interface Presenter{

        void loginUser(String userName, String userPassword);


        void signOutUser();

        UserEntity getUserInstance();

        void getGuests();
    }

    public interface View{

        void userLoginSuccess();

        void userLoginFailed();

        void userLoggedOut();

        void displayResults();
    }
}

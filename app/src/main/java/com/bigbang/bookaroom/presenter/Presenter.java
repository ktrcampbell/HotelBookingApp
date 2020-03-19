package com.bigbang.bookaroom.presenter;


import android.util.Log;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.bigbang.bookaroom.database.ReservationDB;
import com.bigbang.bookaroom.database.UserEntity;
import com.bigbang.bookaroom.view.HomeActivity;

public class Presenter implements Contract.Presenter {

    private Contract.View mainView;

    private ReservationDB reservationDB;

    private UserEntity currentUser = null;

    public Presenter(Contract.View mainView) {
        reservationDB = Room
                .databaseBuilder(((HomeActivity) mainView).getApplicationContext(),
                        ReservationDB.class,
                        "users.db"
                )
                .allowMainThreadQueries()
                .build();

    }

    @Override
    public void loginUser(String userName, String userPassword) {
        currentUser = reservationDB.getUserDAO().loginSelect(userName, userPassword);
        if(currentUser == null){
            mainView.userLoginFailed();
        }else {
            mainView.userLoginSuccess();
        }
    }

    @Override
    public void signOutUser() {

    }

    @Override
    public UserEntity getUserInstance() {
        return null;
    }

    @Override
    public void getGuests() {

    }
}


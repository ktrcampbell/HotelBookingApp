package com.bigbang.bookaroom.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.bigbang.bookaroom.model.GuestEntity;
import com.bigbang.bookaroom.model.HotelRoomEntity;

@Dao
public interface UserDAO {

    @Insert
    void addNewUser(UserEntity newUser);

    @Insert
    void addNewGuest(GuestEntity newGuest);

    @Query("SELECT * FROM User WHERE userName = :userName AND userPassword = :userPassword")
    UserEntity loginSelect(String userName, String userPassword);

    @Query("SELECT * FROM HotelRoom WHERE isAvaliable = 1")
    HotelRoomEntity displayFreeRooms();
}

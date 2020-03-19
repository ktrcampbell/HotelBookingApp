package com.bigbang.bookaroom.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface UserDAO {

    @Insert
    void addNewUser(UserEntity newUser);

    @Query("SELECT * FROM User WHERE userName = :userName AND userPassword = :userPassword")
    UserEntity loginSelect(String userName, String userPassword);

}

package com.bigbang.bookaroom.database;

import androidx.room.Dao;
import androidx.room.Insert;

import com.bigbang.bookaroom.model.GuestEntity;

@Dao
public interface GuestDAO {

    @Insert
    void addNewGuest(GuestEntity newGuest);
}

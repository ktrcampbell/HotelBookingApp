package com.bigbang.bookaroom.database;

import androidx.room.Dao;
import androidx.room.Query;

import com.bigbang.bookaroom.model.BookingsEntity;

@Dao
public interface BookingsDAO {

    @Query("SELECT * FROM Bookings WHERE isAvailable = 1")
    <List>BookingsEntity getAllBookings();
}



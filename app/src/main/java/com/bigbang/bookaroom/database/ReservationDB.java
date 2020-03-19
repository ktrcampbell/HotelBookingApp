package com.bigbang.bookaroom.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.bigbang.bookaroom.model.BookingsEntity;
import com.bigbang.bookaroom.model.GuestEntity;

@Database(version = 1, entities = {UserEntity.class, GuestEntity.class, HotelRoomEntity.class, BookingsEntity.class})
public abstract class ReservationDB extends RoomDatabase {

    public abstract UserDAO getUserDAO();

    public abstract GuestDAO getGuestDAQ();

    public abstract HotelRoomDAO getHotelRoomDAO();

    public abstract BookingsDAO getBookingsDAO();
}

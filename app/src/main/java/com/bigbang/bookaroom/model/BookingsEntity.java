package com.bigbang.bookaroom.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Query;
import androidx.room.TypeConverter;
import androidx.room.TypeConverters;

import com.bigbang.bookaroom.util.DataConverter;

import java.util.ArrayList;
import java.util.List;

@Entity(tableName = "Bookings")
public class BookingsEntity {

    private List<BookingsEntity> bookingsList;

    @TypeConverters(DataConverter.class)
    private List<BookingsEntity> getBookingsList(){
        return bookingsList;
    }

    public void setBookingsList(List<BookingsEntity> bookingsList) {
        this.bookingsList = bookingsList;
    }
}

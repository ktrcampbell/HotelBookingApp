package com.bigbang.bookaroom.util;

import android.renderscript.Type;

import androidx.room.TypeConverter;

import com.bigbang.bookaroom.model.BookingsEntity;

import java.io.Serializable;
import java.util.List;

public class DataConverter implements Serializable {

    @TypeConverter
    public static String frombookingsList(List<BookingsEntity> bookingsList) {
        if (bookingsList == null) {
            return (null);
        }
        Gson gson = new Gson();
        Type type = new TypeToken<List<BookingsEntity>>() {
        }.getType();
        String json = gson.toJson(bookingsList, type);
    }

    @TypeConverter
    public static List<BookingsEntity> tobookingsList(String bookingsListString) {
        if (bookingsListString == null) {
            return (null);
        }
        Gson gson = new Gson();
        Type type = new TypeToken<List<BookingsEntity>>() {
        }.getType();
        List<BookingsEntity> bookingsList = gson.fromJson(bookingsListString, type);
        return bookingsList;


    }
}


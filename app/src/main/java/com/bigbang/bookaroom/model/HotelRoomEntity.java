package com.bigbang.bookaroom.model;

import android.graphics.Bitmap;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.sql.Blob;

import static androidx.room.ForeignKey.CASCADE;

@Entity(tableName = "HotelRoom")
public class HotelRoomEntity {

    @PrimaryKey(autoGenerate = true)
    private long hotelRoomId;

    @ColumnInfo(name = "price")
    private int roomPrice;

    @ColumnInfo
    String imageURL;

    @ColumnInfo
    private boolean isAvaliable;

    public HotelRoomEntity(long hotelRoomId, int roomPrice, String imageURL, boolean isAvaliable) {
        this.hotelRoomId = hotelRoomId;
        this.roomPrice = roomPrice;
        this.imageURL = imageURL;
        this.isAvaliable = isAvaliable;
    }
    @Ignore
    public HotelRoomEntity(int roomPrice, String imageURL, boolean isAvaliable) {
        this.roomPrice = roomPrice;
        this.imageURL = imageURL;
        this.isAvaliable = isAvaliable;
    }

    public long getHotelRoomId() {
        return hotelRoomId;
    }

    public void setHotelRoomId(long hotelRoomId) {
        this.hotelRoomId = hotelRoomId;
    }

    public int getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(int roomPrice) {
        this.roomPrice = roomPrice;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public boolean isAvaliable() {
        return isAvaliable;
    }

    public void setAvaliable(boolean avaliable) {
        isAvaliable = avaliable;
    }

    @ForeignKey
            (entity = GuestEntity.class,
                    parentColumns = "id",
                    childColumns = "guestId",
                    onDelete = CASCADE)
    private Long guestId;

}

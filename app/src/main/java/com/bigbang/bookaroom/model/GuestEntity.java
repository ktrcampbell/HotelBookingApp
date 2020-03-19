package com.bigbang.bookaroom.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Guest")
public class GuestEntity {

    @PrimaryKey(autoGenerate = true)
    private long guestID;

    @ColumnInfo(name = "firstName")
    private String firstName;

    @ColumnInfo(name = "lastName")
    private String lastName;

    @ColumnInfo(name = "date")
    private String checkInDate;

    public GuestEntity(long guestID, String firstName, String lastName) {
        this.guestID = guestID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public GuestEntity(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getGuestID() {
        return guestID;
    }

    public void setGuestID(long guestID) {
        this.guestID = guestID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

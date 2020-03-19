package com.bigbang.bookaroom.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "User")
public class UserEntity {

    @PrimaryKey(autoGenerate = true)
    private long userID;

    @ColumnInfo(name = "userName")
    private String userName;

    @ColumnInfo(name = "userPassword")
    private String userPassword;

    public UserEntity(long userID, String userName, String userPassword) {
        this.userID = userID;
        this.userName = userName;
        this.userPassword = userPassword;
    }

    @Ignore
    public UserEntity(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}

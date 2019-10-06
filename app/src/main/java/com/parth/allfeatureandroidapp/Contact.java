package com.parth.allfeatureandroidapp;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName ="contacts")
public class Contact {

    @PrimaryKey
    private int id;

    @ColumnInfo(name ="contact_name")
    private String name;

    @ColumnInfo(name = "contact_email")
    private String email;

    public Contact(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }
}

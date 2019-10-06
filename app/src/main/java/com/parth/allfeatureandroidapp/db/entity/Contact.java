package com.parth.allfeatureandroidapp.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName ="contacts")
public class Contact {

    @ColumnInfo(name ="contact_id")
    @PrimaryKey(autoGenerate = true)
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

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

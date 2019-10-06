package com.parth.allfeatureandroidapp;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

public interface MyDao {

    @Insert
    public void addContact(Contact contact);

    @Query("select * from contacts")
    public List<Contact> getContacts();

    @Update
    public void updateContact(Contact contact);

    @Delete
    public void deteteContact(Contact contact);
}

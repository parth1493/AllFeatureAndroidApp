package com.parth.allfeatureandroidapp.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.parth.allfeatureandroidapp.db.entity.Contact;

import java.util.List;

@Dao
public interface MyDao {

    @Insert
    public long addContact(Contact contact);

    @Query("select * from contacts")
    public List<Contact> getContacts();

    @Query("select * from contacts where contact_id == :contactId")
    public Contact getContact(long contactId);

    @Update
    public void updateContact(Contact contact);

    @Delete
    public void deteteContact(Contact contact);
}

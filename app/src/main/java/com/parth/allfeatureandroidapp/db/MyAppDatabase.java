package com.parth.allfeatureandroidapp.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.parth.allfeatureandroidapp.db.entity.Contact;

@Database(entities = {Contact.class}, version = 1)

public abstract class MyAppDatabase extends RoomDatabase {

    public abstract MyDao myDao();
}

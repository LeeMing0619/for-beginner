package com.example.ali.yichang.persistence.core;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.ali.yichang.persistence.dao.DirectoryDAO;
import com.example.ali.yichang.persistence.model.DirectoryModel;

/**
 * Created by ali.azaz on 11/22/17.
 */

@Database(entities = DirectoryModel.class,version = 1)
public abstract class dbClass extends RoomDatabase {
    public abstract DirectoryDAO daoAccess();
}

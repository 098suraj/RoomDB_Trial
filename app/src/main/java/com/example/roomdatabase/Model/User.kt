package com.example.roomdatabase.Model

import android.os.Parcelable
import android.text.Editable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "user_table")
data class User(
    //this is used to declare the  type of data we want from user
    @PrimaryKey(autoGenerate = true)
    var id:Int,
    val firstName:String,
    val lastName:String,
    val age: Int
):Parcelable

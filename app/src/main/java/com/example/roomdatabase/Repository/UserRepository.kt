package com.example.roomdatabase.Repository

import androidx.lifecycle.LiveData
import com.example.roomdatabase.Model.User
import com.example.roomdatabase.data.UserDao

class UserRepository(private val userDao: UserDao) {
    val readAllData:LiveData<List<User>> = userDao.readAllData()
    suspend fun addUser(user: User){
        userDao.addUser(user)
    }
    suspend fun updateUser(user: User){
        userDao.updateUser(user)
    }
    fun deleteUser(user: User){
        userDao.deleteUser(user)
    }
    suspend fun deleteAllUser(){
        userDao.deleteAllUser()
    }
}
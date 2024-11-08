package com.adarkeser.adarhw1.data

import android.content.Context
import com.adarkeser.adarhw1.R
import com.adarkeser.adarhw1.model.User

class DataSource(val context: Context) {
    fun getUserNamesList(): Array<String>{
        return context.resources.getStringArray(R.array.cartoon_name_array)
    }
    fun getUserAddressList(): Array<String>{
        return context.resources.getStringArray(R.array.description_array)
    }
    fun getUserProfileList(): Array<String>{
        return context.resources.getStringArray(R.array.funfact_array)
    }

    fun loadUsers(): List<User>{
        val namesList = getUserNamesList()
        val addressList = getUserAddressList()
        val profileList  = getUserProfileList()

        val users = mutableListOf<User>()
        for (i in namesList.indices){
            users.add(User(namesList[i], address = addressList[i], profileDesc = profileList[i]))
        }
        return users
    }
}
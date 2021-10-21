package com.mepark.mybinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DataViewModel :ViewModel() {

    var name = MutableLiveData<String>("Hello!")

    fun setValue(msg : String){
        name.value = msg
    }
}
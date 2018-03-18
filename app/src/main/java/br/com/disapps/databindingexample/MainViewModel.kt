package br.com.disapps.databindingexample

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.view.View

/**
 * Created by diefferson on 31/10/17.
 **/
class MainViewModel: ViewModel(){

    val value1 = MutableLiveData<Int>().apply { value = 0 }
    val value2 = MutableLiveData<Int>().apply { value = 0 }

    fun addValue1(view : View){
       value1.value = value1.value?.plus(1)
    }

    fun addValue2(view : View){
        value2.value = value2.value?.plus(1)
    }

    fun reset(view : View){
        value1.value = 0
        value2.value = 0
    }
}
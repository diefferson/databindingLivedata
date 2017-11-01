package br.com.disapps.databindingexample

import android.arch.lifecycle.ViewModel

/**
 * Created by diefferson on 31/10/17.
 **/
class MainViewModel: ViewModel(){

    var data = Data()

    fun addvalue1(){
        data.value1++
    }

    fun addValue2(){
       data.value2++
    }

    fun reset(){
        data.value1 = 0
        data.value2 = 0
    }
}
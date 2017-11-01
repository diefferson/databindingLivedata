package br.com.disapps.databindingexample

import android.databinding.BaseObservable
import android.databinding.Bindable

/**
 * Created by diefferson on 01/11/17.
 */

class Data : BaseObservable(){

    var value1: Int = 0
        @Bindable get
        set(value){
            field = value
            notifyPropertyChanged(BR.value1)
        }

    var value2: Int = 0
        @Bindable get
        set(value){
            field = value
            notifyPropertyChanged(BR.value2)
        }

}

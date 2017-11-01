package br.com.disapps.databindingexample

import android.databinding.BindingAdapter
import android.support.annotation.NonNull
import android.widget.TextView

/**
 * Created by diefferson on 01/11/17.
 */
object BindingAdapter{

    @BindingAdapter("android:text")
    @JvmStatic
    fun setIntToText(@NonNull textView: TextView, @NonNull value: Int){
        textView.text = value.toString()
    }

}

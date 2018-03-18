package br.com.disapps.databindingexample

import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.disapps.databindingexample.databinding.ActivityMainBinding
import android.databinding.DataBindingUtil.setContentView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding? = setContentView(this, R.layout.activity_main)
        val viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        binding?.let {
            it.viewModel = viewModel
            it.setLifecycleOwner(this)
        }

    }
}

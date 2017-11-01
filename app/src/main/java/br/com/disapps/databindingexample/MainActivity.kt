package br.com.disapps.databindingexample

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.disapps.databindingexample.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        DataBindingUtil.bind<ActivityMainBinding>(viewRoot)
    }

    private val viewModel: MainViewModel by lazy {
        ViewModelProviders.of(this).get(MainViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding.data = viewModel.data

        button1.setOnClickListener { viewModel.addvalue1() }
        button2.setOnClickListener { viewModel.addValue2() }
        button3.setOnClickListener { viewModel.reset() }
    }
}

package com.mepark.mybinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.mepark.mybinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    private val viewModel: DataViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this
        //viewModel = ViewModelProvider(this).get(DataViewModel::class.java)

        binding.vm = viewModel

        supportFragmentManager.beginTransaction().replace(R.id.frameImage, MyFragment()).commit()
        supportFragmentManager.beginTransaction().replace(R.id.frameList, ListFragment()).commit()
    }

    fun submit(view : View){

        viewModel.setValue("")
        Toast.makeText(this, "Text is reset. Please enter new character", Toast.LENGTH_LONG).show()
    }
}

package com.aryan.uselessapp

import android.app.Application
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory
import androidx.lifecycle.ViewModelProviders
import com.aryan.uselessapp.databinding.FragmentMainBinding


class Main_Fragment : Fragment() {

    private lateinit var viewModel: MainViewModel

    private lateinit var binding : FragmentMainBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentMainBinding>(inflater,
            R.layout.fragment_main_,container,false)


        Log.i("MainFragment","Called ViewModelProvider")


        //viewModel = ViewModelProvider(this).get(MainViewModel::class.java)\


        viewModel = ViewModelProviders.of(this,MainViewModelFactory(Application())).get(MainViewModel::class.java)

        binding.btPlus.setOnClickListener {
            viewModel.countAdd()
            binding.tvNumber.text = viewModel.count.toString()
        }

        binding.btMinus.setOnClickListener {
            viewModel.countMinus()
            binding.tvNumber.text = viewModel.count.toString()
        }

        
        //viewModel.count.observe(viewLifecycleOwner, Observer { newCount ->
            //binding.tvNumber.text = newCount.toString()
       // })

        return binding.root
    }


}
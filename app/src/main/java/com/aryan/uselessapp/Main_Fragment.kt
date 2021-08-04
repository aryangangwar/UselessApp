package com.aryan.uselessapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.aryan.uselessapp.databinding.FragmentMainBinding
import com.aryan.uselessapp.databinding.FragmentTitleBinding


class Main_Fragment : Fragment() {

    private lateinit var viewModel: MainViewModel

    var score = 0

    private lateinit var binding : FragmentMainBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentMainBinding>(inflater,
            R.layout.fragment_main_,container,false)


        Log.i("MainFragment","Called ViewModelProvider")
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.btPlus.setOnClickListener {
            viewModel.countAdd()
            binding.tvNumber.text = viewModel.count.toString()
        }

        binding.btMinus.setOnClickListener {
            viewModel.countMinus()
            binding.tvNumber.text = viewModel.count.toString()
        }
        return binding.root
    }


}
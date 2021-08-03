package com.aryan.uselessapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.aryan.uselessapp.databinding.FragmentTitleBinding


class Title_Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater,
            R.layout.fragment_title,container,false)

        binding.btStart.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_title_Fragment_to_main_Fragment)
        }

        return binding.root
    }
}
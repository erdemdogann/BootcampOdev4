package com.example.bootcampodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.bootcampodev4.databinding.ActivityMainBinding
import com.example.bootcampodev4.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)

        binding.pageA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.pageMaintoPageA)
        }
        binding.pageX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.pageMaintoPageX)
        }

        return binding.root
    }

}